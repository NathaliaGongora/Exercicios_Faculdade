/*
Exercicio 1 — PilhaArray
Origem: Lista do professor
Implemente uma pilha generica com Object[], topo inicial -1, capacidade fixa, estaVazia, estaCheia, empilhar, desempilhar, topo, tamanho e exibirPilha. Crie um menu Scanner e trate pilha cheia e vazia.
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

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            PilhaArray<String> pilha = new PilhaArray<>(5);
            boolean continuar = true;
            while (continuar) {
                System.out.println("1 Empilhar | 2 Desempilhar | 3 Topo | 4 Tamanho | 5 Exibir | 0 Sair");
                int opcao = Entrada.inteiro(scanner, "Opcao: ");
                try {
                    switch (opcao) {
                        case 1: pilha.empilhar(Entrada.texto(scanner, "Valor: ")); break;
                        case 2: System.out.println("Removido: " + pilha.desempilhar()); break;
                        case 3: System.out.println("Topo: " + pilha.topo()); break;
                        case 4: System.out.println("Tamanho: " + pilha.tamanho()); break;
                        case 5: pilha.exibirPilha(); break;
                        case 0: continuar = false; break;
                        default: System.out.println("Opcao invalida.");
                    }
                } catch (IllegalStateException erro) { System.out.println(erro.getMessage()); }
            }
            System.out.println("Programa encerrado.");
        }
    }
}
