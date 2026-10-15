/*
Exercicio 1 — Busca&Profundidade
Origem: Exercicio 1 dos slides
Crie uma arvore binaria de busca de inteiros, com menores a esquerda e maiores a direita. Implemente busca que retorna a profundidade ou -1, e percurso imprimindo valor e profundidade de cada no.
*/
import java.util.*;
public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            try {
                ArvoreBinaria arvore = new ArvoreBinaria();
                int n = Entrada.faixa(scanner, "Quantidade (0 a 100): ", 0, 100);
                for (int i = 0; i < n; i++) arvore.adicionar(Entrada.inteiro(scanner, "Valor: "));
                arvore.imprimirProfundidades();
                int valor = Entrada.inteiro(scanner, "Buscar: ");
                System.out.println("Profundidade: " + arvore.buscarProfundidade(valor));
            } catch (IllegalArgumentException | ArithmeticException | IllegalStateException erro) {
                System.out.println(erro.getMessage());
            }
        }
    }

}
