/*
Exercicio 2 — MenuDaListaLigada
Origem: Lista do professor
Complete a lista ligada com menu Scanner e switch de 0 a 7: adicionar no final, inicio e posicao; remover do inicio, final e posicao; exibir lista e tamanho; sair. Leia o primeiro valor e preserve package Lista. Valide entradas nao numericas, indices e reinsercao apos esvaziar. Nao utilize ArrayList ou LinkedList.
*/
package Lista;
public class ListaLigada {
    private No primeiroNo;
    private No ultimoNo;
    private int quantidadeNos;
    public ListaLigada() { }
    public ListaLigada(Object elemento) { adicionar(elemento); }
    public boolean estaVazio() { return quantidadeNos == 0; }
    public int tamanhoLista() { return quantidadeNos; }
    public void adicionar(Object elemento) {
        No novo = new No(elemento, null);
        if (estaVazio()) primeiroNo = novo;
        else ultimoNo.setProximoNo(novo);
        ultimoNo = novo; quantidadeNos++;
    }
    public void adicionarNoInicio(Object elemento) {
        No novo = new No(elemento, primeiroNo);
        primeiroNo = novo;
        if (estaVazio()) ultimoNo = novo;
        quantidadeNos++;
    }
    private No percorrerLista(int posicao) {
        No atual = primeiroNo;
        for (int i = 0; i < posicao; i++) atual = atual.getProximoNo();
        return atual;
    }
    public boolean adicionarNaPosicao(Object elemento, int posicao) {
        if (posicao < 0 || posicao > quantidadeNos) return false;
        if (posicao == 0) adicionarNoInicio(elemento);
        else if (posicao == quantidadeNos) adicionar(elemento);
        else {
            No anterior = percorrerLista(posicao - 1);
            anterior.setProximoNo(new No(elemento, anterior.getProximoNo()));
            quantidadeNos++;
        }
        return true;
    }
    public boolean removerDoInicio() {
        if (estaVazio()) return false;
        primeiroNo = primeiroNo.getProximoNo(); quantidadeNos--;
        if (estaVazio()) ultimoNo = null;
        return true;
    }
    public boolean removerDoFinal() {
        if (estaVazio()) return false;
        if (quantidadeNos == 1) return removerDoInicio();
        ultimoNo = percorrerLista(quantidadeNos - 2);
        ultimoNo.setProximoNo(null); quantidadeNos--; return true;
    }
    public boolean removerDaPosicao(int posicao) {
        if (posicao < 0 || posicao >= quantidadeNos) return false;
        if (posicao == 0) return removerDoInicio();
        if (posicao == quantidadeNos - 1) return removerDoFinal();
        No anterior = percorrerLista(posicao - 1);
        anterior.setProximoNo(anterior.getProximoNo().getProximoNo());
        quantidadeNos--; return true;
    }
    public Object getLista(int posicao) {
        if (posicao < 0 || posicao >= quantidadeNos) return null;
        return percorrerLista(posicao).getInfo();
    }
    public String imprimirLista() {
        StringBuilder texto = new StringBuilder();
        No atual = primeiroNo;
        while (atual != null) {
            texto.append(atual.getInfo()).append(" -> ");
            atual = atual.getProximoNo();
        }
        return texto.append("NULL").toString();
    }
    private void exibirListaNoConsole() {
        System.out.println(imprimirLista());
        System.out.println("Tamanho: " + quantidadeNos);
    }

    public static void main(String[] args) {
        try (java.util.Scanner scanner = new java.util.Scanner(System.in)) {
            ListaLigada lista = new ListaLigada(Entrada.texto(scanner, "Primeiro valor: "));
            boolean continuar = true;
            while (continuar) {
                System.out.println("1 Final | 2 Inicio | 3 Inserir posicao | 4 Remover inicio | 5 Remover final | 6 Remover posicao | 7 Exibir | 0 Sair");
                int opcao = Entrada.inteiro(scanner, "Opcao: ");
                switch (opcao) {
                    case 1: lista.adicionar(Entrada.texto(scanner, "Valor: ")); break;
                    case 2: lista.adicionarNoInicio(Entrada.texto(scanner, "Valor: ")); break;
                    case 3:
                    String valor = Entrada.texto(scanner, "Valor: ");
                    int indice = Entrada.inteiro(scanner, "Posicao: ");
                    if (!lista.adicionarNaPosicao(valor, indice)) System.out.println("Posicao invalida.");
                    break;
                    case 4: if (!lista.removerDoInicio()) System.out.println("Lista vazia."); break;
                    case 5: if (!lista.removerDoFinal()) System.out.println("Lista vazia."); break;
                    case 6:
                    if (!lista.removerDaPosicao(Entrada.inteiro(scanner, "Posicao: ")))
                    System.out.println("Posicao invalida ou lista vazia.");
                    break;
                    case 7: break;
                    case 0: continuar = false; break;
                    default: System.out.println("Opcao invalida.");
                }
                lista.exibirListaNoConsole();
            }
            System.out.println("Programa encerrado.");
        }
    }
}
