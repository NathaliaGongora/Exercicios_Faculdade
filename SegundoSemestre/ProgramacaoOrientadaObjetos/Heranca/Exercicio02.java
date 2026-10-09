package SegundoSemestre.ProgramacaoOrientadaObjetos.Heranca;

class UsuarioStreaming {

    private String nome;
    private String email;
    private String senha;
    private String dataCadastro;
    private boolean ativo;

    public UsuarioStreaming(
            String nome,
            String email,
            String senha,
            String dataCadastro,
            boolean ativo
    ) {

        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.dataCadastro = dataCadastro;
        this.ativo = ativo;
    }

    public String getNome() {

        return nome;
    }

    public String getEmail() {

        return email;
    }

    public String getSenha() {

        return senha;
    }

    public String getDataCadastro() {

        return dataCadastro;
    }

    public boolean getAtivo() {

        return ativo;
    }

    public void alterarEmail(String email) {

        this.email = email;
    }

    public String exibirPerfil() {

        return "Nome: " + nome
                + "\nEmail: " + email
                + "\nData de cadastro: " + dataCadastro
                + "\nAtivo: " + ativo;
    }
}

class ConteudoStreaming {

    private String titulo;
    private String genero;
    private int duracao;
    private int classificacao;

    public ConteudoStreaming(String titulo, String genero, int duracao, int classificacao) {

        this.titulo = titulo;
        this.genero = genero;
        this.duracao = duracao;
        this.classificacao = classificacao;
    }

    public String getTitulo() {

        return titulo;
    }

    public void reproduzir() {

        System.out.println("Reproduzindo: " + titulo);
    }

    public boolean recomendadoPara(int idade) {

        return idade >= classificacao;
    }

    public String exibirDetalhes() {

        return titulo
                + " | Genero: " + genero
                + " | Duracao: " + duracao + " minutos"
                + " | Classificacao: " + classificacao + " anos";
    }
}

class UsuarioGratuito extends UsuarioStreaming {

    private int anunciosPorHora;
    private String limiteResolucao;
    private boolean downloadsPermitidos;

    public UsuarioGratuito(
            String nome,
            String email,
            String senha,
            String dataCadastro,
            boolean ativo,
            int anunciosPorHora,
            String limiteResolucao,
            boolean downloadsPermitidos
    ) {

        super(nome, email, senha, dataCadastro, ativo);
        this.anunciosPorHora = anunciosPorHora;
        this.limiteResolucao = limiteResolucao;
        this.downloadsPermitidos = downloadsPermitidos;
    }

    public void assistirAnuncio() {

        System.out.println("Anuncio exibido para " + getNome());
    }

    public void reproduzirPrevia(ConteudoStreaming conteudo) {

        System.out.println(getNome() + " iniciou uma previa de " + conteudo.getTitulo());
    }

    public String exibirLimitacoes() {

        return "Anuncios por hora: " + anunciosPorHora
                + "\nResolucao maxima: " + limiteResolucao
                + "\nDownloads permitidos: " + downloadsPermitidos;
    }
}

class UsuarioPremium extends UsuarioStreaming {

    private String plano;
    private int telasSimultaneas;
    private int downloadsDisponiveis;

    public UsuarioPremium(
            String nome,
            String email,
            String senha,
            String dataCadastro,
            boolean ativo,
            String plano,
            int telasSimultaneas,
            int downloadsDisponiveis
    ) {

        super(nome, email, senha, dataCadastro, ativo);
        this.plano = plano;
        this.telasSimultaneas = telasSimultaneas;
        this.downloadsDisponiveis = downloadsDisponiveis;
    }

    public void assistirConteudo(ConteudoStreaming conteudo) {

        System.out.println(getNome() + " esta assistindo " + conteudo.getTitulo());
        conteudo.reproduzir();
    }

    public void baixarConteudo(ConteudoStreaming conteudo) {

        if (downloadsDisponiveis > 0) {
            downloadsDisponiveis--;
            System.out.println(conteudo.getTitulo() + " foi baixado.");
        }
    }

    public String exibirBeneficios() {

        return "Plano: " + plano
                + "\nTelas simultaneas: " + telasSimultaneas
                + "\nDownloads disponiveis: " + downloadsDisponiveis;
    }
}

public class Exercicio02 {

    public static void main(String[] args) {

        ConteudoStreaming conteudo = new ConteudoStreaming(
                "Cidade Digital",
                "Ficcao",
                110,
                12
        );

        UsuarioGratuito gratuito = new UsuarioGratuito(
                "Lucas",
                "lucas@email.com",
                "1234",
                "10/10/2026",
                true,
                4,
                "720p",
                false
        );

        UsuarioPremium premium = new UsuarioPremium(
                "Fernanda",
                "fernanda@email.com",
                "5678",
                "09/10/2026",
                true,
                "Familia",
                4,
                10
        );

        System.out.println(conteudo.exibirDetalhes());

        System.out.println("\nUsuario gratuito");
        System.out.println(gratuito.exibirPerfil());
        System.out.println(gratuito.exibirLimitacoes());
        gratuito.assistirAnuncio();
        gratuito.reproduzirPrevia(conteudo);

        System.out.println("\nUsuario premium");
        System.out.println(premium.exibirPerfil());
        System.out.println(premium.exibirBeneficios());
        premium.assistirConteudo(conteudo);
        premium.baixarConteudo(conteudo);
    }
}
