# Exercicio 10 - Clinicas medicas

O atendimento local informa qual especialidade uma clinica oferece em cada endereco. A consulta gera obrigatoriamente uma receita, que pode ter nenhum ou varios remedios.

```mermaid
erDiagram
    CLINICA ||--o{ ATENDIMENTO_LOCAL : organiza
    LOCAL ||--|{ ATENDIMENTO_LOCAL : compartilha
    ESPECIALIDADE ||--o{ ATENDIMENTO_LOCAL : oferecida
    CLINICA ||--o{ MEDICO : contrata
    ESPECIALIDADE ||--o{ MEDICO : exercida
    MEDICO ||--o{ CONSULTA : realiza
    PACIENTE ||--o{ CONSULTA : participa
    ATENDIMENTO_LOCAL ||--o{ CONSULTA : recebe
    CONSULTA ||--|| RECEITA : gera
    RECEITA ||--o{ ITEM_RECEITA : possui
    REMEDIO ||--o{ ITEM_RECEITA : prescrito

    CLINICA {
        int id_clinica PK
        string nome
    }
    LOCAL {
        int id_local PK
        string endereco
    }
    ESPECIALIDADE {
        int id_especialidade PK
        string nome
    }
    ATENDIMENTO_LOCAL {
        int id_atendimento_local PK
        int id_clinica FK
        int id_local FK
        int id_especialidade FK
        string periodo
        string contrato
    }
    MEDICO {
        int id_medico PK
        int id_clinica FK
        int id_especialidade FK
        string nome
        string crm
    }
    PACIENTE {
        int id_paciente PK
        string nome
        string cpf
    }
    CONSULTA {
        int id_consulta PK
        int id_medico FK
        int id_paciente FK
        int id_atendimento_local FK
        datetime data_hora
    }
    RECEITA {
        int id_receita PK
        int id_consulta FK
        string recomendacoes
    }
    REMEDIO {
        int codigo PK
        string nome_generico
    }
    ITEM_RECEITA {
        int id_item PK
        int id_receita FK
        int codigo_remedio FK
        string orientacao_uso
    }
```

Regra adicional: o mesmo remedio nao deve ser repetido para o mesmo paciente na mesma data.
