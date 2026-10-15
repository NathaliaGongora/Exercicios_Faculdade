/*
Crie uma arvore em que cada no possa armazenar qualquer quantidade de filhos. Some os valores dos filhos de um no pai.
*/
public class Arvore {
    private final NoArvore raiz;
    public Arvore(int valor) { raiz = new NoArvore(valor); }
    public NoArvore getRaiz() { return raiz; }
    public long somarFilhos(NoArvore pai) { return pai.somarFilhos(); }
}
