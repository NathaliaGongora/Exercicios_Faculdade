/*
Exercicio 4 — InserirPorPosicao
Origem: Pratica complementar
Crie A e C e insira o valor lido na posicao 1. Teste tambem a rejeicao de indice negativo.
*/
import java.util.*;
public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            try {
                ListaLigada l = new ListaLigada("A"); l.adicionar("C");
                l.adicionarNaPosicao(Entrada.texto(scanner, "Valor para posicao 1: "), 1);
                System.out.println(l.imprimirLista());
                System.out.println("Indice negativo aceito: " + l.adicionarNaPosicao("X", -1));
            } catch (IllegalArgumentException | ArithmeticException | IllegalStateException erro) {
                System.out.println(erro.getMessage());
            }
        }
    }

}
