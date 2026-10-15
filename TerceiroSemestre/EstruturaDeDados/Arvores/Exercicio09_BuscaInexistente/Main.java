/*
Exercicio 9 — BuscaInexistente
Origem: Pratica complementar
Busque um valor inexistente e compare com a profundidade da raiz.
*/
import java.util.*;
public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            try {
                ArvoreBinaria a = modelo();
                System.out.println("Raiz: " + a.buscarProfundidade(5));
                System.out.println("Ausente: " + a.buscarProfundidade(99));
            } catch (IllegalArgumentException | ArithmeticException | IllegalStateException erro) {
                System.out.println(erro.getMessage());
            }
        }
    }
    static ArvoreBinaria modelo() {
        ArvoreBinaria arvore = new ArvoreBinaria();
        int[] valores = {5, 3, 1, 2, 4, 8, 7, 6, 9};
        for (int valor : valores) arvore.adicionar(valor);
        return arvore;
    }
}
