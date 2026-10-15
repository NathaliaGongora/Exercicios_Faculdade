/*
Exercicio 8 — RemoverUltimaEtapa
Origem: Pratica complementar
Remova a ultima etapa e volte a partir da primeira para conferir a nova ultima.
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
