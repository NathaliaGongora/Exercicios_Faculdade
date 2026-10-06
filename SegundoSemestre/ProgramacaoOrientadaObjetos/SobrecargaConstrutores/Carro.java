package SegundoSemestre.ProgramacaoOrientadaObjetos.SobrecargaConstrutores;

public class Carro {

    String marca;
    String modelo;
    int ano;
    double preco;

    public Carro(String marca, String modelo, int ano, double preco) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.preco = preco;
    }

    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.preco = 0;
    }

    public Carro(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = 0;
        this.preco = 0;
    }

    public void mostrarDados() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Preco: R$ " + preco);
    }

    public static void main(String[] args) {
        Carro carro1 = new Carro("Toyota", "Corolla", 2025, 150000);
        Carro carro2 = new Carro("Honda", "Civic", 2024);
        Carro carro3 = new Carro("Fiat", "Argo");

        carro1.mostrarDados();
        carro2.mostrarDados();
        carro3.mostrarDados();
    }
}