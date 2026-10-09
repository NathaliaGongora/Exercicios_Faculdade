package SegundoSemestre.ProgramacaoOrientadaObjetos.EncapsulamentoInterfaces;

import java.util.Scanner;

interface ControleFuncionario {

    double calcularSalario();

    double calcularValorReceber();

    String imprimir();

    void aumentarSalario(double percentual);

    void zerarDesconto();
}

class Funcionario implements ControleFuncionario {

    private int cracha;
    private String nome;
    private char tipoVinculo;
    private double valorHora;
    private double qtdeHora;
    private double salario;
    private double valorDesconto;

    public Funcionario(int cracha, String nome, char tipoVinculo) {

        this.cracha = cracha;
        this.nome = nome;
        this.tipoVinculo = tipoVinculo;
    }

    public int getCracha() {

        return cracha;
    }

    public void setCracha(int cracha) {

        this.cracha = cracha;
    }

    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public char getTipoVinculo() {

        return tipoVinculo;
    }

    public void setTipoVinculo(char tipoVinculo) {

        this.tipoVinculo = tipoVinculo;
    }

    public double getValorHora() {

        return valorHora;
    }

    public void setValorHora(double valorHora) {

        this.valorHora = valorHora;
    }

    public double getQtdeHora() {

        return qtdeHora;
    }

    public void setQtdeHora(double qtdeHora) {

        this.qtdeHora = qtdeHora;
    }

    public double getSalario() {

        return salario;
    }

    public double getValorDesconto() {

        return valorDesconto;
    }

    public void setValorDesconto(double valorDesconto) {

        this.valorDesconto = valorDesconto;
    }

    @Override
    public double calcularSalario() {

        if (tipoVinculo == 'C') {
            salario = valorHora * qtdeHora * 4.5;
        } else {
            salario = valorHora * qtdeHora;
        }

        return salario;
    }

    @Override
    public double calcularValorReceber() {

        return salario - (salario * valorDesconto / 100);
    }

    @Override
    public String imprimir() {

        return "Cracha: " + cracha
                + "\nNome: " + nome
                + "\nTipo de vinculo: " + tipoVinculo
                + String.format("\nSalario bruto: R$ %.2f", salario)
                + String.format("\nDesconto: %.2f%%", valorDesconto)
                + String.format("\nValor a receber: R$ %.2f", calcularValorReceber());
    }

    @Override
    public void aumentarSalario(double percentual) {

        salario += salario * percentual / 100;
    }

    @Override
    public void zerarDesconto() {

        valorDesconto = 0;
    }
}

public class Exercicio01 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o cracha: ");
        int cracha = leitor.nextInt();
        leitor.nextLine();

        System.out.print("Digite o nome: ");
        String nome = leitor.nextLine();

        System.out.print("Digite o tipo de vinculo (H ou C): ");
        char tipoVinculo = leitor.next().toUpperCase().charAt(0);

        Funcionario funcionario = new Funcionario(cracha, nome, tipoVinculo);

        System.out.print("Digite a quantidade de horas: ");
        funcionario.setQtdeHora(leitor.nextDouble());

        System.out.print("Digite o valor da hora: ");
        funcionario.setValorHora(leitor.nextDouble());

        funcionario.calcularSalario();

        System.out.print("Digite o percentual de desconto: ");
        funcionario.setValorDesconto(leitor.nextDouble());

        System.out.println("\nHolerite");
        System.out.println(funcionario.imprimir());

        funcionario.aumentarSalario(5);
        System.out.printf("\nSalario apos aumento: R$ %.2f%n", funcionario.getSalario());

        funcionario.zerarDesconto();
        System.out.printf("Valor sem desconto: R$ %.2f%n", funcionario.calcularValorReceber());

        leitor.close();
    }
}
