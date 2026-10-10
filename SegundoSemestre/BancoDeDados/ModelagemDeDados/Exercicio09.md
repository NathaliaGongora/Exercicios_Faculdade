# Exercicio 09 - Sistema bancario

A titularidade permite contas conjuntas e tambem que um cliente possua contas em agencias diferentes. Os creditos e debitos ficam registrados como movimentacoes da conta.

```mermaid
erDiagram
    AGENCIA ||--o{ CONTA : mantem
    CLIENTE ||--o{ TITULARIDADE : possui
    CONTA ||--|{ TITULARIDADE : pertence
    CONTA ||--o{ MOVIMENTACAO : registra

    AGENCIA {
        int codigo PK
        string nome
    }
    CLIENTE {
        int id_cliente PK
        string nome
        string cpf
        string telefone
    }
    CONTA {
        int numero PK
        int codigo_agencia FK
        date data_abertura
        decimal saldo
    }
    TITULARIDADE {
        int id_titularidade PK
        int id_cliente FK
        int numero_conta FK
        date data_inclusao
    }
    MOVIMENTACAO {
        int id_movimentacao PK
        int numero_conta FK
        datetime data_hora
        string tipo
        decimal valor
        string descricao
    }
```
