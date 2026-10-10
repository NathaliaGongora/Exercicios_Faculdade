package SegundoSemestre.ProgramacaoOrientadaObjetos.Polimorfismo;

abstract class Notificacao {

    protected String destinatario;
    protected String mensagem;

    public Notificacao(String destinatario, String mensagem) {

        this.destinatario = destinatario;
        this.mensagem = mensagem;
    }

    public abstract void enviar();
}

class NotificacaoEmail extends Notificacao {

    public NotificacaoEmail(String destinatario, String mensagem) {

        super(destinatario, mensagem);
    }

    @Override
    public void enviar() {

        System.out.println("Email enviado para " + destinatario + ": " + mensagem);
    }
}

class NotificacaoSms extends Notificacao {

    public NotificacaoSms(String destinatario, String mensagem) {

        super(destinatario, mensagem);
    }

    @Override
    public void enviar() {

        System.out.println("SMS enviado para " + destinatario + ": " + mensagem);
    }
}

class NotificacaoPush extends Notificacao {

    public NotificacaoPush(String destinatario, String mensagem) {

        super(destinatario, mensagem);
    }

    @Override
    public void enviar() {

        System.out.println("Notificacao enviada ao aplicativo de " + destinatario + ": " + mensagem);
    }
}

public class Exercicio05 {

    public static void main(String[] args) {

        Notificacao[] notificacoes = {
            new NotificacaoEmail("ana@email.com", "Cadastro realizado"),
            new NotificacaoSms("15999999999", "Pedido enviado"),
            new NotificacaoPush("Lucas", "Nova mensagem recebida")
        };

        for (Notificacao notificacao : notificacoes) {
            notificacao.enviar();
        }
    }
}
