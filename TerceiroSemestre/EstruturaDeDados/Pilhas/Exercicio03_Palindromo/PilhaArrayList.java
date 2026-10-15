/*
Exercicio 3 — Palindromo
Origem: Lista do professor
Leia um texto, remova espacos e diferencie apenas o conteudo em minusculas. Compare a verificacao de palindromo usando PilhaArray, PilhaArrayList e java.util.Stack. Remova apenas os espacos e diferencas entre maiusculas e minusculas, conforme a lista.
*/
import java.util.*;
public class PilhaArrayList<T> {
    private final ArrayList<T> elementos = new ArrayList<>();
    public boolean estaVazia() { return elementos.isEmpty(); }
    public void empilhar(T item) { elementos.add(item); }
    public T desempilhar() {
        if (estaVazia()) throw new IllegalStateException("Pilha vazia.");
        return elementos.remove(elementos.size() - 1);
    }
    public T topo() {
        if (estaVazia()) throw new IllegalStateException("Pilha vazia.");
        return elementos.get(elementos.size() - 1);
    }
    public int tamanho() { return elementos.size(); }
    public void exibirPilha() {
        for (int i = elementos.size() - 1; i >= 0; i--) System.out.println(elementos.get(i));
    }
}
