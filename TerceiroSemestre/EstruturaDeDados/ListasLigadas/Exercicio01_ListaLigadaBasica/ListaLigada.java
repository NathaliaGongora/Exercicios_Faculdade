/*
Exercicio 1 — ListaLigadaBasica
Origem: Lista do professor
Implemente No.java com Object info, No proximoNo, construtor e getters/setters. Em ListaLigada.java, mantenha primeiroNo, ultimoNo e quantidadeNos; crie construtor com primeiro elemento, adicionar ao final, tamanhoLista e imprimirLista. O main deve criar A, B e C e imprimir A -> B -> C -> NULL. Extra opcional: estaVazio e construtor vazio.
*/
public class ListaLigada {
    private No primeiroNo;
    private No ultimoNo;
    private int quantidadeNos;
    public ListaLigada() { }
    public ListaLigada(Object elemento) { adicionar(elemento); }
    public boolean estaVazio() { return quantidadeNos == 0; }
    public void adicionar(Object elemento) {
        No novo = new No(elemento, null);
        if (estaVazio()) primeiroNo = novo;
        else ultimoNo.setProximoNo(novo);
        ultimoNo = novo;
        quantidadeNos++;
    }
    public int tamanhoLista() { return quantidadeNos; }
    public String imprimirLista() {
        StringBuilder texto = new StringBuilder();
        for (No atual = primeiroNo; atual != null; atual = atual.getProximoNo())
        texto.append(atual.getInfo()).append(" -> ");
        return texto.append("NULL").toString();
    }
    public static void main(String[] args) {
        ListaLigada lista = new ListaLigada("A");
        lista.adicionar("B"); lista.adicionar("C");
        System.out.println(lista.imprimirLista());
        System.out.println("Tamanho: " + lista.tamanhoLista());
    }
}
