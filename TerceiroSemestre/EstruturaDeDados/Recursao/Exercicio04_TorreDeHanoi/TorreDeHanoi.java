/*
Exercicio 4 — TorreDeHanoi
Origem: Lista do professor
Resolva Hanoi por recursao usando Scanner e matriz int[n][3]. A e a origem, B o destino e C a auxiliar. Exiba o estado inicial e apos cada movimento, respeite o topo e nunca coloque disco maior sobre menor. Mostre o total 2^n - 1.
*/
import java.util.Scanner;
public class TorreDeHanoi {
    private static int movimentos;
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = Entrada.faixa(scanner, "Discos (1 a 10): ", 1, 10);
            int[][] torres = new int[n][3];
            for (int i = 0; i < n; i++) torres[i][0] = i + 1;
            movimentos = 0;
            exibirTorres(torres);
            hanoi(n, 'A', 'B', 'C', torres);
            System.out.println("Total de movimentos: " + movimentos);
        }
    }
    public static void hanoi(int quantidade, char origem, char destino, char auxiliar, int[][] torres) {
        if (quantidade <= 0) return;
        hanoi(quantidade - 1, origem, auxiliar, destino, torres);
        moverDiscoNaMatriz(torres, origem, destino);
        hanoi(quantidade - 1, auxiliar, destino, origem, torres);
    }
    public static int obterIndiceTorre(char torre) {
        if (torre < 'A' || torre > 'C') throw new IllegalArgumentException("Torre invalida.");
        return torre - 'A';
    }
    public static void moverDiscoNaMatriz(int[][] torres, char origem, char destino) {
        int a = obterIndiceTorre(origem), b = obterIndiceTorre(destino);
        int topoOrigem = 0, topoDestino = 0;
        while (topoOrigem < torres.length && torres[topoOrigem][a] == 0) topoOrigem++;
        while (topoDestino < torres.length && torres[topoDestino][b] == 0) topoDestino++;
        if (a == b || topoOrigem == torres.length || topoDestino == 0)
        throw new IllegalArgumentException("Movimento invalido.");
        int disco = torres[topoOrigem][a];
        if (topoDestino < torres.length && disco > torres[topoDestino][b])
        throw new IllegalArgumentException("Disco maior sobre menor.");
        torres[topoOrigem][a] = 0;
        torres[topoDestino - 1][b] = disco;
        movimentos++;
        System.out.println("Movimento " + movimentos + ": mover disco " + disco + " de " + origem + " para " + destino);
        exibirTorres(torres);
    }
    public static void exibirTorres(int[][] torres) {
        System.out.println("A B C");
        for (int[] linha : torres) System.out.println(linha[0] + " " + linha[1] + " " + linha[2]);
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
