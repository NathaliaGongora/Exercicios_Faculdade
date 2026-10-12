# Consultas SQL

Resolucoes de listas de SQL usando SQL Server.

| Arquivo | Atividade | Descricao |
|---|---|---|
| [Aula07_VendasED_Lista01.sql](Aula07_VendasED_Lista01.sql) | VendasED - Lista 01 | 12 consultas sobre clientes: filtros, valores nulos, contagem, ordenacao, agrupamento, maior e menor codigo |
| [Aula08_VendasED_Lista02.sql](Aula08_VendasED_Lista02.sql) | VendasED - Lista 02 | 10 exercicios de `INSERT`, `UPDATE`, `DELETE`, `ALTER TABLE` e `SELECT`, incluindo compra de produtos, filtros com `LIKE` e calculo de desconto |

## Como executar

1. Execute o script do banco `VendasED` fornecido para a aula.
2. Abra o arquivo da lista no SQL Server Management Studio e execute os comandos.
3. A Lista 02 altera e exclui dados; use uma copia do banco para praticar. O primeiro exercicio cadastra uma compra e deve ser executado apenas uma vez.

Na Lista 02, os exercicios 05 e 06 foram separados: primeiro a coluna `numero` e preenchida com o numero que esta no fim de `endereco`; depois esse trecho e retirado de `endereco`. O exercicio 09 interpreta o campo `desconto` como o valor total do item (quantidade vezes valor unitario) menos R$ 0,10.

Observacao: o script fornecido para o banco tem uma virgula sobrando depois da coluna `estado` na tabela `Cliente`. Remova essa virgula antes de executar; caso contrario, o comando `CREATE TABLE` falha. O arquivo tambem exclui e recria o banco `VendasED` quando ja existe, apagando os dados anteriores.
