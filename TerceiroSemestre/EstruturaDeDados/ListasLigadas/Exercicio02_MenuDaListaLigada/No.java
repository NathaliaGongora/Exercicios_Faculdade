/*
Exercicio 2 — MenuDaListaLigada
Origem: Lista do professor
Complete a lista ligada com menu Scanner e switch de 0 a 7: adicionar no final, inicio e posicao; remover do inicio, final e posicao; exibir lista e tamanho; sair. Leia o primeiro valor e preserve package Lista. Valide entradas nao numericas, indices e reinsercao apos esvaziar. Nao utilize ArrayList ou LinkedList.
*/
package Lista;
public class No {
    private Object info;
    private No proximoNo;
    public No(Object info, No proximoNo) { this.info = info; this.proximoNo = proximoNo; }
    public Object getInfo() { return info; }
    public void setInfo(Object info) { this.info = info; }
    public No getProximoNo() { return proximoNo; }
    public void setProximoNo(No proximoNo) { this.proximoNo = proximoNo; }
}
