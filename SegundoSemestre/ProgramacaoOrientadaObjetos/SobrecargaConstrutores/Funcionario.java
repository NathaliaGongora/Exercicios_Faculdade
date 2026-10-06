package SegundoSemestre.ProgramacaoOrientadaObjetos.SobrecargaConstrutores;

public class Funcionario {

    String nome;
    String cargo;
    double salario;

    public Funcionario(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public Funcionario(String nome, String cargo) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = 0;
    }

    public Funcionario(String nome) {
        this.nome = nome;
        this.cargo = "Nao informado";
        this.salario = 0;
    }

    public void mostrarDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Cargo: " + cargo);
        System.out.println("Salario: R$ " + salario);
    }

    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Joao", "Analista", 3500);
        Funcionario f2 = new Funcionario("Maria", "Assistente");
        Funcionario f3 = new Funcionario("Carlos");

        f1.mostrarDados();
        f2.mostrarDados();
        f3.mostrarDados();
    }
}