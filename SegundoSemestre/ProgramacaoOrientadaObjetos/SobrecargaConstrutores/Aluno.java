package SegundoSemestre.ProgramacaoOrientadaObjetos.SobrecargaConstrutores;

public class Aluno {

    String nome;
    String ra;
    double nota1;
    double nota2;
    double nota3;
    double nota4;
    double notaFinal;
    double presenca;
    boolean ead;

    public Aluno(String nome, String ra, double nota1,
                 double presenca, boolean ead) {
        this.nome = nome;
        this.ra = ra;
        this.nota1 = nota1;
        this.presenca = presenca;
        this.ead = ead;
        notaFinal = nota1;
    }

    public Aluno(String nome, String ra, double nota1, double nota2,
                 double presenca, boolean ead) {
        this.nome = nome;
        this.ra = ra;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.presenca = presenca;
        this.ead = ead;
        notaFinal = calcularMedia2();
    }

    public Aluno(String nome, String ra, double nota1, double nota2,
                 double nota3, double presenca, boolean ead) {
        this.nome = nome;
        this.ra = ra;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.presenca = presenca;
        this.ead = ead;
        notaFinal = calcularMedia3();
    }

    public Aluno(String nome, String ra, double ac1, double ac2,
                 double ag, double af, double presenca, boolean ead) {
        this.nome = nome;
        this.ra = ra;
        this.nota1 = ac1;
        this.nota2 = ac2;
        this.nota3 = ag;
        this.nota4 = af;
        this.presenca = presenca;
        this.ead = ead;
        notaFinal = calcularMedia4();
    }

    public double calcularMedia2() {
        return (nota1 + nota2) / 2;
    }

    public double calcularMedia3() {
        return (nota1 * 1 + nota2 * 2 + nota3 * 4) / 7;
    }

    public double calcularMedia4() {
        return (nota1 * 0.15)
                + (nota2 * 0.30)
                + (nota3 * 0.10)
                + (nota4 * 0.45);
    }

    public String verificarSituacao() {
        if (ead == true) {
            if (notaFinal >= 5) {
                return "Aprovado";
            } else {
                return "Reprovado";
            }
        } else {
            if (notaFinal >= 5 && presenca >= 75) {
                return "Aprovado";
            } else {
                return "Reprovado";
            }
        }
    }

    public void imprimirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("RA: " + ra);
        System.out.println("Nota Final: " + notaFinal);
        System.out.println("Situacao: " + verificarSituacao());
    }

    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Maria", "123456", 7.0, 8.0, 80, false);
        aluno1.imprimirDados();

        System.out.println();

        Aluno aluno2 = new Aluno("Joao", "654321", 6.0, 7.0, 8.0, 90, false);
        aluno2.imprimirDados();

        System.out.println();

        Aluno aluno3 = new Aluno("Ana", "987654", 7.0, 8.0, 9.0, 6.0, 85, false);
        aluno3.imprimirDados();

        System.out.println();

        Aluno aluno4 = new Aluno("Carlos", "456789", 4.0, 6.0, 7.0, 8.0, 0, true);
        aluno4.imprimirDados();
    }
}