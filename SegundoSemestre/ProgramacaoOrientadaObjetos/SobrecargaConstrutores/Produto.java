package SegundoSemestre.ProgramacaoOrientadaObjetos.SobrecargaConstrutores;

import java.time.LocalDate;

public class Produto {

    String nome;
    double precoCusto;
    double precoVenda;
    LocalDate dataFabricacao;
    LocalDate dataValidade;

    public Produto(String nome, double precoCusto, double precoVenda,
                   LocalDate dataFabricacao, LocalDate dataValidade) {
        this.nome = nome;
        this.precoCusto = precoCusto;
        this.precoVenda = precoVenda;
        this.dataFabricacao = dataFabricacao;
        this.dataValidade = dataValidade;
    }

    public Produto(String nome, double precoCusto, double precoVenda,
                   LocalDate dataFabricacao) {
        this.nome = nome;
        this.precoCusto = precoCusto;
        this.precoVenda = precoVenda;
        this.dataFabricacao = dataFabricacao;
        this.dataValidade = dataFabricacao.plusMonths(1);
    }

    public Produto(String nome, double precoCusto) {
        this.nome = nome;
        this.precoCusto = precoCusto;
        this.precoVenda = precoCusto + (precoCusto * 0.10);
        this.dataFabricacao = LocalDate.now();
        this.dataValidade = dataFabricacao.plusMonths(1);
    }

    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Preco de custo: R$ " + precoCusto);
        System.out.println("Preco de venda: R$ " + precoVenda);
        System.out.println("Data de fabricacao: " + dataFabricacao);
        System.out.println("Data de validade: " + dataValidade);
        System.out.println();
    }

    public static void main(String[] args) {
        Produto produto1 = new Produto(
                "Chocolate", 5.00, 8.00,
                LocalDate.of(2026, 10, 1),
                LocalDate.of(2026, 12, 1)
        );

        Produto produto2 = new Produto(
                "Biscoito", 4.00, 6.00,
                LocalDate.of(2026, 10, 1)
        );

        Produto produto3 = new Produto("Suco", 10.00);

        produto1.mostrarInformacoes();
        produto2.mostrarInformacoes();
        produto3.mostrarInformacoes();
    }
}