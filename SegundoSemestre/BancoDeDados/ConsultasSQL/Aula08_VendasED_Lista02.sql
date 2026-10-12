USE VendasED;
GO

-- Exercicio 01: cadastrar fornecedor, marca, produto e compra de 50 lousas.
-- Execute este bloco apenas uma vez para nao duplicar a compra.
DECLARE @cod_marca int;
DECLARE @cod_produto int;
DECLARE @cod_fornecedor int;
DECLARE @cod_condicao_pagto int;
DECLARE @cod_compra int;

IF NOT EXISTS (SELECT 1 FROM Marca WHERE nome = 'Board Master')
    INSERT INTO Marca (nome) VALUES ('Board Master');

SELECT @cod_marca = cod_marca
FROM Marca
WHERE nome = 'Board Master';

IF NOT EXISTS (
    SELECT 1 FROM Produto
    WHERE nome = 'lousa' AND cod_marca = @cod_marca
)
    INSERT INTO Produto (nome, descricao, cod_marca)
    VALUES ('lousa', 'Marca Board Master', @cod_marca);

SELECT @cod_produto = cod_produto
FROM Produto
WHERE nome = 'lousa' AND cod_marca = @cod_marca;

IF NOT EXISTS (SELECT 1 FROM Fornecedor WHERE cpf = '222.333.444')
    INSERT INTO Fornecedor (cpf, nome, telefone)
    VALUES ('222.333.444', 'Maria Joaquina', '(15)321-456');

SELECT @cod_fornecedor = cod_fornecedor
FROM Fornecedor
WHERE cpf = '222.333.444';

SELECT @cod_condicao_pagto = cod_condicao_pagto
FROM Condicao_Pagamento
WHERE nome = 'Dinheiro';

IF NOT EXISTS (
    SELECT 1 FROM Produto_Fornecedor
    WHERE cod_produto = @cod_produto
      AND cod_fornecedor = @cod_fornecedor
      AND valor = 15.70
)
    INSERT INTO Produto_Fornecedor (cod_produto, cod_fornecedor, valor)
    VALUES (@cod_produto, @cod_fornecedor, 15.70);

INSERT INTO Compra (cod_fornecedor, cod_condicao_pagto, data)
VALUES (@cod_fornecedor, @cod_condicao_pagto, GETDATE());

SET @cod_compra = SCOPE_IDENTITY();

INSERT INTO Item_Compra (cod_compra, cod_produto, quantidade, valor)
VALUES (@cod_compra, @cod_produto, 50, 15.70);
GO

-- Exercicio 02: excluir os pedidos de Rafael Moreno e seus itens.
DELETE IP
FROM Item_Pedido AS IP
INNER JOIN Pedido AS P ON P.cod_pedido = IP.cod_pedido
INNER JOIN Cliente AS C ON C.cod_cliente = P.cod_cliente
WHERE UPPER(C.nome) = 'RAFAEL MORENO';

DELETE P
FROM Pedido AS P
INNER JOIN Cliente AS C ON C.cod_cliente = P.cod_cliente
WHERE UPPER(C.nome) = 'RAFAEL MORENO';
GO

-- Exercicio 03: alterar para 20 a quantidade do caderno no pedido 4.
UPDATE IP
SET quantidade = 20
FROM Item_Pedido AS IP
INNER JOIN Produto AS P ON P.cod_produto = IP.cod_produto
WHERE IP.cod_pedido = 4
  AND P.nome = 'caderno';
GO

-- Exercicio 04: atualizar o telefone do fornecedor Joaquim da Silva.
UPDATE Fornecedor
SET telefone = '2344-8527'
WHERE nome = 'Joaquim Silva';
GO

-- Exercicio 05: criar a coluna numero e separar o numero do endereco.
ALTER TABLE Cliente
ADD numero varchar(100) NULL;

UPDATE Cliente
SET numero = TRIM(SUBSTRING(endereco, CHARINDEX(',', endereco) + 1, LEN(endereco)))
WHERE endereco IS NOT NULL
  AND CHARINDEX(',', endereco) > 0;
GO

-- Exercicio 06: remover o numero da casa do campo endereco.
-- Os numeros ja estao guardados na coluna Cliente.numero.
UPDATE Cliente
SET endereco = TRIM(SUBSTRING(endereco, 0, CHARINDEX(',', endereco)))
WHERE endereco IS NOT NULL
  AND CHARINDEX(',', endereco) > 0;
GO

-- Exercicio 07: produtos caneta com quantidade fornecida entre 5 e 10.
SELECT P.nome, IC.quantidade, IC.valor
FROM Item_Compra AS IC
INNER JOIN Produto AS P ON P.cod_produto = IC.cod_produto
WHERE IC.quantidade BETWEEN 5 AND 10
  AND P.nome = 'caneta';
GO

-- Exercicio 08: clientes cujo nome comeca com R e a segunda letra nao e A.
SELECT *
FROM Cliente
WHERE nome LIKE 'R[^A]%';
GO

-- Exercicio 09: itens comprados da BlaBla Ltda com pagamento em cheque.
-- O campo desconto mostra o valor total do item depois de descontar R$ 0,10.
SELECT F.razao, CP.nome AS condicao_pagamento,
       P.nome AS produto, IC.quantidade, IC.valor,
       CAST((IC.quantidade * IC.valor) - 0.10 AS numeric(10,2)) AS desconto
FROM Compra AS C
INNER JOIN Fornecedor AS F ON F.cod_fornecedor = C.cod_fornecedor
INNER JOIN Condicao_Pagamento AS CP ON CP.cod_condicao_pagto = C.cod_condicao_pagto
INNER JOIN Item_Compra AS IC ON IC.cod_compra = C.cod_compra
INNER JOIN Produto AS P ON P.cod_produto = IC.cod_produto
WHERE F.razao = 'BlaBla Ltda'
  AND CP.nome = 'Cheque';
GO

-- Exercicio 10: clientes cujo nome nao comeca com letras de A ate R.
SELECT *
FROM Cliente
WHERE nome NOT LIKE '[A-R]%';
GO
