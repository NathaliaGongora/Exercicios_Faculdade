package SegundoSemestre.ProgramacaoOrientadaObjetos.EncapsulamentoInterfaces;

interface ControleVeiculo {

    void ligar();

    void desligar();

    void acelerar(int valor);

    void frear(int valor);

    String exibirStatus();
}

class VeiculoControle implements ControleVeiculo {

    private String modelo;
    private int velocidade;
    private boolean ligado;

    public VeiculoControle(String modelo) {

        this.modelo = modelo;
    }

    public String getModelo() {

        return modelo;
    }

    public void setModelo(String modelo) {

        this.modelo = modelo;
    }

    public int getVelocidade() {

        return velocidade;
    }

    public boolean getLigado() {

        return ligado;
    }

    @Override
    public void ligar() {

        ligado = true;
    }

    @Override
    public void desligar() {

        if (velocidade == 0) {
            ligado = false;
        }
    }

    @Override
    public void acelerar(int valor) {

        if (ligado && valor > 0) {
            velocidade += valor;
        }
    }

    @Override
    public void frear(int valor) {

        if (valor > 0) {
            velocidade -= valor;

            if (velocidade < 0) {
                velocidade = 0;
            }
        }
    }

    @Override
    public String exibirStatus() {

        return "Modelo: " + modelo
                + "\nLigado: " + ligado
                + "\nVelocidade: " + velocidade + " km/h";
    }
}

public class Exercicio06 {

    public static void main(String[] args) {

        VeiculoControle veiculo = new VeiculoControle("Onix");

        veiculo.ligar();
        veiculo.acelerar(50);
        veiculo.frear(15);

        System.out.println(veiculo.exibirStatus());
    }
}
