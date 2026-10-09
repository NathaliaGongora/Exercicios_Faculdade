package SegundoSemestre.ProgramacaoOrientadaObjetos.EncapsulamentoGetSet.principal;

import SegundoSemestre.ProgramacaoOrientadaObjetos.EncapsulamentoGetSet.modelos.Celular;

public class MainCelular {

    public static void main(String[] args) {

        Celular celular = new Celular("Samsung");

        celular.usar(25);

        System.out.println("Marca: " + celular.getMarca());
        System.out.println("Bateria: " + celular.getBateria() + "%");
    }
}
