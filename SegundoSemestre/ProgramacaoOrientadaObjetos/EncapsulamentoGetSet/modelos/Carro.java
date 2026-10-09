package SegundoSemestre.ProgramacaoOrientadaObjetos.EncapsulamentoGetSet.modelos;

public class Carro {

    private String modelo;
    private int velocidade;

    public Carro(String modelo) {

        this.modelo = modelo;
        this.velocidade = 0;
    }

    public void acelerar(int valor) {

        if (valor > 0) {

            velocidade = velocidade + valor;
        }
    }

    public void frear(int valor) {

        if (valor > 0 && valor <= velocidade) {

            velocidade = velocidade - valor;
        } else if (valor > velocidade) {

            velocidade = 0;
        }
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

    public void setVelocidade(int velocidade) {

        if (velocidade >= 0) {

            this.velocidade = velocidade;
        }
    }
}
