/*
Exercicio 10 — SomaDasLinhas
Origem: Pratica complementar
Leia uma matriz 2 x 3 e calcule a soma de cada linha usando um metodo.
*/
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            try {
                int[][] matriz = new int[2][3];
                for (int i = 0; i < 2; i++)
                for (int j = 0; j < 3; j++) matriz[i][j] = Entrada.inteiro(scanner, "Valor: ");
                System.out.println("Somas: " + Arrays.toString(somarLinhas(matriz)));
            } catch (IllegalArgumentException | ArithmeticException erro) {
                System.out.println(erro.getMessage());
            }
        }
    }
    static long[] somarLinhas(int[][] matriz) {
        long[] somas = new long[matriz.length];
        for (int i = 0; i < matriz.length; i++)
        for (int valor : matriz[i]) somas[i] += valor;
        return somas;
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
