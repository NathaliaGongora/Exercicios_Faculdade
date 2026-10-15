/*
Exercicio 4 — OrdenarPilha
Origem: Lista do professor
Leia a quantidade e os inteiros com Scanner. Ordene usando somente operacoes de pilha e pilha auxiliar, sem sort, vetores ou listas para ordenar. Ao desempilhar o resultado, os menores devem sair primeiro.
*/
import java.util.*;
public class Exercicio4Ordenacao {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            try {
                int n = Entrada.faixa(scanner, "Quantidade (0 a 100): ", 0, 100);
                Stack<Integer> pilha = new Stack<>();
                for (int i = 0; i < n; i++) pilha.push(Entrada.inteiro(scanner, "Valor: "));
                System.out.println("Antes: " + pilha);
                Stack<Integer> resultado = ordenarPilha(pilha);
                System.out.print("Ordem crescente: ");
                while (!resultado.empty()) System.out.print(resultado.pop() + " ");
                System.out.println();
            } catch (IllegalArgumentException | ArithmeticException | IllegalStateException erro) {
                System.out.println(erro.getMessage());
            }
        }
    }
    public static Stack<Integer> ordenarPilha(Stack<Integer> original) {
        Stack<Integer> auxiliar = new Stack<>();
        while (!original.empty()) {
            int valor = original.pop();
            while (!auxiliar.empty() && auxiliar.peek() < valor) original.push(auxiliar.pop());
            auxiliar.push(valor);
        }
        return auxiliar;
    }
}
