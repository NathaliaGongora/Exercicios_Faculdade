/*
Exercicio 3 — AtendimentoFIFO
Origem: Pratica complementar
Leia tres nomes e atenda-os na ordem de chegada.
*/
import java.util.*;
public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            try {
                Fila<String> f = new Fila<>();
                for (int i = 0; i < 3; i++) f.enfileirar(Entrada.texto(scanner, "Nome: "));
                while (!f.estaVazia()) System.out.println("Atendendo: " + f.desenfileirar());
            } catch (IllegalArgumentException | ArithmeticException | IllegalStateException erro) {
                System.out.println(erro.getMessage());
            }
        }
    }

}
