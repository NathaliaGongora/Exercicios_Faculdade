package SegundoSemestre.ProgramacaoOrientadaObjetos.Heranca;

class Funcionario {

    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {

        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public double getSalario() {

        return salario;
    }

    public void setSalario(double salario) {

        this.salario = salario;
    }
}

class Gerente extends Funcionario {

    private String setor;

    public Gerente(String nome, double salario, String setor) {

        super(nome, salario);
        this.setor = setor;
    }

    public String getSetor() {

        return setor;
    }

    public void setSetor(String setor) {

        this.setor = setor;
    }

    public void aumentarSalario(double percentual) {

        double novoSalario = getSalario() + (getSalario() * percentual / 100);
        setSalario(novoSalario);
    }

    public void mostrarDados() {

        System.out.println("Nome: " + getNome());
        System.out.println("Salario: R$ " + getSalario());
        System.out.println("Setor: " + setor);
    }
}

public class Exercicio04 {

    public static void main(String[] args) {

        Gerente gerente = new Gerente("Carlos", 5000, "Tecnologia");

        gerente.aumentarSalario(10);
        gerente.mostrarDados();
    }
}
