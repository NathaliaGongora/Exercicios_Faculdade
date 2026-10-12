# Loja virtual

Modelo para registrar clientes, pedidos, itens, pagamentos e entregas.

![Diagrama de classes de loja virtual](Loja_Virtual.svg)

[Fonte PlantUML editável](Loja_Virtual.puml)

```mermaid
classDiagram
direction TB

class Cliente {
  -int id
  -String nome
  -String email
  -String cpf
  +atualizarCadastro()
  +consultarPedidos()
}

class Produto {
  -int id
  -String nome
  -String descricao
  -double preco
  -int quantidadeEstoque
  +atualizarEstoque(quantidade)
  +estaDisponivel() bool
}

class Pedido {
  -int id
  -DateTime dataCriacao
  -String status
  +calcularTotal() double
  +cancelar()
}

class ItemPedido {
  -int quantidade
  -double precoUnitario
  +calcularSubtotal() double
}

class Pagamento {
  -int id
  -String forma
  -double valor
  -String status
  +autorizar() bool
  +estornar()
}

class Entrega {
  -int id
  -String endereco
  -String codigoRastreio
  -Date dataPrevista
  +atualizarRastreio()
  +confirmarEntrega()
}

Cliente "1" --> "0..*" Pedido : realiza
Pedido "1" *-- "1..*" ItemPedido : contem
ItemPedido "0..*" --> "1" Produto : referencia
Pedido "1" *-- "0..1" Pagamento : possui
Pedido "1" *-- "0..1" Entrega : organiza
```

**Premissa:** o preço unitário fica no item do pedido para preservar o valor cobrado naquela compra, mesmo que o preço atual do produto mude.
