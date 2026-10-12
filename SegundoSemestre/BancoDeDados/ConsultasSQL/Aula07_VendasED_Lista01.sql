USE VendasED;
GO

-- Exercicio 01: todos os clientes.
SELECT *
FROM Cliente;
GO

-- Exercicio 02: clientes de Votorantim.
SELECT *
FROM Cliente
WHERE UPPER(cidade) = 'VOTORANTIM';
GO

-- Exercicio 03: clientes do sexo masculino de Sorocaba.
SELECT *
FROM Cliente
WHERE UPPER(sexo) = 'M'
  AND UPPER(cidade) = 'SOROCABA';
GO

-- Exercicio 04: clientes do sexo feminino sem e-mail cadastrado.
SELECT *
FROM Cliente
WHERE UPPER(sexo) = 'F'
  AND NULLIF(LTRIM(RTRIM(email)), '') IS NULL;
GO

-- Exercicio 05: clientes sem telefone cadastrado.
SELECT nome, rg, cpf, telefone
FROM Cliente
WHERE telefone IS NULL
   OR LTRIM(RTRIM(telefone)) = '';
GO

-- Exercicio 06: quantidade de clientes mulheres.
SELECT COUNT(*) AS quantidade_mulheres
FROM Cliente
WHERE UPPER(sexo) = 'F';
GO

-- Exercicio 07: nomes dos clientes em ordem alfabetica.
SELECT nome
FROM Cliente
ORDER BY nome ASC;
GO

-- Exercicio 08: clientes do sexo feminino da Rua Orlando Alvagenga.
SELECT nome, telefone, email, endereco
FROM Cliente
WHERE UPPER(sexo) = 'F'
  AND UPPER(endereco) LIKE 'RUA ORLANDO ALVAGENGA%';
GO

-- Exercicio 09: maior codigo de cliente cadastrado.
SELECT MAX(cod_cliente) AS maior_cod_cliente
FROM Cliente;
GO

-- Exercicio 10: menor codigo de cliente cadastrado.
SELECT MIN(cod_cliente) AS menor_cod_cliente
FROM Cliente;
GO

-- Exercicio 11: quantidade de clientes por cidade.
SELECT cidade, COUNT(*) AS quantidade_clientes
FROM Cliente
GROUP BY cidade
ORDER BY cidade ASC;
GO

-- Exercicio 12: quantidade por cidade, sexo e estado, sem valores nulos.
SELECT cidade, sexo, estado, COUNT(*) AS quantidade_clientes
FROM Cliente
WHERE cidade IS NOT NULL
  AND sexo IS NOT NULL
  AND estado IS NOT NULL
GROUP BY cidade, sexo, estado
ORDER BY cidade ASC;
GO
