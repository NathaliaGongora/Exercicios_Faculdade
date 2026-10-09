package SegundoSemestre.ProgramacaoOrientadaObjetos.EncapsulamentoGetSet.principal;

import SegundoSemestre.ProgramacaoOrientadaObjetos.EncapsulamentoGetSet.banco.ContaBanco;

public class MainContaBanco {

    public static void main(String[] args) {

        ContaBanco conta = new ContaBanco(1001, "Mariana");

        conta.abrirConta("CC", true);
        conta.depositar(200);
        conta.sacar(50);
        conta.pagarMensalidade();
        conta.mostrarDados();
    }
}
