# Exercicio 03 - Controle de projetos

Um funcionario pode trabalhar em varios projetos, e um recurso pode ser utilizado por mais de um projeto. Por isso, os dois casos foram resolvidos com entidades associativas.

```mermaid
erDiagram
    FUNCIONARIO ||--o{ ALOCACAO : recebe
    PROJETO ||--o{ ALOCACAO : possui
    PROJETO ||--o{ PROJETO_RECURSO : necessita
    RECURSO ||--o{ PROJETO_RECURSO : utilizado

    FUNCIONARIO {
        int id_funcionario PK
        string nome
        decimal salario_hora
        time horario_entrada
        time horario_saida
    }
    PROJETO {
        int id_projeto PK
        string nome
        date data_inicio
        date data_fim
        decimal orcamento
    }
    ALOCACAO {
        int id_alocacao PK
        int id_funcionario FK
        int id_projeto FK
        int horas_semanais
    }
    RECURSO {
        int id_recurso PK
        string nome
        string tipo
    }
    PROJETO_RECURSO {
        int id_projeto_recurso PK
        int id_projeto FK
        int id_recurso FK
        int quantidade
    }
```
