/*
Exercicio 3 — InserirNoInicio
Origem: Pratica complementar
Leia dois valores e adicione cada um no inicio de uma lista inicialmente vazia.
*/
import java.util.*;
public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            try {
                ListaLigada l = new ListaLigada();
                l.adicionarNoInicio(Entrada.texto(scanner, "Primeiro: "));
                l.adicionarNoInicio(Entrada.texto(scanner, "Segundo: "));
                System.out.println(l.imprimirLista());
            } catch (IllegalArgumentException | ArithmeticException | IllegalStateException erro) {
                System.out.println(erro.getMessage());
            }
        }
    }

}
