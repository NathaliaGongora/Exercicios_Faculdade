package SegundoSemestre.ProgramacaoOrientadaObjetos.EncapsulamentoGetSet.papelaria;

public class Tesoura {

    private String tipo;
    private String material;
    private double tamanho;
    private boolean aberta;
    private int afiacao;

    public Tesoura(String tipo, String material, double tamanho) {

        this.tipo = tipo;
        this.material = material;
        this.tamanho = tamanho;
        this.aberta = false;
        this.afiacao = 100;
    }

    public void abrir() {

        aberta = true;
    }

    public void fechar() {

        aberta = false;
    }

    public void afiar() {

        afiacao = 100;
        System.out.println("Tesoura afiada.");
    }

    public void cortar(int espessuraFolha) {

        if (!aberta) {

            System.out.println("A tesoura esta fechada.");
        } else if (espessuraFolha > 180) {

            System.out.println("A folha e muito grossa.");
        } else if (afiacao < 5) {

            System.out.println("A tesoura precisa ser afiada.");
        } else {

            afiacao = afiacao - 5;
            System.out.println("Folha cortada.");
        }
    }

    public void status() {

        System.out.println("Tipo: " + tipo);
        System.out.println("Material: " + material);
        System.out.println("Tamanho: " + tamanho);
        System.out.println("Aberta: " + aberta);
        System.out.println("Afiacao: " + afiacao + "%");
    }

    public String getTipo() {

        return tipo;
    }

    public void setTipo(String tipo) {

        this.tipo = tipo;
    }

    public String getMaterial() {

        return material;
    }

    public void setMaterial(String material) {

        this.material = material;
    }

    public double getTamanho() {

        return tamanho;
    }

    public void setTamanho(double tamanho) {

        this.tamanho = tamanho;
    }

    public boolean isAberta() {

        return aberta;
    }

    public void setAberta(boolean aberta) {

        this.aberta = aberta;
    }

    public int getAfiacao() {

        return afiacao;
    }

    public void setAfiacao(int afiacao) {

        this.afiacao = afiacao;
    }
}
