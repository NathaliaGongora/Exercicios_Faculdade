package SegundoSemestre.ProgramacaoOrientadaObjetos.AssociacaoAgregacaoComposicao;

import java.util.ArrayList;
import java.util.List;

class ItemDoPedido {

    private String produto;
    private int quantidade;
    private double valorUnitario;

    public ItemDoPedido(String produto, int quantidade, double valorUnitario) {

        this.produto = produto;
        this.quantidade = quantidade;
        this.valorUnitario = valorUnitario;
    }

    public String getProduto() {

        return produto;
    }

    public int getQuantidade() {

        return quantidade;
    }

    public double calcularSubtotal() {

        return quantidade * valorUnitario;
    }
}

class PedidoComposto {

    private int numero;
    private List<ItemDoPedido> itens = new ArrayList<>();

    public PedidoComposto(int numero) {

        this.numero = numero;
    }

    public void adicionarItem(String produto, int quantidade, double valorUnitario) {

        ItemDoPedido item = new ItemDoPedido(produto, quantidade, valorUnitario);
        itens.add(item);
    }

    public double calcularTotal() {

        double total = 0;

        for (ItemDoPedido item : itens) {
            total += item.calcularSubtotal();
        }

        return total;
    }

    public void imprimir() {

        System.out.println("Pedido: " + numero);

        for (ItemDoPedido item : itens) {
            System.out.printf(
                    "%s | Quantidade: %d | Subtotal: R$ %.2f%n",
                    item.getProduto(),
                    item.getQuantidade(),
                    item.calcularSubtotal()
            );
        }

        System.out.printf("Total: R$ %.2f%n", calcularTotal());
    }
}

public class Exercicio06 {

    public static void main(String[] args) {

        PedidoComposto pedido = new PedidoComposto(501);

        pedido.adicionarItem("Teclado", 1, 120);
        pedido.adicionarItem("Mouse", 2, 75);

        pedido.imprimir();
    }
}
