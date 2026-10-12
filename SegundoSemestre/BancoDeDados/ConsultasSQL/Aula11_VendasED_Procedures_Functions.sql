USE VendasED;
GO

-- Exercicio 01: criar uma procedure que mostra a tabuada de um numero.
CREATE PROCEDURE dbo.usp_Tabuada
    @num int
AS
BEGIN
    DECLARE @i int = 1;

    WHILE @i <= 10
    BEGIN
        PRINT CAST(@num AS varchar(10)) + ' X '
            + CAST(@i AS varchar(10)) + ' = '
            + CAST((@num * @i) AS varchar(10));

        SET @i = @i + 1;
    END;
END;
GO

-- Exercicio 02: listar os clientes de uma cidade informada.
CREATE PROCEDURE dbo.usp_ClientesPorCidade
    @cidade varchar(30)
AS
BEGIN
    SELECT cod_cliente, nome, telefone, email, endereco, bairro, cidade, estado
    FROM Cliente
    WHERE cidade = @cidade;
END;
GO

-- Exercicio 03: listar os pedidos de um cliente e a condicao de pagamento.
CREATE PROCEDURE dbo.usp_PedidosDoCliente
    @cod_cliente int
AS
BEGIN
    SELECT P.cod_pedido, P.data, CP.nome AS condicao_pagamento
    FROM Pedido AS P
    INNER JOIN Condicao_Pagamento AS CP
        ON CP.cod_condicao_pagto = P.cod_condicao_pagto
    WHERE P.cod_cliente = @cod_cliente
    ORDER BY P.data;
END;
GO

-- Exercicio 04: mostrar a quantidade de vendas e o total vendido pelo vendedor.
CREATE PROCEDURE dbo.usp_ResumoVendasVendedor
    @cod_vendedor int
AS
BEGIN
    SELECT V.cod_vendedor, V.nome,
           COUNT(DISTINCT P.cod_pedido) AS quantidade_vendas,
           COALESCE(SUM(IP.quantidade * IP.valor), 0) AS total_vendido
    FROM Vendedor AS V
    LEFT JOIN Pedido AS P ON P.cod_vendedor = V.cod_vendedor
    LEFT JOIN Item_Pedido AS IP ON IP.cod_pedido = P.cod_pedido
    WHERE V.cod_vendedor = @cod_vendedor
    GROUP BY V.cod_vendedor, V.nome;
END;
GO

-- Exercicio 05: atualizar o telefone de um cliente usando IF.
CREATE PROCEDURE dbo.usp_AtualizarTelefoneCliente
    @cod_cliente int,
    @telefone varchar(15)
AS
BEGIN
    IF EXISTS (SELECT 1 FROM Cliente WHERE cod_cliente = @cod_cliente)
    BEGIN
        UPDATE Cliente
        SET telefone = @telefone
        WHERE cod_cliente = @cod_cliente;

        PRINT 'Telefone atualizado.';
    END
    ELSE
    BEGIN
        PRINT 'Cliente nao encontrado.';
    END;
END;
GO

-- Exercicio 06: funcao escalar que calcula a idade considerando o aniversario.
CREATE FUNCTION dbo.fn_Idade
(
    @dataNascimento date
)
RETURNS int
AS
BEGIN
    DECLARE @idade int;

    SET @idade = DATEDIFF(YEAR, @dataNascimento, GETDATE());

    IF MONTH(@dataNascimento) > MONTH(GETDATE())
       OR (MONTH(@dataNascimento) = MONTH(GETDATE())
           AND DAY(@dataNascimento) > DAY(GETDATE()))
        SET @idade = @idade - 1;

    RETURN @idade;
END;
GO

