/*
Exercicio 6 — InserirNoMeio
Origem: Pratica complementar
Insira uma etapa no indice 1 e confira o tamanho e o encadeamento.
*/
import java.util.*;
public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            try {
                PipelineCircular p = padrao(); p.adicionar("X", "Equipe", 1);
                System.out.println(p.imprimirPipeline());
                System.out.println("Tamanho: " + p.tamanho());
            } catch (IllegalArgumentException | ArithmeticException | IllegalStateException erro) {
                System.out.println(erro.getMessage());
            }
        }
    }
    static PipelineCircular padrao() {
        PipelineCircular p = new PipelineCircular();
        p.adicionar("A", "Equipe"); p.adicionar("B", "Equipe"); p.adicionar("C", "Equipe"); return p;
    }
}
