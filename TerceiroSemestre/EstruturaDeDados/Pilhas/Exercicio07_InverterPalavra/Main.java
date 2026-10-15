/*
Exercicio 7 — InverterPalavra
Origem: Pratica complementar
Leia uma palavra e imprima-a invertida usando uma pilha.
*/
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            try {
                String texto = Entrada.texto(scanner, "Palavra: ");
                Stack<Character> p = new Stack<>();
                for (char c : texto.toCharArray()) p.push(c);
                System.out.print("Invertido: ");
                while (!p.empty()) System.out.print(p.pop());
                System.out.println();
            } catch (IllegalArgumentException | ArithmeticException erro) {
                System.out.println(erro.getMessage());
            }
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