-- Exercicio 07: funcao escalar com o total gasto por um cliente.
CREATE FUNCTION dbo.fn_TotalGastoCliente
(
    @cod_cliente int
)
RETURNS numeric(12,2)
AS
BEGIN
    DECLARE @total numeric(12,2);

    SELECT @total = COALESCE(SUM(IP.quantidade * IP.valor), 0)
    FROM Pedido AS P
    INNER JOIN Item_Pedido AS IP ON IP.cod_pedido = P.cod_pedido
    WHERE P.cod_cliente = @cod_cliente;

    RETURN @total;
END;
GO

-- Exercicio 08: funcao escalar que conta os pedidos de um cliente.
CREATE FUNCTION dbo.fn_QuantidadePedidosCliente
(
    @cod_cliente int
)
RETURNS int
AS
BEGIN
    DECLARE @quantidade int;

    SELECT @quantidade = COUNT(*)
    FROM Pedido
    WHERE cod_cliente = @cod_cliente;

    RETURN @quantidade;
END;
GO

-- Exercicio 09: funcao inline que lista os produtos de uma marca.
CREATE FUNCTION dbo.fn_ProdutosPorMarca
(
    @nome_marca varchar(50)
)
RETURNS TABLE
AS
RETURN
(
    SELECT P.cod_produto, P.nome AS produto, P.descricao,
           M.nome AS marca
    FROM Produto AS P
    INNER JOIN Marca AS M ON M.cod_marca = P.cod_marca
    WHERE M.nome = @nome_marca
);
GO

-- Exercicio 10: funcao multi-statement com estoque e situacao do produto.
-- O estoque e calculado com compras menos vendas; saldo negativo fica em zero.
CREATE FUNCTION dbo.fn_EstoquePorSituacao
(
    @quantidadeMinima int
)
RETURNS @TabelaEstoque TABLE
(
    cod_produto int PRIMARY KEY,
    nome varchar(50),
    quantidade_estoque int,
    situacao varchar(20)
)
AS
BEGIN
    ;WITH Entradas AS
    (
        SELECT cod_produto, SUM(quantidade) AS quantidade_comprada
        FROM Item_Compra
        GROUP BY cod_produto
    ),
    Saidas AS
    (
        SELECT cod_produto, SUM(quantidade) AS quantidade_vendida
        FROM Item_Pedido
        GROUP BY cod_produto
    )
    INSERT INTO @TabelaEstoque (cod_produto, nome, quantidade_estoque, situacao)
    SELECT P.cod_produto, P.nome,
           CASE
               WHEN COALESCE(E.quantidade_comprada, 0)
                    - COALESCE(S.quantidade_vendida, 0) < 0 THEN 0
               ELSE COALESCE(E.quantidade_comprada, 0)
                    - COALESCE(S.quantidade_vendida, 0)
           END AS quantidade_estoque,
           CASE
               WHEN COALESCE(E.quantidade_comprada, 0)
                    - COALESCE(S.quantidade_vendida, 0) < @quantidadeMinima
                   THEN 'Estoque baixo'
               ELSE 'Estoque ok'
           END AS situacao
    FROM Produto AS P
    LEFT JOIN Entradas AS E ON E.cod_produto = P.cod_produto
    LEFT JOIN Saidas AS S ON S.cod_produto = P.cod_produto;

    RETURN;
END;
GO

-- Exemplos de execucao das procedures e funcoes:
-- EXEC dbo.usp_Tabuada 7;
-- EXEC dbo.usp_ClientesPorCidade 'Sorocaba';
-- EXEC dbo.usp_PedidosDoCliente 1;
-- EXEC dbo.usp_ResumoVendasVendedor 1;
-- EXEC dbo.usp_AtualizarTelefoneCliente 1, '(15)99999-9999';
-- SELECT dbo.fn_Idade('1982-11-30') AS idade;
-- SELECT dbo.fn_TotalGastoCliente(1) AS total_gasto;
-- SELECT dbo.fn_QuantidadePedidosCliente(1) AS quantidade_pedidos;
-- SELECT * FROM dbo.fn_ProdutosPorMarca('Bic');
-- SELECT * FROM dbo.fn_EstoquePorSituacao(10);
