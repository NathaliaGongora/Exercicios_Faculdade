package SegundoSemestre.ProgramacaoOrientadaObjetos.EncapsulamentoGetSet.banco;

public class ContaBanco {

    public int numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;

    public ContaBanco(int numConta, String dono) {

        this.numConta = numConta;
        this.dono = dono;
        this.saldo = 0;
        this.status = false;
    }

    public void abrirConta(String tipo, boolean mulher) {

        if (!tipo.equalsIgnoreCase("CC") && !tipo.equalsIgnoreCase("CP")) {

            System.out.println("Tipo de conta invalido.");
            return;
        }

        this.tipo = tipo.toUpperCase();
        this.status = true;

        if (mulher) {

            this.saldo = 100;
        } else {

            this.saldo = 30;
        }

        System.out.println("Conta aberta com sucesso.");
    }

    public void fecharConta() {

        if (saldo == 0) {

            status = false;
            System.out.println("Conta fechada com sucesso.");
        } else {

            System.out.println("A conta precisa estar sem saldo e sem debitos.");
        }
    }

    public void depositar(double valor) {

        if (status && valor > 0) {

            saldo = saldo + valor;
            System.out.println("Deposito realizado.");
        } else {

            System.out.println("Nao foi possivel realizar o deposito.");
        }
    }

    public void sacar(double valor) {

        if (status && valor > 0 && valor <= saldo) {

            saldo = saldo - valor;
            System.out.println("Saque realizado.");
        } else {

            System.out.println("Nao foi possivel realizar o saque.");
        }
    }

    public void pagarMensalidade() {

        if (status && saldo >= 2.50) {

            saldo = saldo - 2.50;
            System.out.println("Mensalidade paga.");
        } else {

            System.out.println("Saldo insuficiente ou conta fechada.");
        }
    }

    public void mostrarDados() {

        System.out.println("Numero da conta: " + numConta);
        System.out.println("Tipo: " + tipo);
        System.out.println("Dono: " + dono);
        System.out.println("Saldo: R$ " + saldo);
        System.out.println("Conta aberta: " + status);
    }

    public int getNumConta() {

        return numConta;
    }

    public void setNumConta(int numConta) {

        this.numConta = numConta;
    }

    public String getTipo() {

        return tipo;
    }

    public void setTipo(String tipo) {

        this.tipo = tipo;
    }

    public String getDono() {

        return dono;
    }

    public void setDono(String dono) {

        this.dono = dono;
    }

    public double getSaldo() {

        return saldo;
    }

    public void setSaldo(double saldo) {

        this.saldo = saldo;
    }

    public boolean isStatus() {

        return status;
    }

    public void setStatus(boolean status) {

        this.status = status;
    }
}
