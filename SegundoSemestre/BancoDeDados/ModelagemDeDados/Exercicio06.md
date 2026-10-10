# Exercicio 06 - Controle de pedidos

O pedido pertence a um cliente e a um vendedor. Os produtos do pedido ficam em itens separados, onde a quantidade e registrada. A oferta guarda o fornecedor e o preco de cada produto.

```mermaid
erDiagram
    CLIENTE ||--o{ PEDIDO : faz
    VENDEDOR ||--o{ PEDIDO : registra
    PEDIDO ||--|{ ITEM_PEDIDO : possui
    PRODUTO ||--o{ ITEM_PEDIDO : aparece
    PRODUTO ||--o{ OFERTA : possui
    FORNECEDOR ||--o{ OFERTA : fornece

    CLIENTE {
        int id_cliente PK
        string nome
    }
    VENDEDOR {
        int id_vendedor PK
        string nome
    }
    PEDIDO {
        int id_pedido PK
        int id_cliente FK
        int id_vendedor FK
        date data_pedido
    }
    PRODUTO {
        int id_produto PK
        string codigo
        string nome
        string marca
    }
    ITEM_PEDIDO {
        int id_item PK
        int id_pedido FK
        int id_produto FK
        int quantidade
    }
    FORNECEDOR {
        int id_fornecedor PK
        string nome
    }
    OFERTA {
        int id_oferta PK
        int id_produto FK
        int id_fornecedor FK
        decimal preco
    }
```
