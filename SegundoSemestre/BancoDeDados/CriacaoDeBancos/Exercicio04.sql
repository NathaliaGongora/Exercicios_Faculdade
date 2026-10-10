-- Cria o banco de dados de uma escola.

CREATE DATABASE Escola;
GO

USE Escola;
GO

CREATE TABLE Curso (
    cod_curso INT IDENTITY(1,1) PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    duracao_semestres INT NOT NULL
);

CREATE TABLE Aluno (
    cod_aluno INT IDENTITY(1,1) PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    data_nascimento DATE,
    cod_curso INT NOT NULL,

    CONSTRAINT FK_Aluno_Curso FOREIGN KEY (cod_curso)
        REFERENCES Curso(cod_curso)
);

CREATE TABLE Professor (
    cod_professor INT IDENTITY(1,1) PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    email VARCHAR(100)
);

CREATE TABLE Disciplina (
    cod_disciplina INT IDENTITY(1,1) PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    cod_curso INT NOT NULL,
    cod_professor INT NOT NULL,

    CONSTRAINT FK_Disciplina_Curso FOREIGN KEY (cod_curso)
        REFERENCES Curso(cod_curso),
    CONSTRAINT FK_Disciplina_Professor FOREIGN KEY (cod_professor)
        REFERENCES Professor(cod_professor)
);

CREATE TABLE Matricula (
    cod_aluno INT NOT NULL,
    cod_disciplina INT NOT NULL,
    nota_final DECIMAL(4,2),
    total_faltas INT NOT NULL DEFAULT 0,

    CONSTRAINT PK_Matricula PRIMARY KEY (cod_aluno, cod_disciplina),
    CONSTRAINT FK_Matricula_Aluno FOREIGN KEY (cod_aluno)
        REFERENCES Aluno(cod_aluno),
    CONSTRAINT FK_Matricula_Disciplina FOREIGN KEY (cod_disciplina)
        REFERENCES Disciplina(cod_disciplina)
);
