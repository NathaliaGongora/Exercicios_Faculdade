package SegundoSemestre.ProgramacaoOrientadaObjetos.Heranca;

class Produto {

    private String nome;
    private double preco;

    public Produto(String nome, double preco) {

        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public double getPreco() {

        return preco;
    }

    public void setPreco(double preco) {

        this.preco = preco;
    }
}

class Livro extends Produto {

    private String autor;

    public Livro(String nome, double preco, String autor) {

        super(nome, preco);
        this.autor = autor;
    }

    public String getAutor() {

        return autor;
    }

    public void setAutor(String autor) {

        this.autor = autor;
    }

    public void mostrarDados() {

        System.out.println("Livro: " + getNome());
        System.out.println("Preco: R$ " + getPreco());
        System.out.println("Autor: " + autor);
    }
}

public class Exercicio05 {

    public static void main(String[] args) {

        Livro livro = new Livro("Dom Casmurro", 39.90, "Machado de Assis");

        livro.mostrarDados();
    }
}
