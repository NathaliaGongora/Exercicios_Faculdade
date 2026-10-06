package SegundoSemestre.ProgramacaoOrientadaObjetos.SobrecargaConstrutores;

public class ContaBancaria {

    String titular;
    String numeroConta;
    double saldo;

    public ContaBancaria(String titular, String numeroConta, double saldo) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public ContaBancaria(String titular, String numeroConta) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = 0;
    }

    public ContaBancaria(String titular) {
        this.titular = titular;
        this.numeroConta = "Nao informado";
        this.saldo = 0;
    }

    public void mostrarDados() {
        System.out.println("Titular: " + titular);
        System.out.println("Conta: " + numeroConta);
        System.out.println("Saldo: R$ " + saldo);
    }

    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria("Ana", "12345", 1500);
        ContaBancaria conta2 = new ContaBancaria("Carlos", "67890");
        ContaBancaria conta3 = new ContaBancaria("Maria");

        conta1.mostrarDados();
        conta2.mostrarDados();
        conta3.mostrarDados();
    }
}