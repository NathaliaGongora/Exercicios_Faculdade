package SegundoSemestre.ProgramacaoOrientadaObjetos.Heranca;

class Imovel {

    private String endereco;
    private double preco;

    public Imovel(String endereco, double preco) {

        this.endereco = endereco;
        this.preco = preco;
    }

    public String getEndereco() {

        return endereco;
    }

    public void setEndereco(String endereco) {

        this.endereco = endereco;
    }

    public double getPreco() {

        return preco;
    }

    public void setPreco(double preco) {

        this.preco = preco;
    }
}

class Casa extends Imovel {

    private int quantidadeQuartos;

    public Casa(String endereco, double preco, int quantidadeQuartos) {

        super(endereco, preco);
        this.quantidadeQuartos = quantidadeQuartos;
    }

    public int getQuantidadeQuartos() {

        return quantidadeQuartos;
    }

    public void setQuantidadeQuartos(int quantidadeQuartos) {

        this.quantidadeQuartos = quantidadeQuartos;
    }

    public void mostrarDados() {

        System.out.println("Endereco: " + getEndereco());
        System.out.println("Preco: R$ " + getPreco());
        System.out.println("Quantidade de quartos: " + quantidadeQuartos);
    }
}

public class Exercicio10 {

    public static void main(String[] args) {

        Casa casa = new Casa("Rua das Flores, 100", 350000, 3);

        casa.mostrarDados();
    }
}
