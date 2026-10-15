/*
Exercicio 4 — FrenteSemRemover
Origem: Pratica complementar
Enfileire dois inteiros e confira que consultar a frente nao altera o tamanho.
*/
import java.util.*;
public class Fila<T> {
    private final ArrayList<T> elementos = new ArrayList<>();
    public boolean estaVazia() { return elementos.isEmpty(); }
    public void enfileirar(T item) { elementos.add(item); }
    public T desenfileirar() {
        if (estaVazia()) { System.out.println("Fila vazia."); return null; }
        return elementos.remove(0);
    }
    public T frente() {
        if (estaVazia()) { System.out.println("Fila vazia."); return null; }
        return elementos.get(0);
    }
    public int tamanho() { return elementos.size(); }
    public void exibirFila() { System.out.println(elementos); }
}
