package SegundoSemestre.ProgramacaoOrientadaObjetos.Polimorfismo;

abstract class Animal {

    protected double peso;
    protected int idade;
    protected int membros;

    public Animal(double peso, int idade, int membros) {

        this.peso = peso;
        this.idade = idade;
        this.membros = membros;
    }

    public abstract void locomover();

    public abstract void alimentar();

    public abstract void emitirSom();
}

class Mamifero extends Animal {

    private String corPelo;

    public Mamifero(double peso, int idade, int membros, String corPelo) {

        super(peso, idade, membros);
        this.corPelo = corPelo;
    }

    @Override
    public void locomover() {

        System.out.println("Correndo");
    }

    @Override
    public void alimentar() {

        System.out.println("Mamando");
    }

    @Override
    public void emitirSom() {

        System.out.println("Som de mamifero");
    }
}

class Reptil extends Animal {

    private String corEscama;

    public Reptil(double peso, int idade, int membros, String corEscama) {

        super(peso, idade, membros);
        this.corEscama = corEscama;
    }

    @Override
    public void locomover() {

        System.out.println("Rastejando");
    }

    @Override
    public void alimentar() {

        System.out.println("Comendo vegetais");
    }

    @Override
    public void emitirSom() {

        System.out.println("Som de reptil");
    }
}

class Peixe extends Animal {

    private String corEscama;

    public Peixe(double peso, int idade, int membros, String corEscama) {

        super(peso, idade, membros);
        this.corEscama = corEscama;
    }

    @Override
    public void locomover() {

        System.out.println("Nadando");
    }

    @Override
    public void alimentar() {

        System.out.println("Comendo substancias");
    }

    @Override
    public void emitirSom() {

        System.out.println("Peixe nao faz som");
    }

    public void soltarBolha() {

        System.out.println("Soltou uma bolha");
    }
}

class Canguru extends Mamifero {

    public Canguru(double peso, int idade, int membros, String corPelo) {

        super(peso, idade, membros, corPelo);
    }

    public void usarBolsa() {

        System.out.println("Usando bolsa");
    }

    @Override
    public void locomover() {

        System.out.println("Saltando");
    }
}

class Lobo extends Mamifero {

    public Lobo(double peso, int idade, int membros, String corPelo) {

        super(peso, idade, membros, corPelo);
    }

    @Override
    public void emitirSom() {

        System.out.println("Auuuuuuuu");
    }
}

class Cachorro extends Lobo {

    public Cachorro(double peso, int idade, int membros, String corPelo) {

        super(peso, idade, membros, corPelo);
    }

    @Override
    public void emitirSom() {

        System.out.println("Au! Au! Au!");
    }

    public void reagir(String frase) {

        if (frase.equalsIgnoreCase("toma comida") || frase.equalsIgnoreCase("ola")) {
            System.out.println("Abanar e latir");
        } else {
            System.out.println("Rosnar");
        }
    }

    public void reagir(int hora, int minuto) {

        if (hora < 12) {
            System.out.println("Abanar");
        } else if (hora >= 18) {
            System.out.println("Ignorar");
        } else {
            System.out.println("Abanar e latir");
        }
    }

    public void reagir(boolean dono) {

        if (dono) {
            System.out.println("Abanar");
        } else {
            System.out.println("Rosnar e latir");
        }
    }

    public void reagir(int idade, double peso) {

        if (idade < 5) {
            if (peso < 10) {
                System.out.println("Abanar");
            } else {
                System.out.println("Latir");
            }
        } else if (peso < 10) {
            System.out.println("Rosnar");
        } else {
            System.out.println("Ignorar");
        }
    }
}

class Cobra extends Reptil {

    public Cobra(double peso, int idade, int membros, String corEscama) {

        super(peso, idade, membros, corEscama);
    }

    public void atacar() {

        System.out.println("A cobra deu um bote");
    }

    public void atacar(int distancia) {

        System.out.println("A cobra atacou a " + distancia + " metros");
    }

    public void atacar(String alvo) {

        System.out.println("A cobra atacou " + alvo);
    }
}

class Tartaruga extends Reptil {

    public Tartaruga(double peso, int idade, int membros, String corEscama) {

        super(peso, idade, membros, corEscama);
    }

    @Override
    public void locomover() {

        System.out.println("Andando bem devagar");
    }
}

class GoldFish extends Peixe {

    public GoldFish(double peso, int idade, int membros, String corEscama) {

        super(peso, idade, membros, corEscama);
    }

    public void nadar() {

        System.out.println("O GoldFish comecou a nadar");
    }

    public void nadar(int minutos) {

        System.out.println("O GoldFish nadou por " + minutos + " minutos");
    }

    public void nadar(double distancia) {

        System.out.println("O GoldFish nadou " + distancia + " metros");
    }
}

public class Exercicio01 {

    public static void main(String[] args) {

        Animal[] animais = {
            new Mamifero(5.7, 8, 4, "Marrom"),
            new Canguru(55.3, 3, 4, "Marrom"),
            new Cachorro(12.5, 2, 4, "Branco"),
            new Cobra(8.2, 5, 0, "Verde"),
            new Tartaruga(20, 30, 4, "Verde"),
            new GoldFish(0.35, 1, 0, "Dourada")
        };

        for (Animal animal : animais) {
            animal.locomover();
            animal.alimentar();
            animal.emitirSom();
            System.out.println();
        }

        Cachorro cachorro = (Cachorro) animais[2];
        cachorro.reagir("ola");
        cachorro.reagir(20, 30);
        cachorro.reagir(true);
        cachorro.reagir(2, 12.5);

        Cobra cobra = (Cobra) animais[3];
        cobra.atacar();
        cobra.atacar(2);
        cobra.atacar("um rato");

        GoldFish peixe = (GoldFish) animais[5];
        peixe.nadar();
        peixe.nadar(15);
        peixe.nadar(8.5);
    }
}
