package SegundoSemestre.ProgramacaoOrientadaObjetos.EncapsulamentoGetSet.papelaria;

public class Lapis {

    private String marca;
    private String dureza;
    private double tamanho;
    private boolean pontaFina;
    private int grafite;

    public Lapis(String marca, String dureza, double tamanho) {

        this.marca = marca;
        this.dureza = dureza;
        this.tamanho = tamanho;
        this.pontaFina = true;
        this.grafite = 50;
    }

    public void escrever(int quantPalavras) {

        if (grafite >= 3) {

            grafite = grafite - 3;
            pontaFina = false;
            System.out.println(quantPalavras + " palavras escritas.");
        } else {

            System.out.println("O lapis esta sem grafite.");
        }
    }

    public void apontar() {

        if (tamanho > 30) {

            tamanho = tamanho - 1;
            pontaFina = true;
            System.out.println("Lapis apontado.");
        } else {

            System.out.println("O lapis esta muito pequeno para apontar.");
        }
    }

    public void utilidade() {

        System.out.println("O lapis e usado para escrever e desenhar.");
    }

    public void status() {

        System.out.println("Marca: " + marca);
        System.out.println("Dureza: " + dureza);
        System.out.println("Tamanho: " + tamanho);
        System.out.println("Ponta fina: " + pontaFina);
        System.out.println("Grafite: " + grafite + "%");
    }

    public String getMarca() {

        return marca;
    }

    public void setMarca(String marca) {

        this.marca = marca;
    }

    public String getDureza() {

        return dureza;
    }

    public void setDureza(String dureza) {

        this.dureza = dureza;
    }

    public double getTamanho() {

        return tamanho;
    }

    public void setTamanho(double tamanho) {

        this.tamanho = tamanho;
    }

    public boolean isPontaFina() {

        return pontaFina;
    }

    public void setPontaFina(boolean pontaFina) {

        this.pontaFina = pontaFina;
    }

    public int getGrafite() {

        return grafite;
    }

    public void setGrafite(int grafite) {

        this.grafite = grafite;
    }
}
