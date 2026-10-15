/*
Exercicio 7 — RemoverEtapaAtual
Origem: Pratica complementar
Remova a primeira etapa, que tambem e a atual. Confira que a proxima torna-se atual.
*/
public class PipelineCircular {
    private EtapaPipeline primeira;
    private EtapaPipeline atual;
    private int quantidade;
    public boolean estaVazio() { return quantidade == 0; }
    public int tamanho() { return quantidade; }
    public void adicionar(String nome, String responsavel) { adicionar(nome, responsavel, quantidade); }
    public boolean adicionar(String nome, String responsavel, int indice) {
        if (indice < 0 || indice > quantidade) return false;
        EtapaPipeline nova = new EtapaPipeline(nome, responsavel);
        if (estaVazio()) {
            primeira = atual = nova;
            nova.setProxima(nova); nova.setAnterior(nova);
        } else {
            EtapaPipeline seguinte = indice == quantidade ? primeira : localizar(indice);
            EtapaPipeline anterior = seguinte.getAnterior();
            nova.setAnterior(anterior); nova.setProxima(seguinte);
            anterior.setProxima(nova); seguinte.setAnterior(nova);
            if (indice == 0) primeira = nova;
        }
        quantidade++; return true;
    }
    private EtapaPipeline localizar(int indice) {
        EtapaPipeline no = primeira;
        for (int i = 0; i < indice; i++) no = no.getProxima();
        return no;
    }
    public boolean remover(int indice) {
        if (indice < 0 || indice >= quantidade) return false;
        EtapaPipeline removida = localizar(indice);
        if (quantidade == 1) primeira = atual = null;
        else {
            removida.getAnterior().setProxima(removida.getProxima());
            removida.getProxima().setAnterior(removida.getAnterior());
            if (removida == primeira) primeira = removida.getProxima();
            if (removida == atual) atual = removida.getProxima();
        }
        quantidade--; return true;
    }
    public void avancar() { if (!estaVazio()) atual = atual.getProxima(); }
    public void voltar() { if (!estaVazio()) atual = atual.getAnterior(); }
    public void exibirEtapaAtual() {
        if (estaVazio()) System.out.println("Pipeline vazio.");
        else System.out.println("Atual: " + atual.getNome() + " - " + atual.getResponsavel());
    }
    public String imprimirPipeline() {
        if (estaVazio()) return "Pipeline vazio.";
        StringBuilder texto = new StringBuilder();
        imprimirRecursivo(primeira, 0, texto);
        return texto.append("(inicio)").toString();
    }
    private void imprimirRecursivo(EtapaPipeline etapa, int visitados, StringBuilder texto) {
        if (visitados == quantidade) return;
        texto.append(etapa.getNome()).append(" [").append(etapa.getResponsavel()).append("] -> ");
        imprimirRecursivo(etapa.getProxima(), visitados + 1, texto);
    }
}
