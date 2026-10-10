# Exercicio 07 - Controle de estagios

O candidato pode cadastrar varios cursos e experiencias. Quando uma vaga e preenchida, o contrato liga candidato, vaga e orientador. Cada contrato pode possuir relatorios com varias atividades.

```mermaid
erDiagram
    CANDIDATO ||--o{ CURSO : realiza
    CANDIDATO ||--o{ EXPERIENCIA : possui
    EMPRESA ||--o{ VAGA : oferece
    CANDIDATO ||--o{ CONTRATO : assina
    VAGA ||--o| CONTRATO : gera
    ORIENTADOR ||--o{ CONTRATO : orienta
    CONTRATO ||--o{ RELATORIO : possui
    RELATORIO ||--|{ ATIVIDADE : registra

    CANDIDATO {
        int id_candidato PK
        string nome
        string telefone
        string rg
        string cpf
        string email
    }
    CURSO {
        int id_curso PK
        int id_candidato FK
        string nome
        date data_inicio
        date data_fim
    }
    EXPERIENCIA {
        int id_experiencia PK
        int id_candidato FK
        string cargo
        date data_inicio
        date data_fim
    }
    EMPRESA {
        int id_empresa PK
        string nome
    }
    VAGA {
        int id_vaga PK
        int id_empresa FK
        string descricao
        string requisitos
    }
    ORIENTADOR {
        int id_orientador PK
        string nome
        string cpf
    }
    CONTRATO {
        int numero PK
        int id_candidato FK
        int id_vaga FK
        int id_orientador FK
        date data_inicio
        date data_fim
        boolean renovacao
    }
    RELATORIO {
        int id_relatorio PK
        int numero_contrato FK
        date data_entrega
    }
    ATIVIDADE {
        int id_atividade PK
        int id_relatorio FK
        string nome
        string descricao
    }
```
