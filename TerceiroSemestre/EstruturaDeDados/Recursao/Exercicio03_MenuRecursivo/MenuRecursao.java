/*
Exercicio 3 — MenuRecursivo
Origem: Lista do professor
Crie um menu com Scanner: 1 fatorial, 2 potencia, 3 decimal para binario e 4 sair. Mantenha o menu ate a opcao 4; trate entradas nao numericas, negativos e opcao inexistente. Os tres calculos devem ser recursivos.
*/
import java.util.Scanner;
public class MenuRecursao {

    public static long calcularFatorial(int numero) {
        if (numero < 0 || numero > 20) throw new IllegalArgumentException("Fatorial: informe de 0 a 20 (limite do long).");
        if (numero <= 1) return 1;
        return numero * calcularFatorial(numero - 1);
    }
    public static long calcularPotencia(int base, int expoente) {
        if (expoente < 0) throw new IllegalArgumentException("Expoente invalido: use um inteiro nao negativo.");
        if (expoente == 0) return 1;
        if (base == 0) return 0;
        if (base == 1) return 1;
        if (base == -1) return expoente % 2 == 0 ? 1 : -1;
        if (expoente > 63) throw new ArithmeticException("Resultado fora do limite de long.");
        return Math.multiplyExact(base, calcularPotencia(base, expoente - 1));
    }
    public static String converterParaBinario(int numero) {
        if (numero < 0) throw new IllegalArgumentException("Numero negativo nao permitido.");
        if (numero < 2) return String.valueOf(numero);
        return converterParaBinario(numero / 2) + numero % 2;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            try {
                boolean continuar = true;
                while (continuar) {
                    System.out.println("1 - Fatorial | 2 - Potencia | 3 - Binario | 4 - Sair");
                    int opcao = Entrada.inteiro(scanner, "Opcao: ");
                    try {
                        switch (opcao) {
                            case 1:
                            System.out.println("Fatorial: " + calcularFatorial(Entrada.inteiro(scanner, "Numero: ")));
                            break;
                            case 2:
                            int base = Entrada.inteiro(scanner, "Base: ");
                            int expoente = Entrada.inteiro(scanner, "Expoente: ");
                            System.out.println("Potencia: " + calcularPotencia(base, expoente));
                            break;
                            case 3:
                            System.out.println("Binario: " + converterParaBinario(Entrada.inteiro(scanner, "Decimal: ")));
                            break;
                            case 4: continuar = false; break;
                            default: System.out.println("Opcao invalida. Escolha entre 1 e 4.");
                        }
                    } catch (IllegalArgumentException | ArithmeticException erro) {
                        System.out.println(erro.getMessage());
                    }
                }
                System.out.println("Programa encerrado.");
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
