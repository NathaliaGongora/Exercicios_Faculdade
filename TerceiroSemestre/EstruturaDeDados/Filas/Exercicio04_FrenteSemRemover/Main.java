/*
Exercicio 4 — FrenteSemRemover
Origem: Pratica complementar
Enfileire dois inteiros e confira que consultar a frente nao altera o tamanho.
*/
import java.util.*;
public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            try {
                Fila<Integer> f = new Fila<>();
                f.enfileirar(Entrada.inteiro(scanner, "Valor: "));
                f.enfileirar(Entrada.inteiro(scanner, "Valor: "));
                System.out.println("Frente: " + f.frente());
                System.out.println("Tamanho: " + f.tamanho());
            } catch (IllegalArgumentException | ArithmeticException | IllegalStateException erro) {
                System.out.println(erro.getMessage());
            }
        }
    }

}
