package SegundoSemestre.ProgramacaoOrientadaObjetos.Heranca;

class Pessoa {

    private String email;
    private String celular;

    public Pessoa() {
    }

    public Pessoa(String email, String celular) {

        this.email = email;
        this.celular = celular;
    }

    public String getEmail() {

        return email;
    }

    public void setEmail(String email) {

        this.email = email;
    }

    public String getCelular() {

        return celular;
    }

    public void setCelular(String celular) {

        this.celular = celular;
    }
}

class PessoaFisica extends Pessoa {

    private String nome;
    private String cpf;

    public PessoaFisica() {
    }

    public PessoaFisica(String nome, String cpf, String email, String celular) {

        super(email, celular);
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public String getCpf() {

        return cpf;
    }

    public void setCpf(String cpf) {

        this.cpf = cpf;
    }

    public String imprimir() {

        return "Nome: " + nome
                + "\nCPF: " + cpf
                + "\nEmail: " + getEmail()
                + "\nCelular: " + getCelular();
    }
}

class PessoaJuridica extends Pessoa {

    private String razaoSocial;
    private String cnpj;

    public PessoaJuridica() {
    }

    public PessoaJuridica(String razaoSocial, String cnpj, String email, String celular) {

        super(email, celular);
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {

        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {

        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {

        return cnpj;
    }

    public void setCnpj(String cnpj) {

        this.cnpj = cnpj;
    }

    public String imprimir() {

        return "Razao social: " + razaoSocial
                + "\nCNPJ: " + cnpj
                + "\nEmail: " + getEmail()
                + "\nCelular: " + getCelular();
    }
}

public class Exercicio01 {

    public static void main(String[] args) {

        PessoaFisica pessoaFisica = new PessoaFisica(
                "Mariana Oliveira",
                "123.456.789-00",
                "mariana@email.com",
                "15999999999"
        );

        PessoaJuridica pessoaJuridica = new PessoaJuridica(
                "Loja Central Ltda",
                "12.345.678/0001-00",
                "contato@lojacentral.com",
                "1533334444"
        );

        System.out.println("Pessoa fisica");
        System.out.println(pessoaFisica.imprimir());

        System.out.println();

        System.out.println("Pessoa juridica");
        System.out.println(pessoaJuridica.imprimir());
    }
}
