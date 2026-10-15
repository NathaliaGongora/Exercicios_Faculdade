/*
Exercicio 9 — ImprimirRecursivamente
Origem: Pratica complementar
Imprima as tres etapas recursivamente e confira que a caminhada termina sem procurar null.
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
