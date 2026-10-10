package SegundoSemestre.ProgramacaoOrientadaObjetos.Polimorfismo;

abstract class ProdutoDesconto {

    protected String nome;
    protected double preco;

    public ProdutoDesconto(String nome, double preco) {

        this.nome = nome;
        this.preco = preco;
    }

    public abstract double calcularPrecoFinal();
}

class EletronicoDesconto extends ProdutoDesconto {

    public EletronicoDesconto(String nome, double preco) {

        super(nome, preco);
    }

    @Override
    public double calcularPrecoFinal() {

        return preco * 0.90;
    }
}

class RoupaDesconto extends ProdutoDesconto {

    public RoupaDesconto(String nome, double preco) {

        super(nome, preco);
    }

    @Override
    public double calcularPrecoFinal() {

        return preco * 0.85;
    }
}

class AlimentoDesconto extends ProdutoDesconto {

    public AlimentoDesconto(String nome, double preco) {

        super(nome, preco);
    }

    @Override
    public double calcularPrecoFinal() {

        return preco * 0.95;
    }
}

public class Exercicio09 {

    public static void main(String[] args) {

        ProdutoDesconto[] produtos = {
            new EletronicoDesconto("Fone", 200),
            new RoupaDesconto("Jaqueta", 300),
            new AlimentoDesconto("Cesta", 150)
        };

        for (ProdutoDesconto produto : produtos) {
            System.out.printf("%s: R$ %.2f%n", produto.nome, produto.calcularPrecoFinal());
        }
    }
}
