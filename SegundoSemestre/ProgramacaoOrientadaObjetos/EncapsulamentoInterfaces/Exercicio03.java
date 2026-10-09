package SegundoSemestre.ProgramacaoOrientadaObjetos.EncapsulamentoInterfaces;

interface ControleConta {

    void depositar(double valor);

    boolean sacar(double valor);

    String consultarSaldo();
}

class ContaBancaria implements ControleConta {

    private int numero;
    private String titular;
    private double saldo;

    public ContaBancaria(int numero, String titular, double saldo) {

        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    public int getNumero() {

        return numero;
    }

    public void setNumero(int numero) {

        this.numero = numero;
    }

    public String getTitular() {

        return titular;
    }

    public void setTitular(String titular) {

        this.titular = titular;
    }

    public double getSaldo() {

        return saldo;
    }

    @Override
    public void depositar(double valor) {

        if (valor > 0) {
            saldo += valor;
        }
    }

    @Override
    public boolean sacar(double valor) {

        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            return true;
        }

        return false;
    }

    @Override
    public String consultarSaldo() {

        return "Conta: " + numero
                + "\nTitular: " + titular
                + String.format("\nSaldo: R$ %.2f", saldo);
    }
}

public class Exercicio03 {

    public static void main(String[] args) {

        ContaBancaria conta = new ContaBancaria(1234, "Ana Lima", 500);

        conta.depositar(250);
        conta.sacar(100);

        System.out.println(conta.consultarSaldo());
    }
}
