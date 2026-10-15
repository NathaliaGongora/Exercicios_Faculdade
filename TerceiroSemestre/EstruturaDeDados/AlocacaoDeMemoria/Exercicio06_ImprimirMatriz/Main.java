/*
Exercicio 6 — ImprimirMatriz
Origem: Lista do professor
Leia as dimensoes e os textos de uma matriz String. Imprima seus elementos com dois lacos for, separadores | e tabulacao. O metodo deve aceitar diferentes dimensoes.
*/
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            try {
                int linhas = Entrada.faixa(scanner, "Linhas (1 a 20): ", 1, 20);
                int colunas = Entrada.faixa(scanner, "Colunas (1 a 20): ", 1, 20);
                String[][] matriz = new String[linhas][colunas];
                for (int i = 0; i < linhas; i++)
                for (int j = 0; j < colunas; j++) matriz[i][j] = Entrada.texto(scanner, "Texto [" + i + "][" + j + "]: ");
                imprimirMatriz(matriz);
            } catch (IllegalArgumentException | ArithmeticException erro) {
                System.out.println(erro.getMessage());
            }
        }
    }
    static void imprimirMatriz(String[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) System.out.print("|\t" + matriz[i][j] + "\t");
            System.out.println("|");
        }
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
