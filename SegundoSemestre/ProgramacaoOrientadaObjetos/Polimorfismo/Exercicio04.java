package SegundoSemestre.ProgramacaoOrientadaObjetos.Polimorfismo;

abstract class Pagamento {

    protected double valorCompra;

    public Pagamento(double valorCompra) {

        this.valorCompra = valorCompra;
    }

    public abstract double calcularValorFinal();
}

class PagamentoDinheiro extends Pagamento {

    public PagamentoDinheiro(double valorCompra) {

        super(valorCompra);
    }

    @Override
    public double calcularValorFinal() {

        return valorCompra * 0.90;
    }
}

class PagamentoCartao extends Pagamento {

    public PagamentoCartao(double valorCompra) {

        super(valorCompra);
    }

    @Override
    public double calcularValorFinal() {

        return valorCompra * 1.03;
    }
}

class PagamentoPix extends Pagamento {

    public PagamentoPix(double valorCompra) {

        super(valorCompra);
    }

    @Override
    public double calcularValorFinal() {

        return valorCompra * 0.95;
    }
}

public class Exercicio04 {

    public static void main(String[] args) {

        Pagamento[] pagamentos = {
            new PagamentoDinheiro(500),
            new PagamentoCartao(500),
            new PagamentoPix(500)
        };

        for (Pagamento pagamento : pagamentos) {
            System.out.printf(
                    "%s: R$ %.2f%n",
                    pagamento.getClass().getSimpleName(),
                    pagamento.calcularValorFinal()
            );
        }
    }
}
