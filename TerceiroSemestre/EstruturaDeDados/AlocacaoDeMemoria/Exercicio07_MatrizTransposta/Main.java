/*
Exercicio 7 — MatrizTransposta
Origem: Lista do professor
Leia uma matriz de inteiros 3 x 2 e retorne sua transposta 2 x 3. Use transposta[coluna][linha] = original[linha][coluna] e imprima ambas com um metodo.
*/
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            try {
                int[][] matriz = new int[3][2];
                for (int i = 0; i < 3; i++)
                for (int j = 0; j < 2; j++) matriz[i][j] = Entrada.inteiro(scanner, "Valor: ");
                System.out.println("Original:"); imprimirMatriz(matriz);
                System.out.println("Transposta:"); imprimirMatriz(transporMatriz(matriz));
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

    static int[][] transporMatriz(int[][] matriz) {
        int[][] transposta = new int[matriz[0].length][matriz.length];
        for (int i = 0; i < matriz.length; i++)
        for (int j = 0; j < matriz[i].length; j++) transposta[j][i] = matriz[i][j];
        return transposta;
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
