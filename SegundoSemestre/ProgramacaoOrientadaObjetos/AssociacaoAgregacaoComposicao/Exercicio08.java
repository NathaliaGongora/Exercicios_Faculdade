package SegundoSemestre.ProgramacaoOrientadaObjetos.AssociacaoAgregacaoComposicao;

import java.util.ArrayList;
import java.util.List;

class JogadorTime {

    private String nome;
    private int numero;

    public JogadorTime(String nome, int numero) {

        this.nome = nome;
        this.numero = numero;
    }

    public String getNome() {

        return nome;
    }

    public int getNumero() {

        return numero;
    }
}

class TimeJogadores {

    private String nome;
    private List<JogadorTime> jogadores = new ArrayList<>();

    public TimeJogadores(String nome) {

        this.nome = nome;
    }

    public void contratar(JogadorTime jogador) {

        jogadores.add(jogador);
    }

    public void listarElenco() {

        System.out.println("Time: " + nome);

        for (JogadorTime jogador : jogadores) {
            System.out.println(jogador.getNumero() + " - " + jogador.getNome());
        }
    }
}

public class Exercicio08 {

    public static void main(String[] args) {

        JogadorTime jogador1 = new JogadorTime("Rafael", 10);
        JogadorTime jogador2 = new JogadorTime("Bruno", 7);

        TimeJogadores time = new TimeJogadores("Azul Futebol Clube");
        time.contratar(jogador1);
        time.contratar(jogador2);

        time.listarElenco();
    }
}
