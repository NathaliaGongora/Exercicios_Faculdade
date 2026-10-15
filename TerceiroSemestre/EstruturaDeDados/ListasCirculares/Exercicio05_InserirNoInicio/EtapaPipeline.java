/*
Exercicio 5 — InserirNoInicio
Origem: Pratica complementar
Insira uma etapa no indice zero e confira a ordem circular.
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
