package SegundoSemestre.ProgramacaoOrientadaObjetos.Heranca;

class Veiculo {

    private String marca;
    private String modelo;

    public Veiculo(String marca, String modelo) {

        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {

        return marca;
    }

    public void setMarca(String marca) {

        this.marca = marca;
    }

    public String getModelo() {

        return modelo;
    }

    public void setModelo(String modelo) {

        this.modelo = modelo;
    }
}

class Carro extends Veiculo {

    private int quantidadePortas;

    public Carro(String marca, String modelo, int quantidadePortas) {

        super(marca, modelo);
        this.quantidadePortas = quantidadePortas;
    }

    public int getQuantidadePortas() {

        return quantidadePortas;
    }

    public void setQuantidadePortas(int quantidadePortas) {

        this.quantidadePortas = quantidadePortas;
    }

    public void mostrarDados() {

        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Quantidade de portas: " + quantidadePortas);
    }
}

public class Exercicio02 {

    public static void main(String[] args) {

        Carro carro = new Carro("Hyundai", "HB20", 4);

        carro.mostrarDados();
    }
}
