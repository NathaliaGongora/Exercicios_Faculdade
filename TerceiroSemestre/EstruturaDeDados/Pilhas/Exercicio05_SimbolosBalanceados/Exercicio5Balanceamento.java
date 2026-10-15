/*
Exercicio 5 — SimbolosBalanceados
Origem: Lista do professor
Leia uma expressao e valide parenteses, colchetes e chaves com uma pilha. Trate fechamento sem abertura, simbolo diferente do esperado e abertura sem fechamento. Ignore os demais caracteres.
*/
import java.util.*;
public class Exercicio5Balanceamento {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            try {
                System.out.println("Balanceada: " + validarBalanceamento(Entrada.texto(scanner, "Expressao: ")));
            } catch (IllegalArgumentException | ArithmeticException | IllegalStateException erro) {
                System.out.println(erro.getMessage());
            }
        }
    }
    public static boolean validarBalanceamento(String expressao) {
        Stack<Character> pilha = new Stack<>();
        for (char c : expressao.toCharArray()) {
            if (c == '(') pilha.push(')');
            else if (c == '[') pilha.push(']');
            else if (c == '{') pilha.push('}');
            else if (c == ')' || c == ']' || c == '}') {
                if (pilha.empty() || pilha.pop() != c) return false;
            }
        }
        return pilha.empty();
    }
}
