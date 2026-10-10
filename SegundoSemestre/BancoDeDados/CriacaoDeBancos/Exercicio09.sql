-- Cria o banco de dados de um restaurante.

CREATE DATABASE Restaurante;
GO

USE Restaurante;
GO

CREATE TABLE Cliente (
    cod_cliente INT IDENTITY(1,1) PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    telefone VARCHAR(20)
);

CREATE TABLE Mesa (
    numero_mesa INT PRIMARY KEY,
    capacidade INT NOT NULL
);

CREATE TABLE Produto (
    cod_produto INT IDENTITY(1,1) PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    preco DECIMAL(10,2) NOT NULL
);

CREATE TABLE Pedido (
    cod_pedido INT IDENTITY(1,1) PRIMARY KEY,
    data_hora DATETIME2 NOT NULL,
    cod_cliente INT,
    numero_mesa INT NOT NULL,

    CONSTRAINT FK_Pedido_Cliente FOREIGN KEY (cod_cliente)
        REFERENCES Cliente(cod_cliente),
    CONSTRAINT FK_Pedido_Mesa FOREIGN KEY (numero_mesa)
        REFERENCES Mesa(numero_mesa)
);

CREATE TABLE ItemPedido (
    cod_pedido INT NOT NULL,
    cod_produto INT NOT NULL,
    quantidade INT NOT NULL,

    CONSTRAINT PK_ItemPedido PRIMARY KEY (cod_pedido, cod_produto),
    CONSTRAINT FK_ItemPedido_Pedido FOREIGN KEY (cod_pedido)
        REFERENCES Pedido(cod_pedido),
    CONSTRAINT FK_ItemPedido_Produto FOREIGN KEY (cod_produto)
        REFERENCES Produto(cod_produto)
);
