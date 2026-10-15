/*
Exercicio 7 — FilaDeImpressao
Origem: Pratica complementar
Leia tres nomes de documentos e processe a fila de impressao na ordem de chegada.
*/
import java.util.*;
public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            try {
                Fila<String> f = new Fila<>();
                for (int i = 0; i < 3; i++) f.enfileirar(Entrada.texto(scanner, "Documento: "));
                while (!f.estaVazia()) System.out.println("Imprimindo: " + f.desenfileirar());
            } catch (IllegalArgumentException | ArithmeticException | IllegalStateException erro) {
                System.out.println(erro.getMessage());
            }
        }
    }

}
