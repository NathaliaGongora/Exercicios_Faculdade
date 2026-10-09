package SegundoSemestre.ProgramacaoOrientadaObjetos.EncapsulamentoInterfaces;

interface ControleAluno {

    double calcularMedia();

    String verificarSituacao();

    String exibirBoletim();
}

class AlunoNotas implements ControleAluno {

    private int matricula;
    private String nome;
    private double nota1;
    private double nota2;

    public AlunoNotas(int matricula, String nome, double nota1, double nota2) {

        this.matricula = matricula;
        this.nome = nome;
        setNota1(nota1);
        setNota2(nota2);
    }

    public int getMatricula() {

        return matricula;
    }

    public void setMatricula(int matricula) {

        this.matricula = matricula;
    }

    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public double getNota1() {

        return nota1;
    }

    public void setNota1(double nota1) {

        if (nota1 >= 0 && nota1 <= 10) {
            this.nota1 = nota1;
        }
    }

    public double getNota2() {

        return nota2;
    }

    public void setNota2(double nota2) {

        if (nota2 >= 0 && nota2 <= 10) {
            this.nota2 = nota2;
        }
    }

    @Override
    public double calcularMedia() {

        return (nota1 + nota2) / 2;
    }

    @Override
    public String verificarSituacao() {

        if (calcularMedia() >= 6) {
            return "Aprovado";
        }

        return "Reprovado";
    }

    @Override
    public String exibirBoletim() {

        return "Matricula: " + matricula
                + "\nAluno: " + nome
                + String.format("\nMedia: %.1f", calcularMedia())
                + "\nSituacao: " + verificarSituacao();
    }
}

public class Exercicio05 {

    public static void main(String[] args) {

        AlunoNotas aluno = new AlunoNotas(2026, "Carlos Souza", 7.5, 8);

        System.out.println(aluno.exibirBoletim());
    }
}
