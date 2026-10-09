package SegundoSemestre.ProgramacaoOrientadaObjetos.EncapsulamentoGetSet.principal;

import SegundoSemestre.ProgramacaoOrientadaObjetos.EncapsulamentoGetSet.papelaria.Lapis;
import SegundoSemestre.ProgramacaoOrientadaObjetos.EncapsulamentoGetSet.papelaria.Tesoura;

public class MainPapelaria {

    public static void main(String[] args) {

        Tesoura tesoura = new Tesoura("Escolar", "Aco", 15);

        tesoura.abrir();
        tesoura.cortar(120);
        tesoura.status();

        System.out.println();

        Lapis lapis = new Lapis("Faber-Castell", "HB", 35);

        lapis.escrever(20);
        lapis.apontar();
        lapis.status();
    }
}
