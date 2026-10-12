# Exercicio 06 - Controle de pedidos

O modelo registra o pedido, o cliente, o vendedor e os produtos. A tabela `ITEM_PEDIDO` guarda a quantidade de cada produto no pedido. A tabela `OFERTA` relaciona cada produto ao fornecedor e ao preco da lista.

Foi usado um identificador interno para o produto, porque o codigo mostrado na lista nao e unico: o codigo `008` aparece para duas marcas diferentes. O codigo do fornecedor tambem e texto para preservar os zeros a esquerda.

```mermaid
erDiagram
    CLIENTE ||--o{ PEDIDO : faz
    VENDEDOR ||--o{ PEDIDO : registra
    PEDIDO ||--|{ ITEM_PEDIDO : possui
    PRODUTO ||--o{ ITEM_PEDIDO : aparece
    PRODUTO ||--o{ OFERTA : possui
    FORNECEDOR ||--o{ OFERTA : fornece

    CLIENTE {
        string cod_cliente PK
        string razao_social
    }
    VENDEDOR {
        string cod_vendedor PK
        string nome
    }
    PEDIDO {
        string numero_pedido PK
        string cod_cliente FK
        string cod_vendedor FK
        date data_pedido
    }
    PRODUTO {
        int id_produto PK
        string codigo
        string nome
        string marca
    }
    ITEM_PEDIDO {
        string numero_pedido PK, FK
        int id_produto PK, FK
        int quantidade
    }
    FORNECEDOR {
        string cod_fornecedor PK
    }
    OFERTA {
        int id_oferta PK
        int id_produto FK
        string cod_fornecedor FK
        decimal preco
    }
```

Observacao: no exemplo, o pedido contem os codigos `101`, `004`, `012` e `068`, mas a lista de precos mostra `001`, `004`, `005` e `008`. Assim, somente o produto de codigo `004` aparece nos dois documentos. Alem disso, para pedidos futuros com o codigo `008`, seria necessario registrar tambem a marca (ou outro identificador) para saber qual produto foi escolhido.
