/*
Exercicio 2 — PipelineCircular
Origem: Lista do professor
Crie EtapaPipeline com nome, responsavel e referencias proxima e anterior encapsulados. Implemente PipelineCircular com primeira, atual, quantidade, adicionar ao final e por indice, remover, avancar, voltar, exibirEtapaAtual, tamanho e imprimirPipeline recursivo. Crie MainPipeline com Scanner e menu 0 a 9. Valide indices e vazios e atualize a etapa atual quando removida. Sem colecoes prontas.
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
