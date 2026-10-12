# Exercicio 09 - Sistema bancario

O modelo permite contas conjuntas e que um cliente possua contas em agencias diferentes. O numero da conta e chave primaria global, sem depender do codigo da agencia. A senha fica ligada ao cliente, assim cada titular usa sua propria senha mesmo quando a conta e conjunta. No banco, a senha deve ser armazenada como hash, nunca em texto puro.

O saldo inicial da conta e zero, portanto nao e necessario um deposito na abertura. Creditos e debitos sao registrados em `Movimentacao`; o campo `tipo` usa `C` para credito e `D` para debito. O sistema deve atualizar o saldo junto com cada movimentacao.

Script SQL Server: [Exercicio09.sql](Exercicio09.sql).

## DER

![DER do sistema bancario](Exercicio09_DER.png)

```mermaid
erDiagram
    AGENCIA ||--o{ CONTA : mantem
    CLIENTE ||--o{ TITULARIDADE : possui
    CONTA ||--|{ TITULARIDADE : pertence
    CONTA ||--o{ MOVIMENTACAO : registra

    AGENCIA {
        int cod_agencia PK
        string nome
    }
    CLIENTE {
        int cod_cliente PK
        string nome
        string CPF UK
        string telefone
        string senha_hash
    }
    CONTA {
        string numero_conta PK
        int cod_agencia FK
        date data_abertura
        decimal saldo
    }
    TITULARIDADE {
        int cod_cliente PK, FK
        string numero_conta PK, FK
        date data_inclusao
    }
    MOVIMENTACAO {
        int cod_movimentacao PK
        string numero_conta FK
        datetime data_hora
        string tipo
        decimal valor
        string descricao
    }
```
