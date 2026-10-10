package SegundoSemestre.ProgramacaoOrientadaObjetos.Polimorfismo;

abstract class EntregaPedido {

    protected String destino;

    public EntregaPedido(String destino) {

        this.destino = destino;
    }

    public abstract void entregar();
}

class EntregaPadrao extends EntregaPedido {

    public EntregaPadrao(String destino) {

        super(destino);
    }

    @Override
    public void entregar() {

        System.out.println("Entrega padrao para " + destino + " em ate 7 dias");
    }
}

class EntregaExpressa extends EntregaPedido {

    public EntregaExpressa(String destino) {

        super(destino);
    }

    @Override
    public void entregar() {

        System.out.println("Entrega expressa para " + destino + " em ate 2 dias");
    }
}

class RetiradaLoja extends EntregaPedido {

    public RetiradaLoja(String destino) {

        super(destino);
    }

    @Override
    public void entregar() {

        System.out.println("Pedido disponivel para retirada em " + destino);
    }
}

class CalculadoraFrete {

    public double calcular(double peso) {

        return peso * 5;
    }

    public double calcular(double peso, double distancia) {

        return peso * 5 + distancia * 0.20;
    }

    public double calcular(double peso, double distancia, boolean urgente) {

        double valor = calcular(peso, distancia);

        if (urgente) {
            valor *= 1.5;
        }

        return valor;
    }
}

public class Exercicio10 {

    public static void main(String[] args) {

        EntregaPedido[] entregas = {
            new EntregaPadrao("Sorocaba"),
            new EntregaExpressa("Campinas"),
            new RetiradaLoja("Loja Centro")
        };

        for (EntregaPedido entrega : entregas) {
            entrega.entregar();
        }

        CalculadoraFrete calculadora = new CalculadoraFrete();

        System.out.printf("Frete por peso: R$ %.2f%n", calculadora.calcular(4));
        System.out.printf("Frete por peso e distancia: R$ %.2f%n", calculadora.calcular(4, 120));
        System.out.printf("Frete urgente: R$ %.2f%n", calculadora.calcular(4, 120, true));
    }
}
