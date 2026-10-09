package SegundoSemestre.ProgramacaoOrientadaObjetos.Heranca;

class Forma {

    private String cor;

    public Forma(String cor) {

        this.cor = cor;
    }

    public String getCor() {

        return cor;
    }

    public void setCor(String cor) {

        this.cor = cor;
    }
}

class Retangulo extends Forma {

    private double largura;
    private double altura;

    public Retangulo(String cor, double largura, double altura) {

        super(cor);
        this.largura = largura;
        this.altura = altura;
    }

    public double getLargura() {

        return largura;
    }

    public void setLargura(double largura) {

        this.largura = largura;
    }

    public double getAltura() {

        return altura;
    }

    public void setAltura(double altura) {

        this.altura = altura;
    }

    public double calcularArea() {

        return largura * altura;
    }
}

public class Exercicio07 {

    public static void main(String[] args) {

        Retangulo retangulo = new Retangulo("Azul", 5, 3);

        System.out.println("Cor: " + retangulo.getCor());
        System.out.println("Area: " + retangulo.calcularArea());
    }
}
