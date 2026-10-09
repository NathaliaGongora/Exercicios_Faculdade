package SegundoSemestre.ProgramacaoOrientadaObjetos.AssociacaoAgregacaoComposicao;

class LutadorUfc {

    private String nome;
    private double peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    public LutadorUfc(String nome, double peso) {

        this.nome = nome;
        setPeso(peso);
    }

    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public double getPeso() {

        return peso;
    }

    public void setPeso(double peso) {

        this.peso = peso;

        if (peso < 52.2) {
            categoria = "Invalido";
        } else if (peso <= 70.3) {
            categoria = "Leve";
        } else if (peso <= 83.9) {
            categoria = "Medio";
        } else if (peso <= 120.2) {
            categoria = "Pesado";
        } else {
            categoria = "Invalido";
        }
    }

    public String getCategoria() {

        return categoria;
    }

    public int getVitorias() {

        return vitorias;
    }

    public int getDerrotas() {

        return derrotas;
    }

    public int getEmpates() {

        return empates;
    }

    public void ganharLuta() {

        vitorias++;
    }

    public void perderLuta() {

        derrotas++;
    }

    public void empatarLuta() {

        empates++;
    }

    public String status() {

        return nome
                + " | Categoria: " + categoria
                + " | Vitorias: " + vitorias
                + " | Derrotas: " + derrotas
                + " | Empates: " + empates;
    }
}

class LutaUfc {

    private LutadorUfc desafiado;
    private LutadorUfc desafiante;
    private int rounds;
    private boolean aprovada;

    public void marcarLuta(LutadorUfc desafiado, LutadorUfc desafiante, int rounds) {

        if (desafiado != desafiante
                && desafiado.getCategoria().equals(desafiante.getCategoria())) {

            this.desafiado = desafiado;
            this.desafiante = desafiante;
            this.rounds = rounds;
            aprovada = true;
        } else {
            aprovada = false;
        }
    }

    public void lutar(int resultado) {

        if (!aprovada) {
            System.out.println("A luta nao pode acontecer.");
            return;
        }

        System.out.println(desafiado.getNome() + " x " + desafiante.getNome());
        System.out.println("Rounds: " + rounds);

        if (resultado == 0) {
            System.out.println("Resultado: empate");
            desafiado.empatarLuta();
            desafiante.empatarLuta();
        } else if (resultado == 1) {
            System.out.println("Vencedor: " + desafiado.getNome());
            desafiado.ganharLuta();
            desafiante.perderLuta();
        } else {
            System.out.println("Vencedor: " + desafiante.getNome());
            desafiante.ganharLuta();
            desafiado.perderLuta();
        }
    }
}

public class Exercicio01 {

    public static void main(String[] args) {

        LutadorUfc lutador1 = new LutadorUfc("Pretty Boy", 68.9);
        LutadorUfc lutador2 = new LutadorUfc("Putscript", 57.8);

        LutaUfc luta = new LutaUfc();
        luta.marcarLuta(lutador1, lutador2, 3);
        luta.lutar(1);

        System.out.println(lutador1.status());
        System.out.println(lutador2.status());
    }
}
