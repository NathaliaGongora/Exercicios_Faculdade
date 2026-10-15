/*
Exercicio 6 — ContarFolhas
Origem: Pratica complementar
Conte os nos sem filhos da arvore modelo.
*/
import java.util.*;
public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            try {
                System.out.println("Folhas: " + modelo().folhas());
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
