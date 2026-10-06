package SegundoSemestre.ProgramacaoOrientadaObjetos.SobrecargaConstrutores;

public class Filme {

    String titulo;
    String genero;
    int duracao;
    int classificacao;

    public Filme(String titulo, String genero, int duracao, int classificacao) {
        this.titulo = titulo;
        this.genero = genero;
        this.duracao = duracao;
        this.classificacao = classificacao;
    }

    public Filme(String titulo, String genero, int duracao) {
        this.titulo = titulo;
        this.genero = genero;
        this.duracao = duracao;
        this.classificacao = 0;
    }

    public Filme(String titulo) {
        this.titulo = titulo;
        this.genero = "Nao informado";
        this.duracao = 0;
        this.classificacao = 0;
    }

    public void mostrarDados() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Genero: " + genero);
        System.out.println("Duracao: " + duracao + " minutos");
        System.out.println("Classificacao: " + classificacao);
    }

    public static void main(String[] args) {
        Filme filme1 = new Filme("Interestelar", "Ficcao", 169, 10);
        Filme filme2 = new Filme("Titanic", "Romance", 194);
        Filme filme3 = new Filme("Avatar");

        filme1.mostrarDados();
        filme2.mostrarDados();
        filme3.mostrarDados();
    }
}