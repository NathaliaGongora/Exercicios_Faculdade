package SegundoSemestre.ProgramacaoOrientadaObjetos.EncapsulamentoGetSet.modelos;

public class Aluno {

    private String nome;
    private String ra;
    private double nota;

    public Aluno(String nome, String ra, double nota) {

        this.nome = nome;
        this.ra = ra;
        this.nota = nota;
    }

    public String verificarSituacao() {

        if (nota >= 5) {

            return "Aprovado";
        }

        return "Reprovado";
    }

    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public String getRa() {

        return ra;
    }

    public void setRa(String ra) {

        this.ra = ra;
    }

    public double getNota() {

        return nota;
    }

    public void setNota(double nota) {

        if (nota >= 0 && nota <= 10) {

            this.nota = nota;
        }
    }
}
