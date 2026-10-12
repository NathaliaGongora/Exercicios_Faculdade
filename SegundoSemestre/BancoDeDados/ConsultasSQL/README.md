# Consultas SQL

Resolucoes de listas de consulta com `SELECT` usando SQL Server.

| Arquivo | Atividade | Descricao |
|---|---|---|
| [Aula07_VendasED_Lista01.sql](Aula07_VendasED_Lista01.sql) | VendasED - Lista 01 | 12 consultas sobre clientes: filtros, valores nulos, contagem, ordenacao, agrupamento, maior e menor codigo |

## Como executar

1. Execute o script do banco `VendasED` fornecido para a aula.
2. Abra o arquivo da lista no SQL Server Management Studio e execute as consultas.

Observacao: o script fornecido para o banco tem uma virgula sobrando depois da coluna `estado` na tabela `Cliente`. Remova essa virgula antes de executar; caso contrario, o comando `CREATE TABLE` falha. O arquivo tambem exclui e recria o banco `VendasED` quando ja existe, apagando os dados anteriores.
