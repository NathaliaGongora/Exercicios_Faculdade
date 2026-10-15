/*
Exercicio 10 — Esvaziar&Reutilizar
Origem: Pratica complementar
Adicione tres valores, remova todos e confira nova insercao sem perder as referencias da lista.
*/
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
}
