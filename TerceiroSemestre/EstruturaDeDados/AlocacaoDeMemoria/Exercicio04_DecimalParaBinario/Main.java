/*
Exercicio 4 — DecimalParaBinario
Origem: Lista do professor
Leia um inteiro entre 0 e 255. Retorne um vetor de oito bits, preenchido do fim para o inicio com % 2 e / 2. Imprima os oito bits.
*/
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            try {
                int valor = Entrada.faixa(scanner, "Decimal de 0 a 255: ", 0, 255);
                System.out.print("Binario: ");
                for (int bit : decimalParaBinario(valor)) System.out.print(bit);
                System.out.println();
            } catch (IllegalArgumentException | ArithmeticException erro) {
                System.out.println(erro.getMessage());
            }
        }
    }
    static int[] decimalParaBinario(int valor) {
        int[] bits = new int[8];
        for (int i = 7; i >= 0; i--) { bits[i] = valor % 2; valor /= 2; }
        return bits;
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
