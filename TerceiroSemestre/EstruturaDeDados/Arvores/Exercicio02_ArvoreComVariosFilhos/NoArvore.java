/*
Exercicio 2 — ArvoreComVariosFilhos
Origem: Exercicio 2 dos slides
Crie uma arvore em que cada no possa armazenar qualquer quantidade de filhos. Implemente a soma dos valores dos filhos de um no pai. Leia os valores com Scanner.
*/
import java.util.ArrayList;
public class NoArvore {
    private final int valor;
    private final ArrayList<NoArvore> filhos = new ArrayList<>();
    public NoArvore(int valor) { this.valor = valor; }
    public void adicionarFilho(NoArvore filho) { filhos.add(filho); }
    public long somarFilhos() {
        long soma = 0;
        for (NoArvore filho : filhos) soma += filho.valor;
        return soma;
    }
    public long somarDescendentes() {
        long soma = 0;
        for (NoArvore filho : filhos) soma += filho.valor + filho.somarDescendentes();
        return soma;
    }
}
