/*
Exercicio 5 — EsvaziarFila
Origem: Pratica complementar
Leia tres nomes e esvazie a fila. Confira estaVazia ao final.
*/
import java.util.*;
public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            try {
                Fila<String> f = new Fila<>();
                for (int i = 0; i < 3; i++) f.enfileirar(Entrada.texto(scanner, "Nome: "));
                while (!f.estaVazia()) System.out.println(f.desenfileirar());
                System.out.println("Vazia: " + f.estaVazia());
            } catch (IllegalArgumentException | ArithmeticException | IllegalStateException erro) {
                System.out.println(erro.getMessage());
            }
        }
    }

}
