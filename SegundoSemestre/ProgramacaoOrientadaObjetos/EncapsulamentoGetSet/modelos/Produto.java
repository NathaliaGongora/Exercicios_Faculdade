package SegundoSemestre.ProgramacaoOrientadaObjetos.EncapsulamentoGetSet.modelos;

public class Produto {

    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {

        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public void vender(int quantidadeVendida) {

        if (quantidadeVendida > 0 && quantidadeVendida <= quantidade) {

            quantidade = quantidade - quantidadeVendida;
            System.out.println("Venda realizada.");
        } else {

            System.out.println("Quantidade indisponivel.");
        }
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

    public void setQuantidade(int quantidade) {

        if (quantidade >= 0) {

            this.quantidade = quantidade;
        }
    }
}
