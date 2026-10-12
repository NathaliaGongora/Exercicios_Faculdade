# Cadastro e autenticação

Modelo baseado no exercício “Modelagem Frankenstein”, com cadastro, autenticação, consulta de CPF e consentimento para importar dados.

![Diagrama de classes de cadastro e autenticação](Cadastro_Autenticacao.svg)

[Fonte PlantUML editável](Cadastro_Autenticacao.puml)

```mermaid
classDiagram
direction TB

class Usuario {
  <<abstract>>
  -int id
  -String nome
  -String email
  +autenticar()
  +atualizarCadastro()
}

class Cliente {
  -String cpf
  -String telefone
  +solicitarAutenticacaoDoisFatores()
  +autorizarUsoDeDados()
}

class Funcionario {
  -String matricula
  +consultarCadastro(cliente)
}

class Atendente {
  +cadastrarCliente(cliente)
}

class Gerente {
  +gerarRelatorio()
}

class Credencial {
  -int id
  -String metodo
  -String identificador
  -boolean ativa
  +validar() bool
  +desativar()
}

class ConsultaCpf {
  -int id
  -DateTime dataConsulta
  -String origem
  -String resultado
  +consultarReceitaFederal(cpf)
  +consultarSerasa(cpf)
}

class Consentimento {
  -int id
  -String finalidade
  -DateTime dataAceite
  -DateTime dataRevogacao
  +registrarAceite()
  +revogar()
}

class ImportacaoInstagram {
  -int id
  -DateTime dataImportacao
  -String status
  +verificarConsentimento() bool
  +importarDados()
}

class Relatorio {
  -int id
  -DateTime dataGeracao
  -String tipo
  +gerar()
  +exportarPdf()
}

Usuario <|-- Cliente
Usuario <|-- Funcionario
Funcionario <|-- Atendente
Funcionario <|-- Gerente
Usuario "1" *-- "1..*" Credencial : possui
Cliente "1" --> "0..*" ConsultaCpf : solicita
Cliente "1" --> "0..*" Consentimento : registra
ImportacaoInstagram ..> Consentimento : verifica
Gerente ..> Relatorio : gera
```

**Premissas:** biometria e método alternativo aparecem como tipos de credencial, porque o enunciado dá orientações conflitantes sobre a obrigatoriedade da biometria. A importação do Instagram exige consentimento. A classe `Relatorio` fica ligada ao gerente, que é o perfil autorizado a gerar relatórios.
