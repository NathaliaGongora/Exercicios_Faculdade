package SegundoSemestre.ProgramacaoOrientadaObjetos.AssociacaoAgregacaoComposicao;

class MedicoConsulta {

    private String nome;
    private String especialidade;

    public MedicoConsulta(String nome, String especialidade) {

        this.nome = nome;
        this.especialidade = especialidade;
    }

    public String getNome() {

        return nome;
    }

    public String getEspecialidade() {

        return especialidade;
    }
}

class PacienteConsulta {

    private String nome;
    private int idade;

    public PacienteConsulta(String nome, int idade) {

        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {

        return nome;
    }

    public int getIdade() {

        return idade;
    }
}

class ConsultaMedica {

    private MedicoConsulta medico;
    private PacienteConsulta paciente;
    private String data;

    public ConsultaMedica(MedicoConsulta medico, PacienteConsulta paciente, String data) {

        this.medico = medico;
        this.paciente = paciente;
        this.data = data;
    }

    public String exibirConsulta() {

        return "Medico: " + medico.getNome()
                + "\nEspecialidade: " + medico.getEspecialidade()
                + "\nPaciente: " + paciente.getNome()
                + "\nIdade: " + paciente.getIdade()
                + "\nData: " + data;
    }
}

public class Exercicio07 {

    public static void main(String[] args) {

        MedicoConsulta medico = new MedicoConsulta("Dra. Ana", "Clinica geral");
        PacienteConsulta paciente = new PacienteConsulta("Lucas", 24);
        ConsultaMedica consulta = new ConsultaMedica(medico, paciente, "15/10/2026");

        System.out.println(consulta.exibirConsulta());
    }
}
