/*
Exercicio 2 — PipelineCircular
Origem: Lista do professor
Crie EtapaPipeline com nome, responsavel e referencias proxima e anterior encapsulados. Implemente PipelineCircular com primeira, atual, quantidade, adicionar ao final e por indice, remover, avancar, voltar, exibirEtapaAtual, tamanho e imprimirPipeline recursivo. Crie MainPipeline com Scanner e menu 0 a 9. Valide indices e vazios e atualize a etapa atual quando removida. Sem colecoes prontas.
*/
import java.util.*;
public class MainPipeline {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            try {
                PipelineCircular p = new PipelineCircular();
                boolean continuar = true;
                while (continuar) {
                    System.out.println("1 Final | 2 Inserir posicao | 3 Remover | 4 Avancar | 5 Voltar | 6 Atual | 7 Exibir | 8 Tamanho | 9 Padrao | 0 Sair");
                    switch (Entrada.inteiro(scanner, "Opcao: ")) {
                        case 1: p.adicionar(Entrada.texto(scanner, "Nome: "), Entrada.texto(scanner, "Responsavel: ")); break;
                        case 2:
                        String nome = Entrada.texto(scanner, "Nome: ");
                        String responsavel = Entrada.texto(scanner, "Responsavel: ");
                        if (!p.adicionar(nome, responsavel, Entrada.inteiro(scanner, "Indice: "))) System.out.println("Indice invalido.");
                        break;
                        case 3: if (!p.remover(Entrada.inteiro(scanner, "Indice: "))) System.out.println("Indice invalido ou pipeline vazio."); break;
                        case 4: p.avancar(); p.exibirEtapaAtual(); break;
                        case 5: p.voltar(); p.exibirEtapaAtual(); break;
                        case 6: p.exibirEtapaAtual(); break;
                        case 7: System.out.println(p.imprimirPipeline()); break;
                        case 8: System.out.println("Quantidade: " + p.tamanho()); break;
                        case 9:
                        if (!p.estaVazio()) { System.out.println("O pipeline padrao exige uma lista vazia."); break; }
                        p.adicionar("Backlog", "Product Owner");
                        p.adicionar("Desenvolvimento", "Time de Desenvolvimento");
                        p.adicionar("Code Review", "Tech Lead");
                        p.adicionar("Testes", "Time de Qualidade");
                        p.adicionar("Deploy", "DevOps");
                        p.adicionar("Monitoramento", "Operacoes");
                        System.out.println(p.imprimirPipeline()); break;
                        case 0: continuar = false; break;
                        default: System.out.println("Opcao invalida.");
                    }
                }
                System.out.println("Programa encerrado.");
            } catch (IllegalArgumentException | ArithmeticException | IllegalStateException erro) {
                System.out.println(erro.getMessage());
            }
        }
    }

}
