/*
Exercicio 1 — Fila
Origem: Lista do professor
Implemente Fila<T> com ArrayList, estaVazia, enfileirar, desenfileirar, frente, tamanho e exibirFila. Crie menu Scanner 1 a 5 e 0 sair. Remova indice zero e trate fila vazia sem informar remocao de null.
*/
package main;
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

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Fila<String> fila = new Fila<>();
            boolean continuar = true;
            while (continuar) {
                System.out.println("1 Enfileirar | 2 Desenfileirar | 3 Frente | 4 Tamanho | 5 Exibir | 0 Sair");
                switch (Entrada.inteiro(scanner, "Opcao: ")) {
                    case 1: fila.enfileirar(Entrada.texto(scanner, "Valor: ")); break;
                    case 2:
                    Object removido = fila.desenfileirar();
                    if (removido != null) System.out.println("Removido: " + removido);
                    break;
                    case 3:
                    Object primeiro = fila.frente();
                    if (primeiro != null) System.out.println("Frente: " + primeiro);
                    break;
                    case 4: System.out.println("Tamanho: " + fila.tamanho()); break;
                    case 5: fila.exibirFila(); break;
                    case 0: continuar = false; break;
                    default: System.out.println("Opcao invalida.");
                }
            }
            System.out.println("Programa encerrado.");
        }
    }
}
