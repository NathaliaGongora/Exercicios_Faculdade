/*
Exercicio 6 — RemoverDoFinal
Origem: Pratica complementar
Crie A e B e remova duas vezes do final. Confira o estado vazio e reinsercao posterior.
*/
import java.util.*;
public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            try {
                ListaLigada l = new ListaLigada("A"); l.adicionar("B");
                l.removerDoFinal(); l.removerDoFinal();
                System.out.println("Vazia: " + l.estaVazio());
                l.adicionar("C");
                System.out.println(l.imprimirLista());
            } catch (IllegalArgumentException | ArithmeticException | IllegalStateException erro) {
                System.out.println(erro.getMessage());
            }
        }
    }

}
