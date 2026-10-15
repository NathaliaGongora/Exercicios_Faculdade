/*
Exercicio 7 — SomarValores
Origem: Pratica complementar
Some os valores dos nos usando recursao.
*/
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
