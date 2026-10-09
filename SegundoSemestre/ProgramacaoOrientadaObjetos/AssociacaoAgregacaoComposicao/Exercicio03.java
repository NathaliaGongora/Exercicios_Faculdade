package SegundoSemestre.ProgramacaoOrientadaObjetos.AssociacaoAgregacaoComposicao;

import java.util.ArrayList;
import java.util.List;

class LivroInterno {

    private String titulo;
    private int paginas;

    public LivroInterno(String titulo, int paginas) {

        this.titulo = titulo;
        this.paginas = paginas;
    }

    public String getTitulo() {

        return titulo;
    }

    public int getPaginas() {

        return paginas;
    }
}

class BibliotecaComposta {

    private String nome;
    private List<LivroInterno> livros = new ArrayList<>();

    public BibliotecaComposta(String nome) {

        this.nome = nome;
    }

    public void adicionarLivro(String titulo, int paginas) {

        LivroInterno livro = new LivroInterno(titulo, paginas);
        livros.add(livro);
    }

    public int quantidadeLivros() {

        return livros.size();
    }

    public void listarLivros() {

        System.out.println("Biblioteca: " + nome);

        for (LivroInterno livro : livros) {
            System.out.println(livro.getTitulo() + " - " + livro.getPaginas() + " paginas");
        }
    }
}

public class Exercicio03 {

    public static void main(String[] args) {

        BibliotecaComposta biblioteca = new BibliotecaComposta("Biblioteca Central");

        biblioteca.adicionarLivro("Vidas Secas", 129);
        biblioteca.adicionarLivro("O Auto da Compadecida", 324);

        biblioteca.listarLivros();
        System.out.println("Total de livros: " + biblioteca.quantidadeLivros());
    }
}
