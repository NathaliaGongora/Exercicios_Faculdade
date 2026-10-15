/*
Exercicio 2 — MenuDaListaLigada
Origem: Lista do professor
Complete a lista ligada com menu Scanner e switch de 0 a 7: adicionar no final, inicio e posicao; remover do inicio, final e posicao; exibir lista e tamanho; sair. Leia o primeiro valor e preserve package Lista. Valide entradas nao numericas, indices e reinsercao apos esvaziar. Nao utilize ArrayList ou LinkedList.
*/
package Lista;

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
