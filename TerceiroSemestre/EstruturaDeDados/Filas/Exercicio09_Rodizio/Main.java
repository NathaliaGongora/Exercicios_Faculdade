/*
Exercicio 9 — Rodizio
Origem: Pratica complementar
Leia tres participantes. Retire o primeiro e reinsira no final durante quatro rodadas.
*/
import java.util.*;
public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            try {
                Fila<String> f = new Fila<>();
                for (int i = 0; i < 3; i++) f.enfileirar(Entrada.texto(scanner, "Participante: "));
                for (int i = 0; i < 4; i++) { String nome = f.desenfileirar(); System.out.println("Vez de " + nome); f.enfileirar(nome); }
            } catch (IllegalArgumentException | ArithmeticException | IllegalStateException erro) {
                System.out.println(erro.getMessage());
            }
        }
    }

}
