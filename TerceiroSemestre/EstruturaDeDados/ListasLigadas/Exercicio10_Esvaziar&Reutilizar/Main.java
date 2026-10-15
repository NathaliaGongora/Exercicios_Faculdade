/*
Exercicio 10 — Esvaziar&Reutilizar
Origem: Pratica complementar
Adicione tres valores, remova todos e confira nova insercao sem perder as referencias da lista.
*/
import java.util.*;
public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            try {
                ListaLigada l = new ListaLigada("A"); l.adicionar("B"); l.adicionar("C");
                while (!l.estaVazio()) l.removerDoInicio();
                System.out.println(l.imprimirLista());
                l.adicionar("Novo");
                System.out.println(l.imprimirLista());
            } catch (IllegalArgumentException | ArithmeticException | IllegalStateException erro) {
                System.out.println(erro.getMessage());
            }
        }
    }

}
