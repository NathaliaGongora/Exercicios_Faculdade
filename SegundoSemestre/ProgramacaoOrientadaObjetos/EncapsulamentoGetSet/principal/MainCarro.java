package SegundoSemestre.ProgramacaoOrientadaObjetos.EncapsulamentoGetSet.principal;

import SegundoSemestre.ProgramacaoOrientadaObjetos.EncapsulamentoGetSet.modelos.Carro;

public class MainCarro {

    public static void main(String[] args) {

        Carro carro = new Carro("HB20");

        carro.acelerar(60);
        carro.frear(20);

        System.out.println("Modelo: " + carro.getModelo());
        System.out.println("Velocidade: " + carro.getVelocidade() + " km/h");
    }
}
