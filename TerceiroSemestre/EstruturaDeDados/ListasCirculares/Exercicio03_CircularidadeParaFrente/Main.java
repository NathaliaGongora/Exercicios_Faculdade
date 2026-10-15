/*
Exercicio 3 — CircularidadeParaFrente
Origem: Pratica complementar
Cadastre tres etapas e avance quatro vezes, mostrando o retorno ao inicio.
*/
import java.util.*;
public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            try {
                PipelineCircular p = padrao();
                for (int i = 0; i < 4; i++) { p.avancar(); p.exibirEtapaAtual(); }
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
