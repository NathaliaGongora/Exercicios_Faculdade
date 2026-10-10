package SegundoSemestre.ProgramacaoOrientadaObjetos.Polimorfismo;

abstract class Empregado {

    private String nome;
    private String sobrenome;
    private String cpf;

    public Empregado(String nome, String sobrenome, String cpf) {

        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
    }

    public String getNomeCompleto() {

        return nome + " " + sobrenome;
    }

    public String getCpf() {

        return cpf;
    }

    public abstract double vencimento();
}

class Assalariado extends Empregado {

    private double salario;

    public Assalariado(String nome, String sobrenome, String cpf, double salario) {

        super(nome, sobrenome, cpf);
        this.salario = salario;
    }

    @Override
    public double vencimento() {

        if (salario < 1500) {
            return salario * 1.10;
        }

        return salario;
    }
}

class Comissionado extends Empregado {

    private double totalVenda;
    private double taxaComissao;

    public Comissionado(
            String nome,
            String sobrenome,
            String cpf,
            double totalVenda,
            double taxaComissao
    ) {

        super(nome, sobrenome, cpf);
        this.totalVenda = totalVenda;
        this.taxaComissao = taxaComissao;
    }

    @Override
    public double vencimento() {

        double valor = totalVenda * taxaComissao;

        if (totalVenda > 10000) {
            valor += 500;
        }

        return valor;
    }
}

class Horista extends Empregado {

    private double precoHora;
    private double horasTrabalhadas;

    public Horista(
            String nome,
            String sobrenome,
            String cpf,
            double precoHora,
            double horasTrabalhadas
    ) {

        super(nome, sobrenome, cpf);
        this.precoHora = precoHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    @Override
    public double vencimento() {

        if (horasTrabalhadas > 160) {
            double horasExtras = horasTrabalhadas - 160;
            return 160 * precoHora + horasExtras * precoHora * 1.5;
        }

        return horasTrabalhadas * precoHora;
    }
}

public class Exercicio03 {

    public static void main(String[] args) {

        Empregado[] empregados = {
            new Assalariado("Ana", "Lima", "111.111.111-11", 1400),
            new Assalariado("Carlos", "Souza", "222.222.222-22", 3200),
            new Comissionado("Julia", "Alves", "333.333.333-33", 9000, 0.08),
            new Comissionado("Paulo", "Silva", "444.444.444-44", 15000, 0.08),
            new Horista("Marina", "Costa", "555.555.555-55", 25, 150),
            new Horista("Lucas", "Santos", "666.666.666-66", 30, 175)
        };

        double totalGeral = 0;

        for (Empregado empregado : empregados) {
            double valor = empregado.vencimento();
            totalGeral += valor;

            System.out.println("Nome: " + empregado.getNomeCompleto());
            System.out.println("CPF: " + empregado.getCpf());
            System.out.println("Tipo: " + empregado.getClass().getSimpleName());
            System.out.printf("Vencimento: R$ %.2f%n%n", valor);
        }

        System.out.printf("Total geral: R$ %.2f%n", totalGeral);
    }
}
