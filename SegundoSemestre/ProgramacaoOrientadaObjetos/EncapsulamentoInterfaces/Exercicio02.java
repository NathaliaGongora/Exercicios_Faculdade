package SegundoSemestre.ProgramacaoOrientadaObjetos.EncapsulamentoInterfaces;

import java.util.Scanner;

interface ControleLutador {

    String apresentar();

    String status();

    void ganharLuta();

    void perderLuta();

    void empatarLuta();
}

class Lutador implements ControleLutador {

    private String nome;
    private String nacionalidade;
    private int idade;
    private double altura;
    private double peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    public Lutador(String nome, String nacionalidade, int idade, double altura, double peso) {

        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        setPeso(peso);
    }

    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public String getNacionalidade() {

        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {

        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {

        return idade;
    }

    public void setIdade(int idade) {

        this.idade = idade;
    }

    public double getAltura() {

        return altura;
    }

    public void setAltura(double altura) {

        this.altura = altura;
    }

    public double getPeso() {

        return peso;
    }

    public void setPeso(double peso) {

        this.peso = peso;

        if (peso < 52.2) {
            categoria = "Invalido";
        } else if (peso <= 70.3) {
            categoria = "Leve";
        } else if (peso <= 83.9) {
            categoria = "Medio";
        } else if (peso <= 120.2) {
            categoria = "Pesado";
        } else {
            categoria = "Invalido";
        }
    }

    public String getCategoria() {

        return categoria;
    }

    public int getVitorias() {

        return vitorias;
    }

    public int getDerrotas() {

        return derrotas;
    }

    public int getEmpates() {

        return empates;
    }

    @Override
    public String apresentar() {

        return "Nome: " + nome
                + "\nNacionalidade: " + nacionalidade
                + "\nIdade: " + idade
                + String.format("\nAltura: %.2f m", altura)
                + String.format("\nPeso: %.1f kg", peso);
    }

    @Override
    public String status() {

        return "Categoria: " + categoria
                + "\nVitorias: " + vitorias
                + "\nDerrotas: " + derrotas
                + "\nEmpates: " + empates;
    }

    @Override
    public void ganharLuta() {

        vitorias++;
    }

    @Override
    public void perderLuta() {

        derrotas++;
    }

    @Override
    public void empatarLuta() {

        empates++;
    }
}

public class Exercicio02 {

    public static Lutador cadastrarLutador(Scanner leitor) {

        System.out.print("Digite o nome: ");
        String nome = leitor.nextLine();

        System.out.print("Digite a nacionalidade: ");
        String nacionalidade = leitor.nextLine();

        System.out.print("Digite a idade: ");
        int idade = leitor.nextInt();

        System.out.print("Digite a altura: ");
        double altura = leitor.nextDouble();

        System.out.print("Digite o peso: ");
        double peso = leitor.nextDouble();
        leitor.nextLine();

        return new Lutador(nome, nacionalidade, idade, altura, peso);
    }

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Cadastro do primeiro lutador");
        Lutador lutador1 = cadastrarLutador(leitor);

        System.out.println("\nCadastro do segundo lutador");
        Lutador lutador2 = cadastrarLutador(leitor);

        lutador1.ganharLuta();
        lutador1.empatarLuta();
        lutador2.perderLuta();
        lutador2.empatarLuta();

        System.out.println("\nPrimeiro lutador");
        System.out.println(lutador1.apresentar());
        System.out.println(lutador1.status());

        System.out.println("\nSegundo lutador");
        System.out.println(lutador2.apresentar());
        System.out.println(lutador2.status());

        leitor.close();
    }
}
