-- Cria o banco de dados de uma oficina mecanica.

CREATE DATABASE OficinaMecanica;
GO

USE OficinaMecanica;
GO

CREATE TABLE Cliente (
    cod_cliente INT IDENTITY(1,1) PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    CPF VARCHAR(14) NOT NULL UNIQUE,
    telefone VARCHAR(20)
);

CREATE TABLE Veiculo (
    placa VARCHAR(10) PRIMARY KEY,
    modelo VARCHAR(100) NOT NULL,
    ano INT,
    cod_cliente INT NOT NULL,

    CONSTRAINT FK_Veiculo_Cliente FOREIGN KEY (cod_cliente)
        REFERENCES Cliente(cod_cliente)
);

CREATE TABLE Mecanico (
    cod_mecanico INT IDENTITY(1,1) PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    especialidade VARCHAR(100)
);

CREATE TABLE OrdemServico (
    cod_ordem INT IDENTITY(1,1) PRIMARY KEY,
    data_abertura DATE NOT NULL,
    data_conclusao DATE,
    descricao VARCHAR(500) NOT NULL,
    valor DECIMAL(10,2),
    placa VARCHAR(10) NOT NULL,
    cod_mecanico INT NOT NULL,

    CONSTRAINT FK_OrdemServico_Veiculo FOREIGN KEY (placa)
        REFERENCES Veiculo(placa),
    CONSTRAINT FK_OrdemServico_Mecanico FOREIGN KEY (cod_mecanico)
        REFERENCES Mecanico(cod_mecanico)
);
