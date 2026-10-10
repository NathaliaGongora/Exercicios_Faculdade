-- Cria o banco de dados de um hotel.

CREATE DATABASE Hotel;
GO

USE Hotel;
GO

CREATE TABLE Hospede (
    cod_hospede INT IDENTITY(1,1) PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    CPF VARCHAR(14) NOT NULL UNIQUE,
    telefone VARCHAR(20),
    email VARCHAR(100)
);

CREATE TABLE Quarto (
    numero_quarto INT PRIMARY KEY,
    tipo VARCHAR(50) NOT NULL,
    valor_diaria DECIMAL(10,2) NOT NULL,
    capacidade INT NOT NULL
);

CREATE TABLE Reserva (
    cod_reserva INT IDENTITY(1,1) PRIMARY KEY,
    data_entrada DATE NOT NULL,
    data_saida DATE NOT NULL,
    quantidade_hospedes INT NOT NULL,
    cod_hospede INT NOT NULL,
    numero_quarto INT NOT NULL,

    CONSTRAINT FK_Reserva_Hospede FOREIGN KEY (cod_hospede)
        REFERENCES Hospede(cod_hospede),
    CONSTRAINT FK_Reserva_Quarto FOREIGN KEY (numero_quarto)
        REFERENCES Quarto(numero_quarto)
);
