package SegundoSemestre.ProgramacaoOrientadaObjetos.Heranca;

class Animal {

    private String nome;
    private int idade;

    public Animal(String nome, int idade) {

        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public int getIdade() {

        return idade;
    }

    public void setIdade(int idade) {

        this.idade = idade;
    }
}

class Cachorro extends Animal {

    private String raca;

    public Cachorro(String nome, int idade, String raca) {

        super(nome, idade);
        this.raca = raca;
    }

    public String getRaca() {

        return raca;
    }

    public void setRaca(String raca) {

        this.raca = raca;
    }

    public void latir() {

        System.out.println(getNome() + " esta latindo.");
    }

    public void mostrarDados() {

        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Raca: " + raca);
    }
}

public class Exercicio03 {

    public static void main(String[] args) {

        Cachorro cachorro = new Cachorro("Thor", 4, "Labrador");

        cachorro.mostrarDados();
        cachorro.latir();
    }
}
