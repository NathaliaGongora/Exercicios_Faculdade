-- Cria o banco de dados de um sistema de eventos.

CREATE DATABASE SistemaEventos;
GO

USE SistemaEventos;
GO

CREATE TABLE Cliente (
    cod_cliente INT IDENTITY(1,1) PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    CPF VARCHAR(14) NOT NULL UNIQUE,
    email VARCHAR(100)
);

CREATE TABLE LocalEvento (
    cod_local INT IDENTITY(1,1) PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    endereco VARCHAR(200) NOT NULL,
    capacidade INT NOT NULL
);

CREATE TABLE Evento (
    cod_evento INT IDENTITY(1,1) PRIMARY KEY,
    nome VARCHAR(150) NOT NULL,
    data_hora DATETIME2 NOT NULL,
    valor_ingresso DECIMAL(10,2) NOT NULL,
    cod_local INT NOT NULL,

    CONSTRAINT FK_Evento_Local FOREIGN KEY (cod_local)
        REFERENCES LocalEvento(cod_local)
);

CREATE TABLE Inscricao (
    cod_cliente INT NOT NULL,
    cod_evento INT NOT NULL,
    data_inscricao DATETIME2 NOT NULL,

    CONSTRAINT PK_Inscricao PRIMARY KEY (cod_cliente, cod_evento),
    CONSTRAINT FK_Inscricao_Cliente FOREIGN KEY (cod_cliente)
        REFERENCES Cliente(cod_cliente),
    CONSTRAINT FK_Inscricao_Evento FOREIGN KEY (cod_evento)
        REFERENCES Evento(cod_evento)
);
