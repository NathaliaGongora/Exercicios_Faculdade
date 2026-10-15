/*
Exercicio 3 — BinarioParaDecimal
Origem: Lista do professor
Leia um vetor de oito bits, aceitando somente 0 ou 1. Converta-o para decimal sem sinal usando um metodo e imprima o resultado.
*/
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            try {
                int[] bits = new int[8];
                for (int i = 0; i < bits.length; i++) bits[i] = Entrada.faixa(scanner, "Bit [" + i + "]: ", 0, 1);
                System.out.println("Decimal: " + binarioParaDecimal(bits));
            } catch (IllegalArgumentException | ArithmeticException erro) {
                System.out.println(erro.getMessage());
            }
        }
    }
    static int binarioParaDecimal(int[] bits) {
        int decimal = 0;
        for (int bit : bits) decimal = decimal * 2 + bit;
        return decimal;
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
