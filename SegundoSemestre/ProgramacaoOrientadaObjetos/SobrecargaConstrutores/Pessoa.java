package SegundoSemestre.ProgramacaoOrientadaObjetos.SobrecargaConstrutores;

public class Pessoa {

    String nome;
    int idade;
    double altura;
    double peso;

    public Pessoa(String nome, int idade, double altura, double peso) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
    }

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        this.altura = 0;
        this.peso = 0;
    }

    public Pessoa(String nome) {
        this.nome = nome;
        this.idade = 0;
        this.altura = 0;
        this.peso = 0;
    }

    public void mostrarDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Peso: " + peso);
    }

    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Ana", 25, 1.65, 60);
        Pessoa pessoa2 = new Pessoa("Carlos", 30);
        Pessoa pessoa3 = new Pessoa("Maria");

        pessoa1.mostrarDados();
        pessoa2.mostrarDados();
        pessoa3.mostrarDados();
    }
}