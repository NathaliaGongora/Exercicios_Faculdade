# Exercicio 02 - Controle de pessoal simplificado

O salario pertence ao cargo, pois todos os funcionarios do mesmo cargo recebem o mesmo valor. O ramal pertence ao setor, pois cada setor possui apenas um ramal.

```mermaid
erDiagram
    CARGO ||--o{ FUNCIONARIO : define
    SETOR ||--o{ FUNCIONARIO : possui

    FUNCIONARIO {
        int id_funcionario PK
        int id_cargo FK
        int id_setor FK
        string nome
        date data_admissao
    }
    CARGO {
        int id_cargo PK
        string nome
        decimal salario
    }
    SETOR {
        int id_setor PK
        string nome
        string ramal
    }
```
