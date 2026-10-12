# Exercicio 05 - Controle escolar

O modelo permite consultar o curso de cada aluno, as disciplinas de cada curso, o professor responsavel por uma disciplina e as disciplinas cursadas por cada aluno. A tabela `Matricula` resolve a relacao muitos-para-muitos entre aluno e disciplina e guarda a nota final e o total de faltas.

Cada aluno pertence a um curso. Cada disciplina pertence a um unico curso e tem um professor responsavel. Um curso, um professor, um aluno ou uma disciplina podem existir sem registros relacionados. A chave primaria composta de `Matricula` impede cadastrar mais de uma vez o mesmo aluno na mesma disciplina.

O script SQL Server desta resolucao esta em [Exercicio04.sql](../CriacaoDeBancos/Exercicio04.sql).

## DER

![DER do controle escolar](Exercicio05_DER.png)

```mermaid
erDiagram
    CURSO ||--o{ ALUNO : possui
    CURSO ||--o{ DISCIPLINA : oferece
    PROFESSOR ||--o{ DISCIPLINA : ministra
    ALUNO ||--o{ MATRICULA : realiza
    DISCIPLINA ||--o{ MATRICULA : recebe

    CURSO {
        int cod_curso PK
        string nome
        int duracao_semestres
    }
    ALUNO {
        int cod_aluno PK
        string nome
        date data_nascimento
        int cod_curso FK
    }
    PROFESSOR {
        int cod_professor PK
        string nome
        string email
    }
    DISCIPLINA {
        int cod_disciplina PK
        string nome
        int cod_curso FK
        int cod_professor FK
    }
    MATRICULA {
        int cod_aluno PK, FK
        int cod_disciplina PK, FK
        decimal nota_final
        int total_faltas
    }
```
