/*
Exercicio 5 — InserirNoInicio
Origem: Pratica complementar
Insira uma etapa no indice zero e confira a ordem circular.
*/
import java.util.*;
public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            try {
                PipelineCircular p = padrao(); p.adicionar("Z", "Equipe", 0);
                System.out.println(p.imprimirPipeline());
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
