package SegundoSemestre.ProgramacaoOrientadaObjetos.EncapsulamentoGetSet.principal;

import SegundoSemestre.ProgramacaoOrientadaObjetos.EncapsulamentoGetSet.modelos.Funcionario;

public class MainFuncionario {

    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario("Ana", "Atendente", 2000);

        funcionario.aumentarSalario(10);

        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Cargo: " + funcionario.getCargo());
        System.out.println("Salario: R$ " + funcionario.getSalario());
    }
}
