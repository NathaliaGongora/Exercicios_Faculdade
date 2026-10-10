package SegundoSemestre.ProgramacaoOrientadaObjetos.Polimorfismo;

abstract class VeiculoAluguel {

    protected String modelo;
    protected int diarias;

    public VeiculoAluguel(String modelo, int diarias) {

        this.modelo = modelo;
        this.diarias = diarias;
    }

    public abstract double calcularAluguel();
}

class CarroAluguel extends VeiculoAluguel {

    public CarroAluguel(String modelo, int diarias) {

        super(modelo, diarias);
    }

    @Override
    public double calcularAluguel() {

        return diarias * 150;
    }
}

class MotoAluguel extends VeiculoAluguel {

    public MotoAluguel(String modelo, int diarias) {

        super(modelo, diarias);
    }

    @Override
    public double calcularAluguel() {

        return diarias * 80;
    }
}

class CaminhaoAluguel extends VeiculoAluguel {

    public CaminhaoAluguel(String modelo, int diarias) {

        super(modelo, diarias);
    }

    @Override
    public double calcularAluguel() {

        return diarias * 350;
    }
}

public class Exercicio07 {

    public static void main(String[] args) {

        VeiculoAluguel[] veiculos = {
            new CarroAluguel("Onix", 4),
            new MotoAluguel("CG 160", 3),
            new CaminhaoAluguel("Accelo", 2)
        };

        for (VeiculoAluguel veiculo : veiculos) {
            System.out.printf("%s: R$ %.2f%n", veiculo.modelo, veiculo.calcularAluguel());
        }
    }
}
