/*
Exercicio 2 — PipelineCircular
Origem: Lista do professor
Crie EtapaPipeline com nome, responsavel e referencias proxima e anterior encapsulados. Implemente PipelineCircular com primeira, atual, quantidade, adicionar ao final e por indice, remover, avancar, voltar, exibirEtapaAtual, tamanho e imprimirPipeline recursivo. Crie MainPipeline com Scanner e menu 0 a 9. Valide indices e vazios e atualize a etapa atual quando removida. Sem colecoes prontas.
*/
public class EtapaPipeline {
    private String nome, responsavel;
    private EtapaPipeline proxima, anterior;
    public EtapaPipeline(String nome, String responsavel) { this.nome = nome; this.responsavel = responsavel; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getResponsavel() { return responsavel; }
    public void setResponsavel(String responsavel) { this.responsavel = responsavel; }
    public EtapaPipeline getProxima() { return proxima; }
    public void setProxima(EtapaPipeline proxima) { this.proxima = proxima; }
    public EtapaPipeline getAnterior() { return anterior; }
    public void setAnterior(EtapaPipeline anterior) { this.anterior = anterior; }
}
