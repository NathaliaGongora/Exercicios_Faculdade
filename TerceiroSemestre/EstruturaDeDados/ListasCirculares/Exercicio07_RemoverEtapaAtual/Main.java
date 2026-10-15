/*
Exercicio 7 — RemoverEtapaAtual
Origem: Pratica complementar
Remova a primeira etapa, que tambem e a atual. Confira que a proxima torna-se atual.
*/
import java.util.*;
public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            try {
                PipelineCircular p = padrao(); p.remover(0); p.exibirEtapaAtual();
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
