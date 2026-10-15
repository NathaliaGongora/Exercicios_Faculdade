/*
Exercicio 10 — CompararFIFO&Prioridade
Origem: Pratica complementar
Leia cinco numeros, adicione-os numa fila comum e numa fila de prioridade e compare a ordem de remocao.
*/
import java.util.*;
public class FilaPrioridade {
    private final ArrayList<Integer> elementos = new ArrayList<>();
    public boolean estaVazia() { return elementos.isEmpty(); }
    public void enfileirar(Integer item) {
        int indice = 0;
        while (indice < elementos.size() && elementos.get(indice) <= item) indice++;
        elementos.add(indice, item);
    }
    public Integer desenfileirar() {
        if (estaVazia()) { System.out.println("Fila vazia."); return null; }
        return elementos.remove(0);
    }
    public Integer frente() {
        if (estaVazia()) { System.out.println("Fila vazia."); return null; }
        return elementos.get(0);
    }
    public int tamanho() { return elementos.size(); }
    public void exibirFila() { System.out.println(elementos); }
}
