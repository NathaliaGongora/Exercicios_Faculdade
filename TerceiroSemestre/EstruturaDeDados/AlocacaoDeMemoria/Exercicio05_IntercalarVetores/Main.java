/*
Exercicio 5 — IntercalarVetores
Origem: Lista do professor
Leia dois vetores de cinco inteiros e retorne um terceiro com dez posicoes, alternando um valor de cada vetor.
*/
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            try {
                int[] a = lerVetor(scanner, 5);
                int[] b = lerVetor(scanner, 5);
                System.out.println("Intercalado: " + Arrays.toString(intercalarVetores(a, b)));
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

    static int[] intercalarVetores(int[] a, int[] b) {
        int[] resultado = new int[10];
        for (int i = 0; i < 5; i++) { resultado[2*i] = a[i]; resultado[2*i+1] = b[i]; }
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
