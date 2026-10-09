package SegundoSemestre.ProgramacaoOrientadaObjetos.EncapsulamentoGetSet.principal;

import SegundoSemestre.ProgramacaoOrientadaObjetos.EncapsulamentoGetSet.modelos.Produto;

public class MainProduto {

    public static void main(String[] args) {

        Produto produto = new Produto("Caderno", 25.90, 10);

        produto.vender(3);

        System.out.println("Produto: " + produto.getNome());
        System.out.println("Preco: R$ " + produto.getPreco());
        System.out.println("Quantidade: " + produto.getQuantidade());
    }
}
