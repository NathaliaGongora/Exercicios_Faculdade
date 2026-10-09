package SegundoSemestre.ProgramacaoOrientadaObjetos.AssociacaoAgregacaoComposicao;

class ClienteCompra {

    private String nome;
    private String cpf;

    public ClienteCompra(String nome, String cpf) {

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
}

class CompraCliente {

    private int numero;
    private double valor;
    private ClienteCompra cliente;

    public CompraCliente(int numero, double valor, ClienteCompra cliente) {

        this.numero = numero;
        this.valor = valor;
        this.cliente = cliente;
    }

    public String imprimir() {

        return "Compra: " + numero
                + "\nCliente: " + cliente.getNome()
                + "\nCPF: " + cliente.getCpf()
                + String.format("\nValor: R$ %.2f", valor);
    }
}

public class Exercicio04 {

    public static void main(String[] args) {

        ClienteCompra cliente = new ClienteCompra("Mariana Oliveira", "123.456.789-00");
        CompraCliente compra = new CompraCliente(1001, 259.90, cliente);

        System.out.println(compra.imprimir());
    }
}
