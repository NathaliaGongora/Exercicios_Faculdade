/*
Exercicio 2 — PotenciaRecursiva
Origem: Lista do professor
Leia base e expoente inteiros com Scanner. Rejeite expoente negativo. Implemente calcularPotencia com caso-base expoente zero, chamada com expoente - 1 e retorno long. Nao use Math.pow nem lacos no calculo.
*/
import java.util.Scanner;
public class exe2Recursao {


    public static long calcularPotencia(int base, int expoente) {
        if (expoente < 0) throw new IllegalArgumentException("Expoente invalido: use um inteiro nao negativo.");
        if (expoente == 0) return 1;
        if (base == 0) return 0;
        if (base == 1) return 1;
        if (base == -1) return expoente % 2 == 0 ? 1 : -1;
        if (expoente > 63) throw new ArithmeticException("Resultado fora do limite de long.");
        return Math.multiplyExact(base, calcularPotencia(base, expoente - 1));
    }


    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            try {
                int base = Entrada.inteiro(scanner, "Base: ");
                int expoente = Entrada.inteiro(scanner, "Expoente: ");
                System.out.println("Resultado: " + calcularPotencia(base, expoente));
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
