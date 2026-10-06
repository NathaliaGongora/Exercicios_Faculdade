package SegundoSemestre.ProgramacaoOrientadaObjetos.SobrecargaConstrutores;

public class Retangulo {

    double base;
    double altura;

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Retangulo(double lado) {
        this.base = lado;
        this.altura = lado;
    }

    public double calcularArea() {
        return base * altura;
    }

    public void mostrarDados() {
        System.out.println("Base: " + base);
        System.out.println("Altura: " + altura);
        System.out.println("Area: " + calcularArea());
    }

    public static void main(String[] args) {
        Retangulo r1 = new Retangulo(5, 10);
        Retangulo r2 = new Retangulo(5);

        r1.mostrarDados();
        r2.mostrarDados();
    }
}