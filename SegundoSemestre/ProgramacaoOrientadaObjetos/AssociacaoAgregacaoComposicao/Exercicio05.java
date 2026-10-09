package SegundoSemestre.ProgramacaoOrientadaObjetos.AssociacaoAgregacaoComposicao;

import java.util.ArrayList;
import java.util.List;

class ProfessorEscola {

    private String nome;
    private String disciplina;

    public ProfessorEscola(String nome, String disciplina) {

        this.nome = nome;
        this.disciplina = disciplina;
    }

    public String getNome() {

        return nome;
    }

    public String getDisciplina() {

        return disciplina;
    }
}

class EscolaProfessores {

    private String nome;
    private List<ProfessorEscola> professores = new ArrayList<>();

    public EscolaProfessores(String nome) {

        this.nome = nome;
    }

    public void adicionarProfessor(ProfessorEscola professor) {

        professores.add(professor);
    }

    public void listarProfessores() {

        System.out.println("Escola: " + nome);

        for (ProfessorEscola professor : professores) {
            System.out.println(professor.getNome() + " - " + professor.getDisciplina());
        }
    }
}

public class Exercicio05 {

    public static void main(String[] args) {

        ProfessorEscola professor1 = new ProfessorEscola("Carlos", "Matematica");
        ProfessorEscola professor2 = new ProfessorEscola("Fernanda", "Programacao");

        EscolaProfessores escola = new EscolaProfessores("Faculdade Exemplo");
        escola.adicionarProfessor(professor1);
        escola.adicionarProfessor(professor2);

        escola.listarProfessores();
    }
}
