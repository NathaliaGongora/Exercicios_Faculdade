package SegundoSemestre.ProgramacaoOrientadaObjetos.AssociacaoAgregacaoComposicao;

import java.util.ArrayList;
import java.util.List;

class CidadeEstado {

    private String nome;
    private int populacao;

    public CidadeEstado(String nome, int populacao) {

        this.nome = nome;
        this.populacao = populacao;
    }

    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public int getPopulacao() {

        return populacao;
    }

    public void setPopulacao(int populacao) {

        this.populacao = populacao;
    }
}

class EstadoBrasil {

    private String nome;
    private String uf;
    private List<CidadeEstado> cidades = new ArrayList<>();

    public EstadoBrasil(String nome, String uf) {

        this.nome = nome;
        this.uf = uf;
    }

    public void adicionarCidade(CidadeEstado cidade) {

        cidades.add(cidade);
    }

    public int calcularPopulacao() {

        int total = 0;

        for (CidadeEstado cidade : cidades) {
            total += cidade.getPopulacao();
        }

        return total;
    }

    public void listarCidades() {

        System.out.println(nome + " - " + uf);

        for (CidadeEstado cidade : cidades) {
            System.out.println(cidade.getNome() + ": " + cidade.getPopulacao() + " habitantes");
        }
    }
}

public class Exercicio02 {

    public static void main(String[] args) {

        CidadeEstado cidade1 = new CidadeEstado("Sorocaba", 723682);
        CidadeEstado cidade2 = new CidadeEstado("Votorantim", 127923);

        EstadoBrasil estado = new EstadoBrasil("Sao Paulo", "SP");
        estado.adicionarCidade(cidade1);
        estado.adicionarCidade(cidade2);

        estado.listarCidades();
        System.out.println("Populacao total: " + estado.calcularPopulacao());
    }
}
