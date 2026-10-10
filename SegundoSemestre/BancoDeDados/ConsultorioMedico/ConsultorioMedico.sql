CREATE DATABASE ConsultorioMedico;
GO

USE ConsultorioMedico;
GO

CREATE TABLE Paciente (
    cod_paciente INT IDENTITY(1,1) PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    telefone VARCHAR(20),
    CPF VARCHAR(14) NOT NULL UNIQUE,
    RG VARCHAR(20) NOT NULL UNIQUE
);

CREATE TABLE Exame (
    cod_exame INT IDENTITY(1,1) PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    resultado VARCHAR(500),
    cod_paciente INT NOT NULL,

    CONSTRAINT FK_Exame_Paciente
        FOREIGN KEY (cod_paciente)
        REFERENCES Paciente(cod_paciente)
);

CREATE TABLE Medico (
    CRM VARCHAR(20) PRIMARY KEY,
    telefone VARCHAR(20),
    CPF VARCHAR(14) NOT NULL UNIQUE,
    email VARCHAR(100),
    RG VARCHAR(20) NOT NULL UNIQUE,
    nome VARCHAR(100) NOT NULL
);

CREATE TABLE Especialidade (
    cod_especialidade INT IDENTITY(1,1) PRIMARY KEY,
    nome VARCHAR(100) NOT NULL UNIQUE
);

CREATE TABLE Consulta (
    cod_consulta INT IDENTITY(1,1) PRIMARY KEY,
    data_hora DATETIME2 NOT NULL,
    cod_paciente INT NOT NULL,
    CRM VARCHAR(20) NOT NULL,

    CONSTRAINT FK_Consulta_Paciente
        FOREIGN KEY (cod_paciente)
        REFERENCES Paciente(cod_paciente),

    CONSTRAINT FK_Consulta_Medico
        FOREIGN KEY (CRM)
        REFERENCES Medico(CRM)
);

CREATE TABLE MedicoEspecialidade (
    CRM VARCHAR(20) NOT NULL,
    cod_especialidade INT NOT NULL,

    CONSTRAINT PK_MedicoEspecialidade
        PRIMARY KEY (CRM, cod_especialidade),

    CONSTRAINT FK_MedicoEspecialidade_Medico
        FOREIGN KEY (CRM)
        REFERENCES Medico(CRM),

    CONSTRAINT FK_MedicoEspecialidade_Especialidade
        FOREIGN KEY (cod_especialidade)
        REFERENCES Especialidade(cod_especialidade)
);
