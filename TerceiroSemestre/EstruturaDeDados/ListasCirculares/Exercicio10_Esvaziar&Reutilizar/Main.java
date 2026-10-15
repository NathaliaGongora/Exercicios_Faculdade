/*
Exercicio 10 — Esvaziar&Reutilizar
Origem: Pratica complementar
Remova todas as etapas, tente navegar na estrutura vazia e adicione uma nova etapa.
*/
import java.util.*;
public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            try {
                PipelineCircular p = padrao();
                while (!p.estaVazio()) p.remover(0);
                p.avancar(); p.voltar(); p.exibirEtapaAtual();
                p.adicionar("Nova", "Equipe"); p.exibirEtapaAtual();
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
