/*
Exercicio 10 — ArvoreVazia&Repeticoes
Origem: Pratica complementar
Teste quantidade, busca e percurso na arvore vazia e a politica de valores repetidos.
*/
import java.util.*;
public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            try {
                ArvoreBinaria a = new ArvoreBinaria();
                System.out.println("Vazia: " + a.quantidade());
                System.out.println("Busca: " + a.buscarProfundidade(10));
                a.adicionar(10); a.adicionar(10);
                System.out.println("Quantidade apos repeticao: " + a.quantidade());
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
