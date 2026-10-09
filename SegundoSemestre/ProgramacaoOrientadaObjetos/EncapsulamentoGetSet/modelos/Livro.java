package SegundoSemestre.ProgramacaoOrientadaObjetos.EncapsulamentoGetSet.modelos;

public class Livro {

    private String titulo;
    private String autor;
    private boolean disponivel;

    public Livro(String titulo, String autor) {

        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = true;
    }

    public void emprestar() {

        if (disponivel) {

            disponivel = false;
            System.out.println("Livro emprestado.");
        } else {

            System.out.println("Livro indisponivel.");
        }
    }

    public void devolver() {

        disponivel = true;
        System.out.println("Livro devolvido.");
    }

    public String getTitulo() {

        return titulo;
    }

    public void setTitulo(String titulo) {

        this.titulo = titulo;
    }

    public String getAutor() {

        return autor;
    }

    public void setAutor(String autor) {

        this.autor = autor;
    }

    public boolean isDisponivel() {

        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {

        this.disponivel = disponivel;
    }
}
