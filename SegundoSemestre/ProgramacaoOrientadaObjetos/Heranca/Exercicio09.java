package SegundoSemestre.ProgramacaoOrientadaObjetos.Heranca;

class Ingresso {

    private String evento;
    private double valor;

    public Ingresso(String evento, double valor) {

        this.evento = evento;
        this.valor = valor;
    }

    public String getEvento() {

        return evento;
    }

    public void setEvento(String evento) {

        this.evento = evento;
    }

    public double getValor() {

        return valor;
    }

    public void setValor(double valor) {

        this.valor = valor;
    }
}

class IngressoVip extends Ingresso {

    private double valorAdicional;

    public IngressoVip(String evento, double valor, double valorAdicional) {

        super(evento, valor);
        this.valorAdicional = valorAdicional;
    }

    public double getValorAdicional() {

        return valorAdicional;
    }

    public void setValorAdicional(double valorAdicional) {

        this.valorAdicional = valorAdicional;
    }

    public double calcularValorTotal() {

        return getValor() + valorAdicional;
    }
}

public class Exercicio09 {

    public static void main(String[] args) {

        IngressoVip ingresso = new IngressoVip("Show", 100, 50);

        System.out.println("Evento: " + ingresso.getEvento());
        System.out.println("Valor total: R$ " + ingresso.calcularValorTotal());
    }
}
