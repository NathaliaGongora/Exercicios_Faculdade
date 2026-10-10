package SegundoSemestre.ProgramacaoOrientadaObjetos.Polimorfismo;

abstract class FuncionarioBonus {

    protected String nome;
    protected double salario;

    public FuncionarioBonus(String nome, double salario) {

        this.nome = nome;
        this.salario = salario;
    }

    public abstract double calcularBonus();
}

class GerenteBonus extends FuncionarioBonus {

    public GerenteBonus(String nome, double salario) {

        super(nome, salario);
    }

    @Override
    public double calcularBonus() {

        return salario * 0.20;
    }
}

class VendedorBonus extends FuncionarioBonus {

    public VendedorBonus(String nome, double salario) {

        super(nome, salario);
    }

    @Override
    public double calcularBonus() {

        return salario * 0.12;
    }
}

class EstagiarioBonus extends FuncionarioBonus {

    public EstagiarioBonus(String nome, double salario) {

        super(nome, salario);
    }

    @Override
    public double calcularBonus() {

        return salario * 0.05;
    }
}

public class Exercicio06 {

    public static void main(String[] args) {

        FuncionarioBonus[] funcionarios = {
            new GerenteBonus("Mariana", 8000),
            new VendedorBonus("Carlos", 3500),
            new EstagiarioBonus("Julia", 1500)
        };

        for (FuncionarioBonus funcionario : funcionarios) {
            System.out.printf(
                    "%s | Bonus: R$ %.2f%n",
                    funcionario.nome,
                    funcionario.calcularBonus()
            );
        }
    }
}
