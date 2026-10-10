package SegundoSemestre.ProgramacaoOrientadaObjetos.Polimorfismo;

abstract class ContaBancariaPoli {

    protected String titular;
    protected double saldo;

    public ContaBancariaPoli(String titular, double saldo) {

        this.titular = titular;
        this.saldo = saldo;
    }

    public abstract double calcularTaxaMensal();

    public double saldoAposTaxa() {

        return saldo - calcularTaxaMensal();
    }
}

class ContaCorrentePoli extends ContaBancariaPoli {

    public ContaCorrentePoli(String titular, double saldo) {

        super(titular, saldo);
    }

    @Override
    public double calcularTaxaMensal() {

        return 25;
    }
}

class ContaPoupancaPoli extends ContaBancariaPoli {

    public ContaPoupancaPoli(String titular, double saldo) {

        super(titular, saldo);
    }

    @Override
    public double calcularTaxaMensal() {

        return 0;
    }
}

class ContaSalarioPoli extends ContaBancariaPoli {

    public ContaSalarioPoli(String titular, double saldo) {

        super(titular, saldo);
    }

    @Override
    public double calcularTaxaMensal() {

        return 8;
    }
}

public class Exercicio08 {

    public static void main(String[] args) {

        ContaBancariaPoli[] contas = {
            new ContaCorrentePoli("Ana", 2000),
            new ContaPoupancaPoli("Bruno", 1800),
            new ContaSalarioPoli("Carla", 2500)
        };

        for (ContaBancariaPoli conta : contas) {
            System.out.printf(
                    "%s | Taxa: R$ %.2f | Saldo final: R$ %.2f%n",
                    conta.titular,
                    conta.calcularTaxaMensal(),
                    conta.saldoAposTaxa()
            );
        }
    }
}
