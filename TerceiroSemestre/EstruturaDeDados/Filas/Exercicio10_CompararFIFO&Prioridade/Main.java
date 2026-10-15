/*
Exercicio 10 — CompararFIFO&Prioridade
Origem: Pratica complementar
Leia cinco numeros, adicione-os numa fila comum e numa fila de prioridade e compare a ordem de remocao.
*/
import java.util.*;
public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            try {
                Fila<Integer> comum = new Fila<>();
                FilaPrioridade prioridade = new FilaPrioridade();
                for (int i = 0; i < 5; i++) { int v = Entrada.inteiro(scanner, "Valor: "); comum.enfileirar(v); prioridade.enfileirar(v); }
                System.out.println("FIFO:");
                while (!comum.estaVazia()) System.out.println(comum.desenfileirar());
                System.out.println("Prioridade:");
                while (!prioridade.estaVazia()) System.out.println(prioridade.desenfileirar());
            } catch (IllegalArgumentException | ArithmeticException | IllegalStateException erro) {
                System.out.println(erro.getMessage());
            }
        }
    }

}
