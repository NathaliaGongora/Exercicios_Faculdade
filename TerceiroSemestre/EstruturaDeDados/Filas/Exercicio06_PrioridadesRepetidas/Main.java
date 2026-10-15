/*
Exercicio 6 — PrioridadesRepetidas
Origem: Pratica complementar
Insira cinco numeros na fila de prioridade e remova-os em ordem crescente, preservando repeticoes.
*/
import java.util.*;
public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            try {
                FilaPrioridade f = new FilaPrioridade();
                for (int i = 0; i < 5; i++) f.enfileirar(Entrada.inteiro(scanner, "Numero: "));
                f.exibirFila();
                while (!f.estaVazia()) System.out.println(f.desenfileirar());
            } catch (IllegalArgumentException | ArithmeticException | IllegalStateException erro) {
                System.out.println(erro.getMessage());
            }
        }
    }

}
