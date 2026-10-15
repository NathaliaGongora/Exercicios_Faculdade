/*
Exercicio 6 — NotacoesMatematicas
Origem: Lista do professor
Explique as notacoes infixa, prefixa e pos-fixa para ((A+B)*C)/D. Leia A, B, C e D com Scanner, rejeite D=0, apresente as tres notacoes e demonstre a avaliacao pos-fixa com Stack<Double>.
*/
import java.util.*;
public class Exercicio6Notacoes {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            try {
                double a = Entrada.decimal(scanner, "A: ");
                double b = Entrada.decimal(scanner, "B: ");
                double c = Entrada.decimal(scanner, "C: ");
                double d = Entrada.decimal(scanner, "D: ");
                if (d == 0) throw new IllegalArgumentException("Divisao por zero nao permitida.");
                System.out.println("Infixa: ((A + B) * C) / D");
                System.out.println("Prefixa: / * + A B C D");
                System.out.println("Pos-fixa: A B + C * D /");
                Stack<Double> pilha = new Stack<>();
                pilha.push(a); pilha.push(b);
                pilha.push(pilha.pop() + pilha.pop());
                pilha.push(c); pilha.push(pilha.pop() * pilha.pop());
                pilha.push(d);
                double segundo = pilha.pop(), primeiro = pilha.pop();
                pilha.push(primeiro / segundo);
                System.out.println("Resultado: " + pilha.pop());
            } catch (IllegalArgumentException | ArithmeticException | IllegalStateException erro) {
                System.out.println(erro.getMessage());
            }
        }
    }

}
