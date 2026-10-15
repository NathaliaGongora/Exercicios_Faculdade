/*
Exercicio 2 — FilaPrioridade
Origem: Lista do professor
Implemente FilaPrioridade com ArrayList<Integer>. Insira cada numero em ordem crescente, com menores no inicio; remova pelo indice zero. Crie menu Scanner, aceite repetidos e negativos e trate fila vazia.
*/
package main;
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

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            FilaPrioridade fila = new FilaPrioridade();
            boolean continuar = true;
            while (continuar) {
                System.out.println("1 Enfileirar | 2 Desenfileirar | 3 Frente | 4 Tamanho | 5 Exibir | 0 Sair");
                switch (Entrada.inteiro(scanner, "Opcao: ")) {
                    case 1: fila.enfileirar(Entrada.inteiro(scanner, "Valor: ")); break;
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
