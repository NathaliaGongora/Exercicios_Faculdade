/*
Exercicio 6 — NotacoesMatematicas
Origem: Lista do professor
Explique as notacoes infixa, prefixa e pos-fixa para ((A+B)*C)/D. Leia A, B, C e D com Scanner, rejeite D=0, apresente as tres notacoes e demonstre a avaliacao pos-fixa com Stack<Double>.
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
    static double decimal(java.util.Scanner scanner, String mensagem) {
        while (true) {
            String texto = texto(scanner, mensagem).trim().replace(',', '.');
            try {
                double valor = Double.parseDouble(texto);
                if (Double.isFinite(valor)) return valor;
            } catch (NumberFormatException erro) { }
            System.out.println("Digite um numero valido e finito.");
        }
    }
}
