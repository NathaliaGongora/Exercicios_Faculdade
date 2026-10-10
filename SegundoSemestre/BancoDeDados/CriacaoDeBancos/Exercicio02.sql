-- Cria o banco de dados de uma clinica veterinaria.

CREATE DATABASE ClinicaVeterinaria;
GO

USE ClinicaVeterinaria;
GO

CREATE TABLE Tutor (
    cod_tutor INT IDENTITY(1,1) PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    CPF VARCHAR(14) NOT NULL UNIQUE,
    telefone VARCHAR(20)
);

CREATE TABLE Animal (
    cod_animal INT IDENTITY(1,1) PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    especie VARCHAR(50) NOT NULL,
    raca VARCHAR(50),
    data_nascimento DATE,
    cod_tutor INT NOT NULL,

    CONSTRAINT FK_Animal_Tutor FOREIGN KEY (cod_tutor)
        REFERENCES Tutor(cod_tutor)
);

CREATE TABLE Veterinario (
    CRMV VARCHAR(20) PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    telefone VARCHAR(20),
    especialidade VARCHAR(100)
);

CREATE TABLE Atendimento (
    cod_atendimento INT IDENTITY(1,1) PRIMARY KEY,
    data_hora DATETIME2 NOT NULL,
    diagnostico VARCHAR(500),
    cod_animal INT NOT NULL,
    CRMV VARCHAR(20) NOT NULL,

    CONSTRAINT FK_Atendimento_Animal FOREIGN KEY (cod_animal)
        REFERENCES Animal(cod_animal),
    CONSTRAINT FK_Atendimento_Veterinario FOREIGN KEY (CRMV)
        REFERENCES Veterinario(CRMV)
);
