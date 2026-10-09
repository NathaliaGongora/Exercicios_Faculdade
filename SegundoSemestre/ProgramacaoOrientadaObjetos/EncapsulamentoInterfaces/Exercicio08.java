package SegundoSemestre.ProgramacaoOrientadaObjetos.EncapsulamentoInterfaces;

interface ControleReserva {

    double calcularTotal();

    void aplicarDesconto(double percentual);

    String exibirReserva();
}

class ReservaHotel implements ControleReserva {

    private String hospede;
    private int quantidadeDiarias;
    private double valorDiaria;
    private double desconto;

    public ReservaHotel(String hospede, int quantidadeDiarias, double valorDiaria) {

        this.hospede = hospede;
        this.quantidadeDiarias = quantidadeDiarias;
        this.valorDiaria = valorDiaria;
    }

    public String getHospede() {

        return hospede;
    }

    public void setHospede(String hospede) {

        this.hospede = hospede;
    }

    public int getQuantidadeDiarias() {

        return quantidadeDiarias;
    }

    public void setQuantidadeDiarias(int quantidadeDiarias) {

        if (quantidadeDiarias > 0) {
            this.quantidadeDiarias = quantidadeDiarias;
        }
    }

    public double getValorDiaria() {

        return valorDiaria;
    }

    public void setValorDiaria(double valorDiaria) {

        if (valorDiaria > 0) {
            this.valorDiaria = valorDiaria;
        }
    }

    public double getDesconto() {

        return desconto;
    }

    @Override
    public double calcularTotal() {

        double total = quantidadeDiarias * valorDiaria;
        return total - (total * desconto / 100);
    }

    @Override
    public void aplicarDesconto(double percentual) {

        if (percentual >= 0 && percentual <= 100) {
            desconto = percentual;
        }
    }

    @Override
    public String exibirReserva() {

        return "Hospede: " + hospede
                + "\nDiarias: " + quantidadeDiarias
                + String.format("\nValor da diaria: R$ %.2f", valorDiaria)
                + String.format("\nDesconto: %.1f%%", desconto)
                + String.format("\nTotal: R$ %.2f", calcularTotal());
    }
}

public class Exercicio08 {

    public static void main(String[] args) {

        ReservaHotel reserva = new ReservaHotel("Julia Alves", 4, 180);

        reserva.aplicarDesconto(10);

        System.out.println(reserva.exibirReserva());
    }
}
