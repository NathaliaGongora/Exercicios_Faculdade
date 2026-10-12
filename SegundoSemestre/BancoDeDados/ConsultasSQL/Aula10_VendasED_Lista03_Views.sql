USE VendasED;
GO

-- Exercicio 01: produtos que ainda nao aparecem em pedidos de clientes.
CREATE VIEW dbo.vw_ProdutosNaoComprados AS
SELECT P.cod_produto, P.nome, P.descricao, P.cod_marca
FROM Produto AS P
WHERE NOT EXISTS (
    SELECT 1
    FROM Item_Pedido AS IP
    WHERE IP.cod_produto = P.cod_produto
);
GO

-- Exercicio 02: clientes sem endereco cadastrado.
CREATE VIEW dbo.vw_ClientesSemEndereco AS
SELECT C.*
FROM Cliente AS C
WHERE C.endereco IS NULL
   OR LTRIM(RTRIM(C.endereco)) = '';
GO

-- Exercicio 03: quantidade de pedidos por cliente pagos em dinheiro.
CREATE VIEW dbo.vw_PedidosDinheiroPorCliente AS
SELECT C.cod_cliente, C.nome,
       COUNT(DISTINCT P.cod_pedido) AS quantidade_pedidos
FROM Cliente AS C
INNER JOIN Pedido AS P ON P.cod_cliente = C.cod_cliente
INNER JOIN Condicao_Pagamento AS CP
    ON CP.cod_condicao_pagto = P.cod_condicao_pagto
WHERE UPPER(CP.nome) = 'DINHEIRO'
GROUP BY C.cod_cliente, C.nome;
GO

-- Exercicio 04: total gasto por Edson com canetas da marca Bic.
CREATE VIEW dbo.vw_GastoEdsonCanetaBic AS
SELECT C.cod_cliente, C.nome,
       SUM(IP.quantidade * IP.valor) AS total_gasto
FROM Cliente AS C
INNER JOIN Pedido AS P ON P.cod_cliente = C.cod_cliente
INNER JOIN Item_Pedido AS IP ON IP.cod_pedido = P.cod_pedido
INNER JOIN Produto AS PR ON PR.cod_produto = IP.cod_produto
INNER JOIN Marca AS M ON M.cod_marca = PR.cod_marca
WHERE UPPER(C.nome) LIKE 'EDSON%'
  AND UPPER(PR.nome) = 'CANETA'
  AND UPPER(M.nome) = 'BIC'
GROUP BY C.cod_cliente, C.nome;
GO

-- Exercicio 05: quantidade de pedidos (vendas) realizados por vendedor.
CREATE VIEW dbo.vw_VendasPorVendedor AS
SELECT V.cod_vendedor, V.nome,
       COUNT(P.cod_pedido) AS quantidade_vendas
FROM Vendedor AS V
LEFT JOIN Pedido AS P ON P.cod_vendedor = V.cod_vendedor
GROUP BY V.cod_vendedor, V.nome;
GO

-- Exercicio 06: valor total vendido por condicao de pagamento.
CREATE VIEW dbo.vw_TotalVendidoPorCondicao AS
SELECT CP.cod_condicao_pagto, CP.nome AS condicao_pagamento,
       COALESCE(SUM(IP.quantidade * IP.valor), 0) AS total_vendido
FROM Condicao_Pagamento AS CP
LEFT JOIN Pedido AS P ON P.cod_condicao_pagto = CP.cod_condicao_pagto
LEFT JOIN Item_Pedido AS IP ON IP.cod_pedido = P.cod_pedido
GROUP BY CP.cod_condicao_pagto, CP.nome;
GO

-- Exercicio 07: marcas sem produtos associados a fornecedores.
CREATE VIEW dbo.vw_MarcasNaoFornecidas AS
SELECT M.cod_marca, M.nome
FROM Marca AS M
WHERE NOT EXISTS (
    SELECT 1
    FROM Produto AS P
    INNER JOIN Produto_Fornecedor AS PF
        ON PF.cod_produto = P.cod_produto
    WHERE P.cod_marca = M.cod_marca
);
GO

-- Exercicio 08: produtos pedidos por clientes, mas sem fornecedor cadastrado.
CREATE VIEW dbo.vw_ProdutosCompradosNaoFornecidos AS
SELECT DISTINCT P.cod_produto, P.nome, P.descricao, P.cod_marca
FROM Produto AS P
INNER JOIN Item_Pedido AS IP ON IP.cod_produto = P.cod_produto
WHERE NOT EXISTS (
    SELECT 1
    FROM Produto_Fornecedor AS PF
    WHERE PF.cod_produto = P.cod_produto
);
GO

-- Exercicio 09: compras de fornecedores realizadas em abril de 2024.
CREATE VIEW dbo.vw_ComprasAbril2024 AS
SELECT C.cod_compra, C.data, F.cod_fornecedor,
       F.nome AS fornecedor, F.razao,
       CP.nome AS condicao_pagamento
FROM Compra AS C
INNER JOIN Fornecedor AS F ON F.cod_fornecedor = C.cod_fornecedor
INNER JOIN Condicao_Pagamento AS CP
    ON CP.cod_condicao_pagto = C.cod_condicao_pagto
WHERE C.data >= '20240401'
  AND C.data < '20240501';
GO

-- Exercicio 10: estoque calculado por produto, sem exibir saldo negativo.
-- Entradas = itens de compra; saidas = itens de pedidos de clientes.
CREATE VIEW dbo.vw_EstoqueAtual AS
WITH Entradas AS (
    SELECT cod_produto, SUM(quantidade) AS quantidade_comprada
    FROM Item_Compra
    GROUP BY cod_produto
),
Saidas AS (
    SELECT cod_produto, SUM(quantidade) AS quantidade_vendida
    FROM Item_Pedido
    GROUP BY cod_produto
)
SELECT P.cod_produto, P.nome,
       CASE
           WHEN COALESCE(E.quantidade_comprada, 0)
                - COALESCE(S.quantidade_vendida, 0) < 0 THEN 0
           ELSE COALESCE(E.quantidade_comprada, 0)
                - COALESCE(S.quantidade_vendida, 0)
       END AS quantidade_estoque
FROM Produto AS P
LEFT JOIN Entradas AS E ON E.cod_produto = P.cod_produto
LEFT JOIN Saidas AS S ON S.cod_produto = P.cod_produto;
GO

-- Para consultar os resultados, use por exemplo:
-- SELECT * FROM dbo.vw_ProdutosNaoComprados;
-- SELECT * FROM dbo.vw_ClientesSemEndereco;
-- SELECT * FROM dbo.vw_PedidosDinheiroPorCliente;
-- SELECT * FROM dbo.vw_GastoEdsonCanetaBic;
-- SELECT * FROM dbo.vw_VendasPorVendedor;
-- SELECT * FROM dbo.vw_TotalVendidoPorCondicao;
-- SELECT * FROM dbo.vw_MarcasNaoFornecidas;
-- SELECT * FROM dbo.vw_ProdutosCompradosNaoFornecidos;
-- SELECT * FROM dbo.vw_ComprasAbril2024;
-- SELECT * FROM dbo.vw_EstoqueAtual;
