/*
Exercicio 6 — InserirNoMeio
Origem: Pratica complementar
Insira uma etapa no indice 1 e confira o tamanho e o encadeamento.
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
