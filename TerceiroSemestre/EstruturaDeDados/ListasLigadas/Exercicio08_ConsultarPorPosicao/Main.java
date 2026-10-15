/*
Exercicio 8 — ConsultarPorPosicao
Origem: Pratica complementar
Leia dois valores e consulte o segundo sem remover. Confira tamanho e consulta fora do intervalo.
*/
import java.util.*;
public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            try {
                ListaLigada l = new ListaLigada(Entrada.texto(scanner, "Primeiro: "));
                l.adicionar(Entrada.texto(scanner, "Segundo: "));
                System.out.println("Posicao 1: " + l.getLista(1));
                System.out.println("Tamanho: " + l.tamanhoLista());
                System.out.println("Posicao 9: " + l.getLista(9));
            } catch (IllegalArgumentException | ArithmeticException | IllegalStateException erro) {
                System.out.println(erro.getMessage());
            }
        }
    }

}
