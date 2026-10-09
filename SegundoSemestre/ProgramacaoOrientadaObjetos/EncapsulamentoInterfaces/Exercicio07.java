package SegundoSemestre.ProgramacaoOrientadaObjetos.EncapsulamentoInterfaces;

interface ControleTelevisao {

    void ligar();

    void desligar();

    void aumentarVolume();

    void diminuirVolume();

    void mudarCanal(int canal);

    String exibirStatus();
}

class Televisao implements ControleTelevisao {

    private boolean ligada;
    private int volume;
    private int canal;

    public Televisao(int volume, int canal) {

        this.volume = volume;
        this.canal = canal;
    }

    public boolean getLigada() {

        return ligada;
    }

    public int getVolume() {

        return volume;
    }

    public int getCanal() {

        return canal;
    }

    @Override
    public void ligar() {

        ligada = true;
    }

    @Override
    public void desligar() {

        ligada = false;
    }

    @Override
    public void aumentarVolume() {

        if (ligada && volume < 100) {
            volume++;
        }
    }

    @Override
    public void diminuirVolume() {

        if (ligada && volume > 0) {
            volume--;
        }
    }

    @Override
    public void mudarCanal(int canal) {

        if (ligada && canal > 0) {
            this.canal = canal;
        }
    }

    @Override
    public String exibirStatus() {

        return "Ligada: " + ligada
                + "\nVolume: " + volume
                + "\nCanal: " + canal;
    }
}

public class Exercicio07 {

    public static void main(String[] args) {

        Televisao televisao = new Televisao(20, 5);

        televisao.ligar();
        televisao.aumentarVolume();
        televisao.aumentarVolume();
        televisao.mudarCanal(12);

        System.out.println(televisao.exibirStatus());
    }
}
