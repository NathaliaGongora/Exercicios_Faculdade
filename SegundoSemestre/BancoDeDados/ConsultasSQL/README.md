# Consultas SQL

Resolucoes de listas de SQL usando SQL Server.

| Arquivo | Atividade | Descricao |
|---|---|---|
| [Aula07_VendasED_Lista01.sql](Aula07_VendasED_Lista01.sql) | VendasED - Lista 01 | 12 consultas sobre clientes: filtros, valores nulos, contagem, ordenacao, agrupamento, maior e menor codigo |
| [Aula08_VendasED_Lista02.sql](Aula08_VendasED_Lista02.sql) | VendasED - Lista 02 | 10 exercicios de `INSERT`, `UPDATE`, `DELETE`, `ALTER TABLE` e `SELECT`, incluindo compra de produtos, filtros com `LIKE` e calculo de desconto |
| [Aula10_VendasED_Lista03_Views.sql](Aula10_VendasED_Lista03_Views.sql) | VendasED - Lista 03 | 10 views com `JOIN`, `NOT EXISTS`, `GROUP BY`, operacoes de conjuntos e calculo de estoque |
| [Aula11_VendasED_Procedures_Functions.sql](Aula11_VendasED_Procedures_Functions.sql) | Aula 11 - Procedures e Functions | 10 exercicios praticos baseados na aula: procedures, variaveis, `IF`, `WHILE`, funcoes escalares e funcoes que retornam tabelas |

## Como executar

1. Execute o script do banco `VendasED` fornecido para a aula.
2. Abra o arquivo da lista no SQL Server Management Studio e execute os comandos.
3. A Lista 02 altera e exclui dados; use uma copia do banco para praticar. O primeiro exercicio cadastra uma compra e deve ser executado apenas uma vez.
4. Execute o script da Lista 03 uma vez para criar as views; depois consulte cada resultado com `SELECT * FROM dbo.nome_da_view`.
5. A Aula 11 nao traz uma lista de exercicios nos slides; o arquivo inclui 10 exercicios praticos montados a partir dos exemplos da aula. Execute o script uma vez para criar os objetos. Os exemplos de chamada estao comentados no final do arquivo.

Na Lista 02, os exercicios 05 e 06 foram separados: primeiro a coluna `numero` e preenchida com o numero que esta no fim de `endereco`; depois esse trecho e retirado de `endereco`, usando `TRIM` e `SUBSTRING`. O exercicio 09 interpreta o campo `desconto` como o valor total do item (quantidade vezes valor unitario) menos R$ 0,10.

Na Lista 03, o estoque foi calculado com os dados disponiveis: quantidade recebida em `Item_Compra` menos quantidade vendida em `Item_Pedido`; saldos negativos aparecem como zero. A consulta de abril considera as compras de fornecedores registradas em `Compra` entre 1 e 30 de abril de 2024. Como o banco nao tem uma coluna de estoque nem um historico de movimentacao, essa view e uma estimativa baseada nesses registros.

Na Aula 11, a funcao de estoque tambem usa a diferenca entre itens de compra e de pedido, pois o modelo nao registra o saldo diretamente. A procedure de atualizacao de telefone altera o cliente informado; teste em uma copia do banco.

Observacao: o script fornecido para o banco tem uma virgula sobrando depois da coluna `estado` na tabela `Cliente`. Remova essa virgula antes de executar; caso contrario, o comando `CREATE TABLE` falha. O arquivo tambem exclui e recria o banco `VendasED` quando ja existe, apagando os dados anteriores.
