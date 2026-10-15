/*
Exercicio 8 — ReutilizarFila
Origem: Pratica complementar
Adicione um nome, remova-o, adicione outro e confira que a fila pode ser reutilizada.
*/
import java.util.*;
public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            try {
                Fila<String> f = new Fila<>();
                f.enfileirar(Entrada.texto(scanner, "Primeiro: "));
                f.desenfileirar();
                f.enfileirar(Entrada.texto(scanner, "Novo: "));
                f.exibirFila();
            } catch (IllegalArgumentException | ArithmeticException | IllegalStateException erro) {
                System.out.println(erro.getMessage());
            }
        }
    }

}
