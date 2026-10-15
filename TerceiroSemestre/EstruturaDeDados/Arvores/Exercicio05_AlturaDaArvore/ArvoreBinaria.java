/*
Exercicio 5 — AlturaDaArvore
Origem: Pratica complementar
Calcule a altura recursivamente, medida em arestas. Uma raiz isolada tem altura zero e a arvore vazia tem altura -1.
*/
public class ArvoreBinaria {
    private static class No {
        int valor; No esquerdo, direito;
        No(int valor) { this.valor = valor; }
    }
    private No raiz;
    public void adicionar(int valor) { raiz = adicionar(raiz, valor); }
    private No adicionar(No no, int valor) {
        if (no == null) return new No(valor);
        if (valor < no.valor) no.esquerdo = adicionar(no.esquerdo, valor);
        else if (valor > no.valor) no.direito = adicionar(no.direito, valor);
        return no;
    }
    public int buscarProfundidade(int valor) {
        int profundidade = 0; No no = raiz;
        while (no != null) {
            if (valor == no.valor) return profundidade;
            no = valor < no.valor ? no.esquerdo : no.direito; profundidade++;
        }
        return -1;
    }
    public void imprimirProfundidades() { imprimirProfundidades(raiz, 0); }
    private void imprimirProfundidades(No no, int profundidade) {
        if (no == null) return;
        System.out.println(no.valor + " profundidade " + profundidade);
        imprimirProfundidades(no.esquerdo, profundidade + 1);
        imprimirProfundidades(no.direito, profundidade + 1);
    }
    public String preOrdem() { StringBuilder s = new StringBuilder(); percorrer(raiz, s, 0); return s.toString().trim(); }
    public String emOrdem() { StringBuilder s = new StringBuilder(); percorrer(raiz, s, 1); return s.toString().trim(); }
    public String posOrdem() { StringBuilder s = new StringBuilder(); percorrer(raiz, s, 2); return s.toString().trim(); }
    private void percorrer(No no, StringBuilder texto, int ordem) {
        if (no == null) return;
        if (ordem == 0) texto.append(no.valor).append(' ');
        percorrer(no.esquerdo, texto, ordem);
        if (ordem == 1) texto.append(no.valor).append(' ');
        percorrer(no.direito, texto, ordem);
        if (ordem == 2) texto.append(no.valor).append(' ');
    }
    public int quantidade() { return quantidade(raiz); }
    private int quantidade(No no) { return no == null ? 0 : 1 + quantidade(no.esquerdo) + quantidade(no.direito); }
    public int altura() { return altura(raiz); }
    private int altura(No no) { return no == null ? -1 : 1 + Math.max(altura(no.esquerdo), altura(no.direito)); }
    public int folhas() { return folhas(raiz); }
    private int folhas(No no) {
        if (no == null) return 0;
        if (no.esquerdo == null && no.direito == null) return 1;
        return folhas(no.esquerdo) + folhas(no.direito);
    }
    public long soma() { return soma(raiz); }
    private long soma(No no) { return no == null ? 0 : no.valor + soma(no.esquerdo) + soma(no.direito); }
    public Integer menor() {
        if (raiz == null) return null;
        No no = raiz; while (no.esquerdo != null) no = no.esquerdo; return no.valor;
    }
    public Integer maior() {
        if (raiz == null) return null;
        No no = raiz; while (no.direito != null) no = no.direito; return no.valor;
    }
}
