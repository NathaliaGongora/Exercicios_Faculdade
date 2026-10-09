package SegundoSemestre.ProgramacaoOrientadaObjetos.EncapsulamentoInterfaces;

interface ControleLivro {

    void emprestar();

    void devolver();

    String exibirStatus();
}

class LivroBiblioteca implements ControleLivro {

    private String titulo;
    private String autor;
    private boolean emprestado;

    public LivroBiblioteca(String titulo, String autor) {

        this.titulo = titulo;
        this.autor = autor;
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

    public boolean getEmprestado() {

        return emprestado;
    }

    @Override
    public void emprestar() {

        if (!emprestado) {
            emprestado = true;
        }
    }

    @Override
    public void devolver() {

        if (emprestado) {
            emprestado = false;
        }
    }

    @Override
    public String exibirStatus() {

        String situacao;

        if (emprestado) {
            situacao = "Emprestado";
        } else {
            situacao = "Disponivel";
        }

        return "Titulo: " + titulo
                + "\nAutor: " + autor
                + "\nSituacao: " + situacao;
    }
}

public class Exercicio09 {

    public static void main(String[] args) {

        LivroBiblioteca livro = new LivroBiblioteca(
                "O Pequeno Principe",
                "Antoine de Saint-Exupery"
        );

        livro.emprestar();

        System.out.println(livro.exibirStatus());
    }
}
