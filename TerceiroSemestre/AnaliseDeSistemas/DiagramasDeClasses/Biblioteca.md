# Biblioteca

Modelo para controlar leitores, acervo, empréstimos e reservas.

![Diagrama de classes de biblioteca](Biblioteca.svg)

[Fonte PlantUML editável](Biblioteca.puml)

```mermaid
classDiagram
direction TB

class Usuario {
  <<abstract>>
  -int id
  -String nome
  -String email
  +realizarLogin()
}

class Leitor {
  -String numeroCadastro
  +consultarAcervo()
  +solicitarEmprestimo(exemplar)
}

class Bibliotecario {
  -String matricula
  +cadastrarLivro(livro)
  +registrarDevolucao(emprestimo)
}

class Livro {
  -int id
  -String titulo
  -String autor
  -String isbn
  +consultarExemplares()
}

class Exemplar {
  -int tombo
  -String status
  -String localizacao
  +estaDisponivel() bool
  +atualizarStatus(status)
}

class Emprestimo {
  -int id
  -Date dataRetirada
  -Date dataPrevista
  -Date dataDevolucao
  +registrar()
  +calcularAtraso() int
}

class Reserva {
  -int id
  -DateTime dataReserva
  -String status
  +confirmar()
  +cancelar()
}

Usuario <|-- Leitor
Usuario <|-- Bibliotecario
Livro "1" *-- "1..*" Exemplar : possui
Leitor "1" --> "0..*" Emprestimo : realiza
Exemplar "1" --> "0..*" Emprestimo : aparece no historico
Leitor "1" --> "0..*" Reserva : solicita
Livro "1" --> "0..*" Reserva : recebe
Bibliotecario ..> Emprestimo : registra
```

**Premissa:** um livro pode ter vários exemplares físicos. O histórico de empréstimos é preservado, mesmo depois da devolução do exemplar.
