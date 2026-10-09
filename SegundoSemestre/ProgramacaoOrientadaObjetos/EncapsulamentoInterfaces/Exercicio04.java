package SegundoSemestre.ProgramacaoOrientadaObjetos.EncapsulamentoInterfaces;

interface ControleProduto {

    void adicionarEstoque(int quantidade);

    boolean retirarEstoque(int quantidade);

    double calcularValorEstoque();

    String exibirProduto();
}

class ProdutoEstoque implements ControleProduto {

    private int codigo;
    private String nome;
    private double preco;
    private int quantidade;

    public ProdutoEstoque(int codigo, String nome, double preco, int quantidade) {

        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public int getCodigo() {

        return codigo;
    }

    public void setCodigo(int codigo) {

        this.codigo = codigo;
    }

    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public double getPreco() {

        return preco;
    }

    public void setPreco(double preco) {

        if (preco > 0) {
            this.preco = preco;
        }
    }

    public int getQuantidade() {

        return quantidade;
    }

    @Override
    public void adicionarEstoque(int quantidade) {

        if (quantidade > 0) {
            this.quantidade += quantidade;
        }
    }

    @Override
    public boolean retirarEstoque(int quantidade) {

        if (quantidade > 0 && quantidade <= this.quantidade) {
            this.quantidade -= quantidade;
            return true;
        }

        return false;
    }

    @Override
    public double calcularValorEstoque() {

        return preco * quantidade;
    }

    @Override
    public String exibirProduto() {

        return "Codigo: " + codigo
                + "\nProduto: " + nome
                + String.format("\nPreco: R$ %.2f", preco)
                + "\nQuantidade: " + quantidade
                + String.format("\nValor em estoque: R$ %.2f", calcularValorEstoque());
    }
}

public class Exercicio04 {

    public static void main(String[] args) {

        ProdutoEstoque produto = new ProdutoEstoque(10, "Teclado", 120, 8);

        produto.adicionarEstoque(3);
        produto.retirarEstoque(2);

        System.out.println(produto.exibirProduto());
    }
}
