-- Cria o banco de dados de uma loja.

CREATE DATABASE Loja;
GO

USE Loja;
GO

CREATE TABLE Cliente (
    cod_cliente INT IDENTITY(1,1) PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    CPF VARCHAR(14) NOT NULL UNIQUE,
    telefone VARCHAR(20)
);

CREATE TABLE Produto (
    cod_produto INT IDENTITY(1,1) PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    preco DECIMAL(10,2) NOT NULL,
    quantidade_estoque INT NOT NULL
);

CREATE TABLE Pedido (
    cod_pedido INT IDENTITY(1,1) PRIMARY KEY,
    data_pedido DATETIME2 NOT NULL,
    cod_cliente INT NOT NULL,

    CONSTRAINT FK_Pedido_Cliente FOREIGN KEY (cod_cliente)
        REFERENCES Cliente(cod_cliente)
);

CREATE TABLE ItemPedido (
    cod_pedido INT NOT NULL,
    cod_produto INT NOT NULL,
    quantidade INT NOT NULL,
    preco_unitario DECIMAL(10,2) NOT NULL,

    CONSTRAINT PK_ItemPedido PRIMARY KEY (cod_pedido, cod_produto),
    CONSTRAINT FK_ItemPedido_Pedido FOREIGN KEY (cod_pedido)
        REFERENCES Pedido(cod_pedido),
    CONSTRAINT FK_ItemPedido_Produto FOREIGN KEY (cod_produto)
        REFERENCES Produto(cod_produto)
);
