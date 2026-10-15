/*
Exercicio 7 — RemoverPorPosicao
Origem: Pratica complementar
Crie A, B e C; remova a posicao 1 e confira rejeicao de posicao fora do intervalo.
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
