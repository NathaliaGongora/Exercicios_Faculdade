# Lumio

Modelo de classes para acompanhar residências, contas de energia, metas de consumo e recomendações.

![Diagrama de classes do Lumio](Lumio.svg)

[Fonte PlantUML editável](Lumio.puml)

```mermaid
classDiagram
direction TB

class EmpresaContratante {
  -int id
  -String nome
  -String dominio
  +gerenciarUsuarios()
}

class Usuario {
  -int id
  -String nome
  -String email
  -String senhaHash
  -DateTime criadoEm
  +autenticar(email, senha) bool
  +atualizarCadastro()
}

class RegistroInteresse {
  -int id
  -DateTime dataManifestacao
  -String status
  +registrarInteresse()
  +atualizarStatus(status)
}

class Residencia {
  -int id
  -String endereco
  -String tipo
  -String ucDistribuidora
  +consultarConsumo()
  +calcularEconomia()
}

class ContaEnergia {
  -int id
  -String arquivo
  -String mesReferencia
  -double consumoKwh
  -double valorTotal
  -String grupoTarifario
  +extrairDados()
  +confirmarDados()
}

class Recomendacao {
  -int id
  -String tipo
  -String titulo
  -String descricao
  +gerar()
  +marcarComoVista()
}

class Meta {
  -int id
  -double kwhAlvo
  -int anoAlvo
  -Date dataMeta
  +definirAlvo(kwh)
  +consultarProgresso()
}

class Equipamento {
  -int id
  -String nome
  -double potenciaW
  -String fabricante
  -int quantidade
  +estimarConsumo(horasPorDia) double
}

class ConsumoEstimado {
  -int id
  -String mesReferencia
  -double horasPorDia
  -double valorEstimado
  +calcular()
}

EmpresaContratante "1" --> "0..*" Usuario : administra
Usuario "1" --> "0..*" Residencia : acompanha
Usuario "1" --> "0..*" RegistroInteresse : manifesta
Residencia "1" --> "0..*" ContaEnergia : recebe
Residencia "1" --> "0..*" Recomendacao : recebe
Residencia "1" --> "0..*" Meta : define
Residencia "1" o-- "0..*" Equipamento : possui
Equipamento "1" --> "0..*" ConsumoEstimado : gera
```

**Premissa:** uma empresa contratante administra usuários da sua plataforma. Cada usuário pode acompanhar várias residências. Os métodos são sugestões de operações do domínio e podem mudar após o diagrama de sequência.
