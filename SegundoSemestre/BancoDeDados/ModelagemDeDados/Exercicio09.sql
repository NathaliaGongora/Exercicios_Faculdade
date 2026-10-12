-- Cria o banco de dados do Banco Popular.

CREATE DATABASE BancoPopular;
GO

USE BancoPopular;
GO

CREATE TABLE Agencia (
    cod_agencia INT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL
);
GO

CREATE TABLE Cliente (
    cod_cliente INT IDENTITY(1,1) PRIMARY KEY,
    nome VARCHAR(150) NOT NULL,
    CPF VARCHAR(14) NOT NULL UNIQUE,
    telefone VARCHAR(20),
    senha_hash VARCHAR(255) NOT NULL
);
GO

CREATE TABLE Conta (
    numero_conta VARCHAR(20) PRIMARY KEY,
    cod_agencia INT NOT NULL,
    data_abertura DATE NOT NULL DEFAULT (CONVERT(DATE, GETDATE())),
    saldo DECIMAL(12,2) NOT NULL DEFAULT (0.00),

    CONSTRAINT FK_Conta_Agencia FOREIGN KEY (cod_agencia)
        REFERENCES Agencia(cod_agencia)
);
GO

CREATE TABLE Titularidade (
    cod_cliente INT NOT NULL,
    numero_conta VARCHAR(20) NOT NULL,
    data_inclusao DATE NOT NULL DEFAULT (CONVERT(DATE, GETDATE())),

    CONSTRAINT PK_Titularidade PRIMARY KEY (cod_cliente, numero_conta),
    CONSTRAINT FK_Titularidade_Cliente FOREIGN KEY (cod_cliente)
        REFERENCES Cliente(cod_cliente),
    CONSTRAINT FK_Titularidade_Conta FOREIGN KEY (numero_conta)
        REFERENCES Conta(numero_conta)
);
GO

CREATE TABLE Movimentacao (
    cod_movimentacao INT IDENTITY(1,1) PRIMARY KEY,
    numero_conta VARCHAR(20) NOT NULL,
    data_hora DATETIME2 NOT NULL DEFAULT (SYSDATETIME()),
    tipo CHAR(1) NOT NULL,
    valor DECIMAL(12,2) NOT NULL,
    descricao VARCHAR(200),

    CONSTRAINT CK_Movimentacao_Tipo CHECK (tipo IN ('C', 'D')),
    CONSTRAINT CK_Movimentacao_Valor CHECK (valor > 0),
    CONSTRAINT FK_Movimentacao_Conta FOREIGN KEY (numero_conta)
        REFERENCES Conta(numero_conta)
);
GO
