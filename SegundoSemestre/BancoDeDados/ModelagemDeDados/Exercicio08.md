# Exercicio 08 - Sistema de pedagios

A passagem registra a cabine, o tipo de veiculo, a data e o valor cobrado. A alocacao permite saber qual funcionario estava trabalhando em cada cabine e turno.

```mermaid
erDiagram
    FUNCIONARIO ||--o{ ALOCACAO : trabalha
    CABINE ||--o{ ALOCACAO : recebe
    CABINE ||--o{ PASSAGEM : registra
    TIPO_VEICULO ||--o{ PASSAGEM : classifica

    FUNCIONARIO {
        int id_funcionario PK
        string nome
        string cpf
    }
    CABINE {
        int id_cabine PK
        string descricao
    }
    ALOCACAO {
        int id_alocacao PK
        int id_funcionario FK
        int id_cabine FK
        datetime inicio_turno
        datetime fim_turno
    }
    TIPO_VEICULO {
        int id_tipo PK
        string descricao
        decimal tarifa
    }
    PASSAGEM {
        int id_passagem PK
        int id_cabine FK
        int id_tipo FK
        datetime data_hora
        decimal valor_cobrado
    }
```
