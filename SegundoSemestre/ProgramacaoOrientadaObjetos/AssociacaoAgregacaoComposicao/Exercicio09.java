package SegundoSemestre.ProgramacaoOrientadaObjetos.AssociacaoAgregacaoComposicao;

import java.util.ArrayList;
import java.util.List;

class ComodoDaCasa {

    private String nome;
    private double area;

    public ComodoDaCasa(String nome, double area) {

        this.nome = nome;
        this.area = area;
    }

    public String getNome() {

        return nome;
    }

    public double getArea() {

        return area;
    }
}

class CasaComposta {

    private String endereco;
    private List<ComodoDaCasa> comodos = new ArrayList<>();

    public CasaComposta(String endereco) {

        this.endereco = endereco;
    }

    public void construirComodo(String nome, double area) {

        ComodoDaCasa comodo = new ComodoDaCasa(nome, area);
        comodos.add(comodo);
    }

    public double calcularAreaTotal() {

        double total = 0;

        for (ComodoDaCasa comodo : comodos) {
            total += comodo.getArea();
        }

        return total;
    }

    public void exibirCasa() {

        System.out.println("Endereco: " + endereco);

        for (ComodoDaCasa comodo : comodos) {
            System.out.println(comodo.getNome() + " - " + comodo.getArea() + " m2");
        }

        System.out.println("Area total: " + calcularAreaTotal() + " m2");
    }
}

public class Exercicio09 {

    public static void main(String[] args) {

        CasaComposta casa = new CasaComposta("Rua das Flores, 100");

        casa.construirComodo("Sala", 20);
        casa.construirComodo("Quarto", 12.5);
        casa.construirComodo("Cozinha", 10);

        casa.exibirCasa();
    }
}
