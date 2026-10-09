package SegundoSemestre.ProgramacaoOrientadaObjetos.EncapsulamentoGetSet.principal;

import SegundoSemestre.ProgramacaoOrientadaObjetos.EncapsulamentoGetSet.modelos.Aluno;

public class MainAluno {

    public static void main(String[] args) {

        Aluno aluno = new Aluno("Carlos", "12345", 8.5);

        System.out.println("Nome: " + aluno.getNome());
        System.out.println("RA: " + aluno.getRa());
        System.out.println("Nota: " + aluno.getNota());
        System.out.println("Situacao: " + aluno.verificarSituacao());
    }
}
