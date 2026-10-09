package SegundoSemestre.ProgramacaoOrientadaObjetos.Heranca;

class FuncionarioCorporativo {

    private String nome;
    private String cpf;
    private String cargo;
    private double salario;
    private String dataAdmissao;

    public FuncionarioCorporativo(
            String nome,
            String cpf,
            String cargo,
            double salario,
            String dataAdmissao
    ) {

        this.nome = nome;
        this.cpf = cpf;
        this.cargo = cargo;
        this.salario = salario;
        this.dataAdmissao = dataAdmissao;
    }

    public String getNome() {

        return nome;
    }

    public String getCpf() {

        return cpf;
    }

    public String getCargo() {

        return cargo;
    }

    public double getSalario() {

        return salario;
    }

    public String getDataAdmissao() {

        return dataAdmissao;
    }

    public void trabalhar() {

        System.out.println(nome + " iniciou o expediente.");
    }

    public void reajustarSalario(double percentual) {

        salario += salario * percentual / 100;
    }

    public String exibirDados() {

        return "Nome: " + nome
                + "\nCPF: " + cpf
                + "\nCargo: " + cargo
                + String.format("\nSalario: R$ %.2f", salario)
                + "\nData de admissao: " + dataAdmissao;
    }
}

class GerenteCorporativo extends FuncionarioCorporativo {

    private double orcamentosControlados;
    private String dataDesignacao;

    public GerenteCorporativo(
            String nome,
            String cpf,
            String cargo,
            double salario,
            String dataAdmissao,
            double orcamentosControlados,
            String dataDesignacao
    ) {

        super(nome, cpf, cargo, salario, dataAdmissao);
        this.orcamentosControlados = orcamentosControlados;
        this.dataDesignacao = dataDesignacao;
    }

    public void aprovarOrcamento(double valor) {

        if (valor <= orcamentosControlados) {
            System.out.println("Orcamento aprovado por " + getNome());
        }
    }

    public void realizarReuniao() {

        System.out.println(getNome() + " esta realizando uma reuniao.");
    }

    @Override
    public String exibirDados() {

        return super.exibirDados()
                + String.format("\nOrcamentos controlados: R$ %.2f", orcamentosControlados)
                + "\nData de designacao: " + dataDesignacao;
    }
}

class ProgramadorCorporativo extends FuncionarioCorporativo {

    private String projeto;
    private String linguagemProgramacao;

    public ProgramadorCorporativo(
            String nome,
            String cpf,
            String cargo,
            double salario,
            String dataAdmissao,
            String projeto,
            String linguagemProgramacao
    ) {

        super(nome, cpf, cargo, salario, dataAdmissao);
        this.projeto = projeto;
        this.linguagemProgramacao = linguagemProgramacao;
    }

    public void programar() {

        System.out.println(getNome() + " esta programando em " + linguagemProgramacao + ".");
    }

    public void alterarProjeto(String projeto) {

        this.projeto = projeto;
    }

    @Override
    public String exibirDados() {

        return super.exibirDados()
                + "\nProjeto: " + projeto
                + "\nLinguagem: " + linguagemProgramacao;
    }
}

class GerenteProjeto extends GerenteCorporativo {

    private String projetos;

    public GerenteProjeto(
            String nome,
            String cpf,
            String cargo,
            double salario,
            String dataAdmissao,
            double orcamentosControlados,
            String dataDesignacao,
            String projetos
    ) {

        super(
                nome,
                cpf,
                cargo,
                salario,
                dataAdmissao,
                orcamentosControlados,
                dataDesignacao
        );

        this.projetos = projetos;
    }

    public void adicionarProjeto(String projeto) {

        projetos += ", " + projeto;
    }

    public void acompanharProjeto() {

        System.out.println(getNome() + " acompanha os projetos: " + projetos);
    }

    @Override
    public String exibirDados() {

        return super.exibirDados()
                + "\nProjetos: " + projetos;
    }
}

class GerenteDepartamento extends GerenteCorporativo {

    private String departamento;

    public GerenteDepartamento(
            String nome,
            String cpf,
            String cargo,
            double salario,
            String dataAdmissao,
            double orcamentosControlados,
            String dataDesignacao,
            String departamento
    ) {

        super(
                nome,
                cpf,
                cargo,
                salario,
                dataAdmissao,
                orcamentosControlados,
                dataDesignacao
        );

        this.departamento = departamento;
    }

    public void organizarEquipe() {

        System.out.println(getNome() + " esta organizando a equipe de " + departamento + ".");
    }

    public void alterarDepartamento(String departamento) {

        this.departamento = departamento;
    }

    @Override
    public String exibirDados() {

        return super.exibirDados()
                + "\nDepartamento: " + departamento;
    }
}

class GerenteEstrategico extends GerenteCorporativo {

    private String responsabilidades;

    public GerenteEstrategico(
            String nome,
            String cpf,
            String cargo,
            double salario,
            String dataAdmissao,
            double orcamentosControlados,
            String dataDesignacao,
            String responsabilidades
    ) {

        super(
                nome,
                cpf,
                cargo,
                salario,
                dataAdmissao,
                orcamentosControlados,
                dataDesignacao
        );

        this.responsabilidades = responsabilidades;
    }

    public void definirEstrategia() {

        System.out.println(getNome() + " definiu uma nova estrategia.");
    }

    public void adicionarResponsabilidade(String responsabilidade) {

        responsabilidades += ", " + responsabilidade;
    }

    @Override
    public String exibirDados() {

        return super.exibirDados()
                + "\nResponsabilidades: " + responsabilidades;
    }
}

public class Exercicio03 {

    public static void main(String[] args) {

        ProgramadorCorporativo programador = new ProgramadorCorporativo(
                "Lucas",
                "123.456.789-00",
                "Programador",
                4500,
                "10/02/2026",
                "Sistema de vendas",
                "Java"
        );

        GerenteProjeto gerenteProjeto = new GerenteProjeto(
                "Ana",
                "987.654.321-00",
                "Gerente de projeto",
                8500,
                "05/01/2024",
                200000,
                "01/06/2025",
                "Aplicativo mobile"
        );

        GerenteDepartamento gerenteDepartamento = new GerenteDepartamento(
                "Carlos",
                "111.222.333-44",
                "Gerente de departamento",
                9000,
                "15/03/2023",
                300000,
                "01/01/2025",
                "Tecnologia"
        );

        GerenteEstrategico gerenteEstrategico = new GerenteEstrategico(
                "Mariana",
                "555.666.777-88",
                "Gerente estrategico",
                12000,
                "20/08/2022",
                500000,
                "10/10/2024",
                "Planejamento anual"
        );

        programador.programar();
        gerenteProjeto.acompanharProjeto();
        gerenteDepartamento.organizarEquipe();
        gerenteEstrategico.definirEstrategia();

        System.out.println("\nProgramador");
        System.out.println(programador.exibirDados());

        System.out.println("\nGerente de projeto");
        System.out.println(gerenteProjeto.exibirDados());

        System.out.println("\nGerente de departamento");
        System.out.println(gerenteDepartamento.exibirDados());

        System.out.println("\nGerente estrategico");
        System.out.println(gerenteEstrategico.exibirDados());
    }
}
