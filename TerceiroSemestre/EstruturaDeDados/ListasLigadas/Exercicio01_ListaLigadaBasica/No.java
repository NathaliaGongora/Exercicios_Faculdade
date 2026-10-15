/*
Exercicio 1 — ListaLigadaBasica
Origem: Lista do professor
Implemente No.java com Object info, No proximoNo, construtor e getters/setters. Em ListaLigada.java, mantenha primeiroNo, ultimoNo e quantidadeNos; crie construtor com primeiro elemento, adicionar ao final, tamanhoLista e imprimirLista. O main deve criar A, B e C e imprimir A -> B -> C -> NULL. Extra opcional: estaVazio e construtor vazio.
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
