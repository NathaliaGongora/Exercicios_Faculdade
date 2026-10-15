/*
Exercicio 1 — DecimalParaBinario
Origem: Lista do professor
Leia um inteiro nao negativo com Scanner, valide a entrada e converta-o em String binaria por recursao, com caso-base para 0 e 1.
*/
import java.util.Scanner;
public class exe1Recursao {



    public static String converterParaBinario(int numero) {
        if (numero < 0) throw new IllegalArgumentException("Numero negativo nao permitido.");
        if (numero < 2) return String.valueOf(numero);
        return converterParaBinario(numero / 2) + numero % 2;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            try {
                int n = Entrada.inteiro(scanner, "Decimal nao negativo: ");
                System.out.println("Binario: " + converterParaBinario(n));
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
