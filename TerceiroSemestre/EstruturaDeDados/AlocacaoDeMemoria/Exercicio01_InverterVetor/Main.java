/*
Exercicio 1 — InverterVetor
Origem: Lista do professor
Leia oito inteiros com Scanner. Crie um metodo que retorne outro vetor na ordem inversa. Exiba o original e o invertido.
*/
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            try {
                int[] original = lerVetor(scanner, 8);
                System.out.println("Original: " + Arrays.toString(original));
                System.out.println("Invertido: " + Arrays.toString(inverter(original)));
            } catch (IllegalArgumentException | ArithmeticException erro) {
                System.out.println(erro.getMessage());
            }
        }
    }
    static int[] lerVetor(Scanner scanner, int tamanho) {
        int[] vetor = new int[tamanho];
        for (int i = 0; i < tamanho; i++) vetor[i] = Entrada.inteiro(scanner, "Valor [" + i + "]: ");
        return vetor;
    }
    static void imprimirMatriz(int[][] matriz) {
        for (int[] linha : matriz) {
            for (int valor : linha) System.out.print("|\t" + valor + "\t");
            System.out.println("|");
        }
    }

    static int[] inverter(int[] original) {
        int[] resultado = new int[original.length];
        for (int i = 0; i < original.length; i++) resultado[i] = original[original.length - 1 - i];
        return resultado;
    }
}

class Entrada {
    static int inteiro(java.util.Scanner scanner, String mensagem) {
        while (true) {
            System.out.print(mensagem);
            if (!scanner.hasNextLine()) throw new IllegalArgumentException("Entrada encerrada.");
            try { return Integer.parseInt(scanner.nextLine().trim()); }
            catch (NumberFormatException erro) { System.out.println("Digite um numero inteiro valido."); }
        }
    }
    static int faixa(java.util.Scanner scanner, String mensagem, int minimo, int maximo) {
        while (true) {
            int valor = inteiro(scanner, mensagem);
            if (valor >= minimo && valor <= maximo) return valor;
            System.out.println("Informe um valor de " + minimo + " a " + maximo + ".");
        }
    }
    static String texto(java.util.Scanner scanner, String mensagem) {
        System.out.print(mensagem);
        if (!scanner.hasNextLine()) throw new IllegalArgumentException("Entrada encerrada.");
        return scanner.nextLine();
    }
}
