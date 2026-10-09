package SegundoSemestre.ProgramacaoOrientadaObjetos.EncapsulamentoGetSet.principal;

import SegundoSemestre.ProgramacaoOrientadaObjetos.EncapsulamentoGetSet.modelos.Televisao;

public class MainTelevisao {

    public static void main(String[] args) {

        Televisao televisao = new Televisao("LG");

        televisao.ligar();
        televisao.setCanal(12);
        televisao.aumentarVolume();

        System.out.println("Marca: " + televisao.getMarca());
        System.out.println("Canal: " + televisao.getCanal());
        System.out.println("Volume: " + televisao.getVolume());
        System.out.println("Ligada: " + televisao.isLigada());
    }
}
