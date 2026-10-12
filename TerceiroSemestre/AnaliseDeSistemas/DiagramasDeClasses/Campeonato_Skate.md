# Campeonato virtual de skate

Modelo de classes para inscrição de skatistas, envio de vídeos e avaliação das participações.

```mermaid
classDiagram
direction TB

class Usuario {
  <<abstract>>
  -int id
  -String nome
  -String email
  -String senhaHash
  +realizarLogin(email, senha) bool
  +editarPerfil()
}

class Skatista {
  -String apelido
  -String categoria
  +inscreverSe(campeonato)
  +enviarVideo()
}

class Juiz {
  -String registro
  +avaliarVideo(video, nota)
  +revisarAvaliacao(avaliacao)
}

class Administrador {
  +criarCampeonato()
  +analisarDenuncia(denuncia)
}

class Campeonato {
  -int id
  -String nome
  -Date dataInicio
  -Date dataFim
  -String regulamento
  +abrirInscricoes()
  +publicarResultado()
}

class Inscricao {
  -int id
  -DateTime dataInscricao
  -String status
  +confirmar()
  +cancelar()
}

class Video {
  -int id
  -String url
  -DateTime dataEnvio
  -String status
  +validarFormato() bool
  +publicar()
}

class Avaliacao {
  -int id
  -double nota
  -String observacao
  -DateTime dataAvaliacao
  +registrarNota(nota)
  +solicitarRevisao()
}

class Denuncia {
  -int id
  -String motivo
  -String status
  -DateTime dataAbertura
  +registrar()
  +encerrar()
}

Usuario <|-- Skatista
Usuario <|-- Juiz
Usuario <|-- Administrador
Skatista "1" --> "0..*" Inscricao : realiza
Campeonato "1" *-- "0..*" Inscricao : recebe
Inscricao "1" --> "1" Video : apresenta
Video "1" --> "0..*" Avaliacao : recebe
Juiz "1" --> "0..*" Avaliacao : registra
Usuario "1" --> "0..*" Denuncia : abre
Administrador ..> Denuncia : analisa
```

**Premissa:** cada inscrição apresenta um vídeo e pode receber avaliações de vários juízes. A classe `Inscricao` depende do campeonato ao qual pertence.
