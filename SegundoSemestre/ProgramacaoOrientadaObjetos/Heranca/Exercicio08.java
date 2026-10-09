package SegundoSemestre.ProgramacaoOrientadaObjetos.Heranca;

class Usuario {

    private String nome;
    private String email;

    public Usuario(String nome, String email) {

        this.nome = nome;
        this.email = email;
    }

    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public String getEmail() {

        return email;
    }

    public void setEmail(String email) {

        this.email = email;
    }
}

class Aluno extends Usuario {

    private String curso;

    public Aluno(String nome, String email, String curso) {

        super(nome, email);
        this.curso = curso;
    }

    public String getCurso() {

        return curso;
    }

    public void setCurso(String curso) {

        this.curso = curso;
    }

    public void mostrarDados() {

        System.out.println("Nome: " + getNome());
        System.out.println("Email: " + getEmail());
        System.out.println("Curso: " + curso);
    }
}

public class Exercicio08 {

    public static void main(String[] args) {

        Aluno aluno = new Aluno("Nathalia", "nathalia@email.com", "ADS");

        aluno.mostrarDados();
    }
}
