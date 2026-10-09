package SegundoSemestre.ProgramacaoOrientadaObjetos.Heranca;

class PessoaEmpresa {

    private String nome;
    private String endereco;

    public PessoaEmpresa(String nome, String endereco) {

        this.nome = nome;
        this.endereco = endereco;
    }

    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public String getEndereco() {

        return endereco;
    }

    public void setEndereco(String endereco) {

        this.endereco = endereco;
    }

    public String exibirDados() {

        return "Nome: " + nome
                + "\nEndereco: " + endereco;
    }
}

class PessoaFisicaCliente extends PessoaEmpresa {

    private String cpf;
    private String email;

    public PessoaFisicaCliente(String nome, String cpf, String endereco, String email) {

        super(nome, endereco);
        this.cpf = cpf;
        this.email = email;
    }

    public String getCpf() {

        return cpf;
    }

    public void setCpf(String cpf) {

        this.cpf = cpf;
    }

    public String getEmail() {

        return email;
    }

    public void setEmail(String email) {

        this.email = email;
    }

    @Override
    public String exibirDados() {

        return super.exibirDados()
                + "\nCPF: " + cpf
                + "\nEmail: " + email;
    }
}

class PessoaJuridicaCliente extends PessoaEmpresa {

    private String cnpj;
    private String email;

    public PessoaJuridicaCliente(String nome, String cnpj, String endereco, String email) {

        super(nome, endereco);
        this.cnpj = cnpj;
        this.email = email;
    }

    public String getCnpj() {

        return cnpj;
    }

    public void setCnpj(String cnpj) {

        this.cnpj = cnpj;
    }

    public String getEmail() {

        return email;
    }

    public void setEmail(String email) {

        this.email = email;
    }

    @Override
    public String exibirDados() {

        return super.exibirDados()
                + "\nCNPJ: " + cnpj
                + "\nEmail: " + email;
    }
}

class FuncionarioCadastro extends PessoaEmpresa {

    private String cpf;
    private double salario;

    public FuncionarioCadastro(String nome, String cpf, String endereco, double salario) {

        super(nome, endereco);
        this.cpf = cpf;
        this.salario = salario;
    }

    public String getCpf() {

        return cpf;
    }

    public void setCpf(String cpf) {

        this.cpf = cpf;
    }

    public double getSalario() {

        return salario;
    }

    public void setSalario(double salario) {

        this.salario = salario;
    }

    @Override
    public String exibirDados() {

        return super.exibirDados()
                + "\nCPF: " + cpf
                + String.format("\nSalario: R$ %.2f", salario);
    }
}

public class Exercicio01 {

    public static void main(String[] args) {

        PessoaFisicaCliente cliente1 = new PessoaFisicaCliente(
                "Mariana Oliveira",
                "123.456.789-00",
                "Rua das Flores, 100",
                "mariana@email.com"
        );

        PessoaFisicaCliente cliente2 = new PessoaFisicaCliente(
                "Carlos Souza",
                "987.654.321-00",
                "Avenida Central, 250",
                "carlos@email.com"
        );

        PessoaJuridicaCliente empresa = new PessoaJuridicaCliente(
                "Loja Central Ltda",
                "12.345.678/0001-00",
                "Rua Comercial, 50",
                "contato@lojacentral.com"
        );

        FuncionarioCadastro funcionario = new FuncionarioCadastro(
                "Ana Lima",
                "111.222.333-44",
                "Rua Azul, 80",
                3200
        );

        System.out.println("Cliente pessoa fisica 1");
        System.out.println(cliente1.exibirDados());

        System.out.println("\nCliente pessoa fisica 2");
        System.out.println(cliente2.exibirDados());

        System.out.println("\nCliente pessoa juridica");
        System.out.println(empresa.exibirDados());

        System.out.println("\nFuncionario");
        System.out.println(funcionario.exibirDados());
    }
}
