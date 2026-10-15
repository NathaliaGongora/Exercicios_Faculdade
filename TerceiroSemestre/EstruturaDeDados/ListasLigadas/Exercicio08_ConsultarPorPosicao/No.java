/*
Exercicio 8 — ConsultarPorPosicao
Origem: Pratica complementar
Leia dois valores e consulte o segundo sem remover. Confira tamanho e consulta fora do intervalo.
*/
public class No {
    private Object info;
    private No proximoNo;
    public No(Object info, No proximoNo) { this.info = info; this.proximoNo = proximoNo; }
    public Object getInfo() { return info; }
    public void setInfo(Object info) { this.info = info; }
    public No getProximoNo() { return proximoNo; }
    public void setProximoNo(No proximoNo) { this.proximoNo = proximoNo; }
}
