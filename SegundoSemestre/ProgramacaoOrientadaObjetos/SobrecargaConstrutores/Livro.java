package SegundoSemestre.ProgramacaoOrientadaObjetos.SobrecargaConstrutores;

public class Livro {

    String titulo;
    String autor;
    int numeroPaginas;
    double preco;

    public Livro(String titulo, String autor, int numeroPaginas, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
        this.preco = preco;
    }

    public Livro(String titulo, String autor, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
        this.preco = 0;
    }

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = 0;
        this.preco = 0;
    }

    public void mostrarDados() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Paginas: " + numeroPaginas);
        System.out.println("Preco: R$ " + preco);
    }

    public static void main(String[] args) {
        Livro livro1 = new Livro("1984", "George Orwell", 328, 45);
        Livro livro2 = new Livro("Dom Casmurro", "Machado de Assis", 256);
        Livro livro3 = new Livro("O Hobbit", "J. R. R. Tolkien");

        livro1.mostrarDados();
        livro2.mostrarDados();
        livro3.mostrarDados();
    }
}