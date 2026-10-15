/*
Exercicio 8 — Menor&Maior
Origem: Pratica complementar
Encontre os menores e maiores valores seguindo as referencias esquerda e direita.
*/
import java.util.*;
public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            try {
                ArvoreBinaria a = modelo();
                System.out.println("Menor: " + a.menor());
                System.out.println("Maior: " + a.maior());
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
