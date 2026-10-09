package SegundoSemestre.ProgramacaoOrientadaObjetos.Heranca;

class Conta {

    private String titular;
    private double saldo;

    public Conta(String titular, double saldo) {

        this.titular = titular;
        this.saldo = saldo;
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

    public void setSaldo(double saldo) {

        this.saldo = saldo;
    }
}

class ContaPoupanca extends Conta {

    private double taxaRendimento;

    public ContaPoupanca(String titular, double saldo, double taxaRendimento) {

        super(titular, saldo);
        this.taxaRendimento = taxaRendimento;
    }

    public double getTaxaRendimento() {

        return taxaRendimento;
    }

    public void setTaxaRendimento(double taxaRendimento) {

        this.taxaRendimento = taxaRendimento;
    }

    public void aplicarRendimento() {

        double rendimento = getSaldo() * taxaRendimento / 100;
        setSaldo(getSaldo() + rendimento);
    }

    public void mostrarDados() {

        System.out.println("Titular: " + getTitular());
        System.out.println("Saldo: R$ " + getSaldo());
        System.out.println("Taxa de rendimento: " + taxaRendimento + "%");
    }
}

public class Exercicio06 {

    public static void main(String[] args) {

        ContaPoupanca conta = new ContaPoupanca("Ana", 1000, 1);

        conta.aplicarRendimento();
        conta.mostrarDados();
    }
}
