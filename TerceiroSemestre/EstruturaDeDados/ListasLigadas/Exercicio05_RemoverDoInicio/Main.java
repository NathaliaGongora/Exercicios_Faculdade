/*
Exercicio 5 — RemoverDoInicio
Origem: Pratica complementar
Crie A e B, remova o primeiro e mostre lista e tamanho.
*/
import java.util.*;
public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            try {
                ListaLigada l = new ListaLigada("A"); l.adicionar("B");
                l.removerDoInicio();
                System.out.println(l.imprimirLista());
                System.out.println("Tamanho: " + l.tamanhoLista());
            } catch (IllegalArgumentException | ArithmeticException | IllegalStateException erro) {
                System.out.println(erro.getMessage());
            }
        }
    }

}
