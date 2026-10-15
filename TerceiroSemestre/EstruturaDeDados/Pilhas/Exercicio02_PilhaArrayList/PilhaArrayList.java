/*
Exercicio 2 — PilhaArrayList
Origem: Referencia de sala indicada na lista
Implemente a pilha generica com ArrayList usada como referencia em sala, com menu Scanner, empilhar, desempilhar, topo, tamanho, estaVazia e exibirPilha. Remova pelo ultimo indice para preservar LIFO.
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

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            PilhaArrayList<String> pilha = new PilhaArrayList<>();
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
