-- Cria o banco de dados para controle de uma frota de transporte.

CREATE DATABASE Transporte;
GO

USE Transporte;
GO

CREATE TABLE Veiculo (
    placa VARCHAR(15) PRIMARY KEY,
    modelo VARCHAR(100),
    ano INT NOT NULL,
    cor VARCHAR(50)
);
GO

CREATE TABLE Motorista (
    cod_motorista INT IDENTITY(1,1) PRIMARY KEY,
    nome VARCHAR(200) NOT NULL,
    email VARCHAR(100) NOT NULL,
    telefone VARCHAR(50) NOT NULL,
    cnh VARCHAR(100) NOT NULL
);
GO

CREATE TABLE Passageiro (
    cod_passageiro INT IDENTITY(1,1) PRIMARY KEY,
    nome VARCHAR(200) NOT NULL,
    rg VARCHAR(50) NOT NULL
);
GO

CREATE TABLE Carga (
    cod_carga INT IDENTITY(1,1) PRIMARY KEY,
    nome VARCHAR(200) NOT NULL
);
GO

CREATE TABLE Manutencao (
    cod_manutencao INT IDENTITY(1,1) PRIMARY KEY,
    data_manutencao DATE NOT NULL,
    servico_realizado VARCHAR(200) NOT NULL,
    valor NUMERIC(10,2) NOT NULL,
    placa VARCHAR(15) NOT NULL,

    CONSTRAINT FK_Manutencao_Veiculo FOREIGN KEY (placa)
        REFERENCES Veiculo(placa)
);
GO

CREATE TABLE Viagem (
    cod_viagem INT IDENTITY(1,1) PRIMARY KEY,
    rua_origem VARCHAR(200) NOT NULL,
    numero_origem VARCHAR(10) NOT NULL,
    bairro_origem VARCHAR(200) NOT NULL,
    estado_origem VARCHAR(200) NOT NULL,
    cep_origem VARCHAR(20) NOT NULL,
    rua_destino VARCHAR(200) NOT NULL,
    numero_destino VARCHAR(10) NOT NULL,
    bairro_destino VARCHAR(200) NOT NULL,
    estado_destino VARCHAR(200) NOT NULL,
    cep_destino VARCHAR(20) NOT NULL,
    data_saida DATETIME NOT NULL,
    data_retorno DATETIME,
    valor NUMERIC(8,2) NOT NULL,
    placa VARCHAR(15) NOT NULL,
    cod_motorista INT NOT NULL,

    CONSTRAINT FK_Viagem_Veiculo FOREIGN KEY (placa)
        REFERENCES Veiculo(placa),
    CONSTRAINT FK_Viagem_Motorista FOREIGN KEY (cod_motorista)
        REFERENCES Motorista(cod_motorista)
);
GO

CREATE TABLE Passageiro_Viagem (
    cod_passageiro INT NOT NULL,
    cod_viagem INT NOT NULL,

    CONSTRAINT PK_Passageiro_Viagem PRIMARY KEY (cod_passageiro, cod_viagem),
    CONSTRAINT FK_Passageiro_Viagem_Passageiro FOREIGN KEY (cod_passageiro)
        REFERENCES Passageiro(cod_passageiro),
    CONSTRAINT FK_Passageiro_Viagem_Viagem FOREIGN KEY (cod_viagem)
        REFERENCES Viagem(cod_viagem)
);
GO

CREATE TABLE Carga_Viagem (
    cod_carga INT NOT NULL,
    cod_viagem INT NOT NULL,

    CONSTRAINT PK_Carga_Viagem PRIMARY KEY (cod_carga, cod_viagem),
    CONSTRAINT FK_Carga_Viagem_Carga FOREIGN KEY (cod_carga)
        REFERENCES Carga(cod_carga),
    CONSTRAINT FK_Carga_Viagem_Viagem FOREIGN KEY (cod_viagem)
        REFERENCES Viagem(cod_viagem)
);
GO
