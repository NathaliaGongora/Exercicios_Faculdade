package SegundoSemestre.ProgramacaoOrientadaObjetos.EncapsulamentoGetSet.modelos;

public class Televisao {

    private String marca;
    private int canal;
    private int volume;
    private boolean ligada;

    public Televisao(String marca) {

        this.marca = marca;
        this.canal = 1;
        this.volume = 10;
        this.ligada = false;
    }

    public void ligar() {

        ligada = true;
    }

    public void desligar() {

        ligada = false;
    }

    public void aumentarVolume() {

        if (ligada && volume < 100) {

            volume++;
        }
    }

    public String getMarca() {

        return marca;
    }

    public void setMarca(String marca) {

        this.marca = marca;
    }

    public int getCanal() {

        return canal;
    }

    public void setCanal(int canal) {

        if (canal > 0) {

            this.canal = canal;
        }
    }

    public int getVolume() {

        return volume;
    }

    public void setVolume(int volume) {

        if (volume >= 0 && volume <= 100) {

            this.volume = volume;
        }
    }

    public boolean isLigada() {

        return ligada;
    }

    public void setLigada(boolean ligada) {

        this.ligada = ligada;
    }
}
