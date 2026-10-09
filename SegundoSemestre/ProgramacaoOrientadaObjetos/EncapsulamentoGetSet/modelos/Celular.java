package SegundoSemestre.ProgramacaoOrientadaObjetos.EncapsulamentoGetSet.modelos;

public class Celular {

    private String marca;
    private int bateria;

    public Celular(String marca) {

        this.marca = marca;
        this.bateria = 100;
    }

    public void usar(int consumo) {

        if (consumo > 0 && consumo <= bateria) {

            bateria = bateria - consumo;
        } else {

            System.out.println("Bateria insuficiente.");
        }
    }

    public void carregar() {

        bateria = 100;
        System.out.println("Celular carregado.");
    }

    public String getMarca() {

        return marca;
    }

    public void setMarca(String marca) {

        this.marca = marca;
    }

    public int getBateria() {

        return bateria;
    }

    public void setBateria(int bateria) {

        if (bateria >= 0 && bateria <= 100) {

            this.bateria = bateria;
        }
    }
}
