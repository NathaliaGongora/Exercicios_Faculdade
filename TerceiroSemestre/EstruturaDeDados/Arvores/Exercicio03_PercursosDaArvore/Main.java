/*
Exercicio 3 — PercursosDaArvore
Origem: Exercicio de percursos dos slides
Implemente percursos pre-ordem, em ordem e pos-ordem. Use a arvore dos slides: raiz 5; subarvore esquerda com 3,1,2,4; direita com 8,7,6,9. Imprima os tres resultados.
*/
import java.util.*;
public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            try {
                ArvoreBinaria a = modelo();
                System.out.println("Pre-ordem: " + a.preOrdem());
                System.out.println("Em ordem: " + a.emOrdem());
                System.out.println("Pos-ordem: " + a.posOrdem());
            } catch (IllegalArgumentException | ArithmeticException | IllegalStateException erro) {
                System.out.println(erro.getMessage());
            }
        }
    }
    static ArvoreBinaria modelo() {
        ArvoreBinaria arvore = new ArvoreBinaria();
        int[] valores = {5, 3, 1, 2, 4, 8, 7, 6, 9};
        for (int valor : valores) arvore.adicionar(valor);
        return arvore;
    }
}
