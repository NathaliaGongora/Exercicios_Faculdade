-- Cria o banco de dados de uma academia.

CREATE DATABASE Academia;
GO

USE Academia;
GO

CREATE TABLE Plano (
    cod_plano INT IDENTITY(1,1) PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    valor_mensal DECIMAL(10,2) NOT NULL
);

CREATE TABLE Aluno (
    cod_aluno INT IDENTITY(1,1) PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    CPF VARCHAR(14) NOT NULL UNIQUE,
    telefone VARCHAR(20),
    cod_plano INT NOT NULL,

    CONSTRAINT FK_Aluno_Plano FOREIGN KEY (cod_plano)
        REFERENCES Plano(cod_plano)
);

CREATE TABLE Professor (
    cod_professor INT IDENTITY(1,1) PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    CREF VARCHAR(20) NOT NULL UNIQUE
);

CREATE TABLE Aula (
    cod_aula INT IDENTITY(1,1) PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    data_hora DATETIME2 NOT NULL,
    cod_professor INT NOT NULL,

    CONSTRAINT FK_Aula_Professor FOREIGN KEY (cod_professor)
        REFERENCES Professor(cod_professor)
);

CREATE TABLE InscricaoAula (
    cod_aluno INT NOT NULL,
    cod_aula INT NOT NULL,

    CONSTRAINT PK_InscricaoAula PRIMARY KEY (cod_aluno, cod_aula),
    CONSTRAINT FK_InscricaoAula_Aluno FOREIGN KEY (cod_aluno)
        REFERENCES Aluno(cod_aluno),
    CONSTRAINT FK_InscricaoAula_Aula FOREIGN KEY (cod_aula)
        REFERENCES Aula(cod_aula)
);
