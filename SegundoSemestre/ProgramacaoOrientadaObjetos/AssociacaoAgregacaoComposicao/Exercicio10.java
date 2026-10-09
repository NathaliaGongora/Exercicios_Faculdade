package SegundoSemestre.ProgramacaoOrientadaObjetos.AssociacaoAgregacaoComposicao;

import java.util.ArrayList;
import java.util.List;

class MotorDoCarro {

    private int potencia;
    private boolean ligado;

    public MotorDoCarro(int potencia) {

        this.potencia = potencia;
    }

    public void ligar() {

        ligado = true;
    }

    public int getPotencia() {

        return potencia;
    }

    public boolean getLigado() {

        return ligado;
    }
}

class PassageiroDoCarro {

    private String nome;

    public PassageiroDoCarro(String nome) {

        this.nome = nome;
    }

    public String getNome() {

        return nome;
    }
}

class CarroCompleto {

    private String modelo;
    private MotorDoCarro motor;
    private List<PassageiroDoCarro> passageiros = new ArrayList<>();

    public CarroCompleto(String modelo, int potenciaMotor) {

        this.modelo = modelo;
        motor = new MotorDoCarro(potenciaMotor);
    }

    public void adicionarPassageiro(PassageiroDoCarro passageiro) {

        passageiros.add(passageiro);
    }

    public void ligar() {

        motor.ligar();
    }

    public void exibirDados() {

        System.out.println("Modelo: " + modelo);
        System.out.println("Motor: " + motor.getPotencia() + " cv");
        System.out.println("Ligado: " + motor.getLigado());
        System.out.println("Passageiros:");

        for (PassageiroDoCarro passageiro : passageiros) {
            System.out.println("- " + passageiro.getNome());
        }
    }
}

public class Exercicio10 {

    public static void main(String[] args) {

        PassageiroDoCarro passageiro1 = new PassageiroDoCarro("Ana");
        PassageiroDoCarro passageiro2 = new PassageiroDoCarro("Paulo");

        CarroCompleto carro = new CarroCompleto("HB20", 120);
        carro.adicionarPassageiro(passageiro1);
        carro.adicionarPassageiro(passageiro2);
        carro.ligar();

        carro.exibirDados();
    }
}
