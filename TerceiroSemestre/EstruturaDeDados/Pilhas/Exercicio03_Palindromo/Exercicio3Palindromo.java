/*
Exercicio 3 — Palindromo
Origem: Lista do professor
Leia um texto, remova espacos e diferencie apenas o conteudo em minusculas. Compare a verificacao de palindromo usando PilhaArray, PilhaArrayList e java.util.Stack. Remova apenas os espacos e diferencas entre maiusculas e minusculas, conforme a lista.
*/
import java.util.*;
public class Exercicio3Palindromo {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            try {
                String texto = Entrada.texto(scanner, "Texto: ");
                String normalizado = texto.toLowerCase(Locale.ROOT).replace(" ", "");
                PilhaArray<Character> a = new PilhaArray<>(Math.max(1, normalizado.length()));
                PilhaArrayList<Character> b = new PilhaArrayList<>();
                Stack<Character> c = new Stack<>();
                for (char letra : normalizado.toCharArray()) { a.empilhar(letra); b.empilhar(letra); c.push(letra); }
                boolean ra = true, rb = true, rc = true;
                for (char letra : normalizado.toCharArray()) {
                    if (letra != a.desempilhar()) ra = false;
                    if (letra != b.desempilhar()) rb = false;
                    if (letra != c.pop()) rc = false;
                }
                System.out.println("PilhaArray: " + ra);
                System.out.println("PilhaArrayList: " + rb);
                System.out.println("Stack: " + rc);
            } catch (IllegalArgumentException | ArithmeticException | IllegalStateException erro) {
                System.out.println(erro.getMessage());
            }
        }
    }

}
