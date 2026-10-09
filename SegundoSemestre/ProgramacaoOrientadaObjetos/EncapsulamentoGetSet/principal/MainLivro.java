package SegundoSemestre.ProgramacaoOrientadaObjetos.EncapsulamentoGetSet.principal;

import SegundoSemestre.ProgramacaoOrientadaObjetos.EncapsulamentoGetSet.modelos.Livro;

public class MainLivro {

    public static void main(String[] args) {

        Livro livro = new Livro("Dom Casmurro", "Machado de Assis");

        livro.emprestar();

        System.out.println("Titulo: " + livro.getTitulo());
        System.out.println("Autor: " + livro.getAutor());
        System.out.println("Disponivel: " + livro.isDisponivel());
    }
}
