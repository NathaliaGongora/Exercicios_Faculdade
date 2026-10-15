/*
Exercicio 2 — ArvoreComVariosFilhos
Origem: Exercicio 2 dos slides
Crie uma arvore em que cada no possa armazenar qualquer quantidade de filhos. Implemente a soma dos valores dos filhos de um no pai. Leia os valores com Scanner.
*/
import java.util.*;
public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            try {
                Arvore arvore = new Arvore(Entrada.inteiro(scanner, "Valor do pai: "));
                NoArvore raiz = arvore.getRaiz();
                int n = Entrada.faixa(scanner, "Quantidade de filhos (0 a 100): ", 0, 100);
                for (int i = 0; i < n; i++) raiz.adicionarFilho(new NoArvore(Entrada.inteiro(scanner, "Filho: ")));
                System.out.println("Soma dos filhos: " + arvore.somarFilhos(raiz));
            } catch (IllegalArgumentException | ArithmeticException | IllegalStateException erro) {
                System.out.println(erro.getMessage());
            }
        }
    }

}
