package SegundoSemestre.ProgramacaoOrientadaObjetos.EncapsulamentoInterfaces;

interface ControlePedido {

    double calcularSubtotal();

    void aplicarDesconto(double percentual);

    double calcularTotal();

    String imprimirPedido();
}

class PedidoLoja implements ControlePedido {

    private int numero;
    private String produto;
    private int quantidade;
    private double valorUnitario;
    private double desconto;

    public PedidoLoja(int numero, String produto, int quantidade, double valorUnitario) {

        this.numero = numero;
        this.produto = produto;
        this.quantidade = quantidade;
        this.valorUnitario = valorUnitario;
    }

    public int getNumero() {

        return numero;
    }

    public void setNumero(int numero) {

        this.numero = numero;
    }

    public String getProduto() {

        return produto;
    }

    public void setProduto(String produto) {

        this.produto = produto;
    }

    public int getQuantidade() {

        return quantidade;
    }

    public void setQuantidade(int quantidade) {

        if (quantidade > 0) {
            this.quantidade = quantidade;
        }
    }

    public double getValorUnitario() {

        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {

        if (valorUnitario > 0) {
            this.valorUnitario = valorUnitario;
        }
    }

    public double getDesconto() {

        return desconto;
    }

    @Override
    public double calcularSubtotal() {

        return quantidade * valorUnitario;
    }

    @Override
    public void aplicarDesconto(double percentual) {

        if (percentual >= 0 && percentual <= 100) {
            desconto = percentual;
        }
    }

    @Override
    public double calcularTotal() {

        double subtotal = calcularSubtotal();
        return subtotal - (subtotal * desconto / 100);
    }

    @Override
    public String imprimirPedido() {

        return "Pedido: " + numero
                + "\nProduto: " + produto
                + "\nQuantidade: " + quantidade
                + String.format("\nValor unitario: R$ %.2f", valorUnitario)
                + String.format("\nSubtotal: R$ %.2f", calcularSubtotal())
                + String.format("\nDesconto: %.1f%%", desconto)
                + String.format("\nTotal: R$ %.2f", calcularTotal());
    }
}

public class Exercicio10 {

    public static void main(String[] args) {

        PedidoLoja pedido = new PedidoLoja(101, "Mouse", 3, 85);

        pedido.aplicarDesconto(5);

        System.out.println(pedido.imprimirPedido());
    }
}
