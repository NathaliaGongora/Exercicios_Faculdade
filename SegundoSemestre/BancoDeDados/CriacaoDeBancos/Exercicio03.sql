-- Cria o banco de dados de uma biblioteca.

CREATE DATABASE Biblioteca;
GO

USE Biblioteca;
GO

CREATE TABLE Aluno (
    cod_aluno INT IDENTITY(1,1) PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    email VARCHAR(100),
    telefone VARCHAR(20)
);

CREATE TABLE Autor (
    cod_autor INT IDENTITY(1,1) PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    nacionalidade VARCHAR(50)
);

CREATE TABLE Livro (
    cod_livro INT IDENTITY(1,1) PRIMARY KEY,
    titulo VARCHAR(150) NOT NULL,
    editora VARCHAR(100),
    ano_publicacao INT,
    quantidade INT NOT NULL
);

CREATE TABLE LivroAutor (
    cod_livro INT NOT NULL,
    cod_autor INT NOT NULL,

    CONSTRAINT PK_LivroAutor PRIMARY KEY (cod_livro, cod_autor),
    CONSTRAINT FK_LivroAutor_Livro FOREIGN KEY (cod_livro)
        REFERENCES Livro(cod_livro),
    CONSTRAINT FK_LivroAutor_Autor FOREIGN KEY (cod_autor)
        REFERENCES Autor(cod_autor)
);

CREATE TABLE Emprestimo (
    cod_emprestimo INT IDENTITY(1,1) PRIMARY KEY,
    data_emprestimo DATE NOT NULL,
    data_devolucao DATE,
    cod_aluno INT NOT NULL,
    cod_livro INT NOT NULL,

    CONSTRAINT FK_Emprestimo_Aluno FOREIGN KEY (cod_aluno)
        REFERENCES Aluno(cod_aluno),
    CONSTRAINT FK_Emprestimo_Livro FOREIGN KEY (cod_livro)
        REFERENCES Livro(cod_livro)
);
