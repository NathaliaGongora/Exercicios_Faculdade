package SegundoSemestre.ProgramacaoOrientadaObjetos.Polimorfismo;

abstract class FormaGeometrica {

    private String cor;

    public FormaGeometrica(String cor) {

        this.cor = cor;
    }

    public String getCor() {

        return cor;
    }

    public abstract double calcularArea();
}

class TrianguloForma extends FormaGeometrica {

    protected double base;
    protected double altura;

    public TrianguloForma(String cor, double base, double altura) {

        super(cor);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {

        return base * altura / 2;
    }
}

class CirculoForma extends FormaGeometrica {

    private double raio;

    public CirculoForma(String cor, double raio) {

        super(cor);
        this.raio = raio;
    }

    @Override
    public double calcularArea() {

        return Math.PI * raio * raio;
    }
}

class RetanguloForma extends FormaGeometrica {

    private double base;
    private double altura;

    public RetanguloForma(String cor, double base, double altura) {

        super(cor);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {

        return base * altura;
    }
}

class TrapezioForma extends FormaGeometrica {

    private double baseMaior;
    private double baseMenor;
    private double altura;

    public TrapezioForma(String cor, double baseMaior, double baseMenor, double altura) {

        super(cor);
        this.baseMaior = baseMaior;
        this.baseMenor = baseMenor;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {

        return (baseMaior + baseMenor) * altura / 2;
    }
}

class TrianguloEquilatero extends TrianguloForma {

    private double lado;

    public TrianguloEquilatero(String cor, double lado) {

        super(cor, lado, lado * Math.sqrt(3) / 2);
        this.lado = lado;
    }

    @Override
    public double calcularArea() {

        return lado * lado * Math.sqrt(3) / 4;
    }
}

class TrianguloRetangulo extends TrianguloForma {

    public TrianguloRetangulo(String cor, double base, double altura) {

        super(cor, base, altura);
    }

    @Override
    public double calcularArea() {

        return base * altura / 2;
    }
}

public class Exercicio02 {

    public static void main(String[] args) {

        FormaGeometrica[] formas = {
            new TrianguloForma("Verde", 10, 6),
            new CirculoForma("Azul", 4),
            new RetanguloForma("Vermelho", 8, 5),
            new TrapezioForma("Amarelo", 10, 6, 4),
            new TrianguloEquilatero("Branco", 7),
            new TrianguloRetangulo("Preto", 9, 4)
        };

        for (FormaGeometrica forma : formas) {
            System.out.printf(
                    "%s | Cor: %s | Area: %.2f%n",
                    forma.getClass().getSimpleName(),
                    forma.getCor(),
                    forma.calcularArea()
            );
        }
    }
}
