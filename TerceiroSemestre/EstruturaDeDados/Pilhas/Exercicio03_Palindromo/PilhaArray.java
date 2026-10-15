/*
Exercicio 3 — Palindromo
Origem: Lista do professor
Leia um texto, remova espacos e diferencie apenas o conteudo em minusculas. Compare a verificacao de palindromo usando PilhaArray, PilhaArrayList e java.util.Stack. Remova apenas os espacos e diferencas entre maiusculas e minusculas, conforme a lista.
*/
import java.util.*;
public class PilhaArray<T> {
    private final Object[] elementos;
    private int topo;
    public PilhaArray(int capacidade) {
        if (capacidade <= 0) throw new IllegalArgumentException("Capacidade deve ser positiva.");
        elementos = new Object[capacidade]; topo = -1;
    }
    public boolean estaVazia() { return topo == -1; }
    public boolean estaCheia() { return topo == elementos.length - 1; }
    public void empilhar(T item) {
        if (estaCheia()) throw new IllegalStateException("Pilha cheia.");
        elementos[++topo] = item;
    }
    @SuppressWarnings("unchecked")
    public T desempilhar() {
        if (estaVazia()) throw new IllegalStateException("Pilha vazia.");
        T valor = (T) elementos[topo]; elementos[topo--] = null; return valor;
    }
    @SuppressWarnings("unchecked")
    public T topo() {
        if (estaVazia()) throw new IllegalStateException("Pilha vazia.");
        return (T) elementos[topo];
    }
    public int tamanho() { return topo + 1; }
    public void exibirPilha() {
        for (int i = topo; i >= 0; i--) System.out.println(elementos[i]);
    }
}
