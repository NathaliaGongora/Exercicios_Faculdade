package SegundoSemestre.ProgramacaoOrientadaObjetos.SobrecargaConstrutores;

public class Computador {

    String marca;
    String processador;
    int memoriaRam;
    double preco;

    public Computador(String marca, String processador, int memoriaRam, double preco) {
        this.marca = marca;
        this.processador = processador;
        this.memoriaRam = memoriaRam;
        this.preco = preco;
    }

    public Computador(String marca, String processador, int memoriaRam) {
        this.marca = marca;
        this.processador = processador;
        this.memoriaRam = memoriaRam;
        this.preco = 0;
    }

    public Computador(String marca) {
        this.marca = marca;
        this.processador = "Nao informado";
        this.memoriaRam = 0;
        this.preco = 0;
    }

    public void mostrarDados() {
        System.out.println("Marca: " + marca);
        System.out.println("Processador: " + processador);
        System.out.println("Memoria RAM: " + memoriaRam + " GB");
        System.out.println("Preco: R$ " + preco);
    }

    public static void main(String[] args) {
        Computador c1 = new Computador("Dell", "Intel i5", 16, 4500);
        Computador c2 = new Computador("Lenovo", "Ryzen 5", 8);
        Computador c3 = new Computador("Samsung");

        c1.mostrarDados();
        c2.mostrarDados();
        c3.mostrarDados();
    }
}