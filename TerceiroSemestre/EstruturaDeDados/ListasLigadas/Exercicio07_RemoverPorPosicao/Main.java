/*
Exercicio 7 — RemoverPorPosicao
Origem: Pratica complementar
Crie A, B e C; remova a posicao 1 e confira rejeicao de posicao fora do intervalo.
*/
import java.util.*;
public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            try {
                ListaLigada l = new ListaLigada("A"); l.adicionar("B"); l.adicionar("C");
                l.removerDaPosicao(1);
                System.out.println(l.imprimirLista());
                System.out.println("Remocao invalida: " + l.removerDaPosicao(9));
            } catch (IllegalArgumentException | ArithmeticException | IllegalStateException erro) {
                System.out.println(erro.getMessage());
            }
        }
    }

}
