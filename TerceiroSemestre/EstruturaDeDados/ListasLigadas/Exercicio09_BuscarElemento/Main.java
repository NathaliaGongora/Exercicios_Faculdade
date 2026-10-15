/*
Exercicio 9 — BuscarElemento
Origem: Pratica complementar
Percorra uma lista por indice e descubra a primeira posicao de um valor informado. Retorne -1 quando nao existir.
*/
import java.util.*;
public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            try {
                ListaLigada l = new ListaLigada("A"); l.adicionar("B"); l.adicionar("C");
                String alvo = Entrada.texto(scanner, "Buscar: ");
                int posicao = -1;
                for (int i = 0; i < l.tamanhoLista(); i++) { if (alvo.equals(l.getLista(i))) { posicao = i; break; } }
                System.out.println("Posicao: " + posicao);
            } catch (IllegalArgumentException | ArithmeticException | IllegalStateException erro) {
                System.out.println(erro.getMessage());
            }
        }
    }

}
