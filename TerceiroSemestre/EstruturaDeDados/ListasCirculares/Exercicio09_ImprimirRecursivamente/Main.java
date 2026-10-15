/*
Exercicio 9 — ImprimirRecursivamente
Origem: Pratica complementar
Imprima as tres etapas recursivamente e confira que a caminhada termina sem procurar null.
*/
import java.util.*;
public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            try {
                PipelineCircular p = padrao(); System.out.println(p.imprimirPipeline());
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
