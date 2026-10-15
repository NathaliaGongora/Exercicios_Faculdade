/*
Exercicio 8 — MemoriaDaJVM
Origem: Exemplo de sala solicitado na atividade
Execute o exemplo de memoria alocada: consulte totalMemory e freeMemory, crie um vetor double e compare as leituras antes e depois de solicitar gc.
*/
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            try {
                Runtime runtime = Runtime.getRuntime();
                System.out.println("Memoria alocada para a JVM: " + runtime.totalMemory());
                runtime.gc();
                long antes = runtime.freeMemory();
                System.out.println("Memoria livre antes: " + antes);
                double[] vetor = new double[100000];
                vetor[0] = 3.14;
                long depois = runtime.freeMemory();
                System.out.println("Memoria livre depois: " + depois);
                System.out.println("Diferenca observada: " + (antes - depois));
                runtime.gc();
                System.out.println("Memoria livre apos solicitar GC: " + runtime.freeMemory());
                System.out.println("Vetor ainda referenciado: " + vetor[0]);
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
