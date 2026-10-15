/*
Exercicio 10 — Esvaziar&Reutilizar
Origem: Pratica complementar
Adicione tres valores, remova todos e confira nova insercao sem perder as referencias da lista.
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
