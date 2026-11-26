/* Controle de entrada em um evento de tecnologia
Imagine que você está criando um sistema para verificar se uma pessoa pode entrar em um evento de tecnologia.

O sistema deverá utilizar operadores aritméticos, lógicos e de comparação, sem if ou else.

Parte 1 — Cadastro

Crie estas informações:
Variável	          |Valor inicial
nomeParticipante	  |"Nathalia"
idade	              |24
possuiIngresso	    |true
possuiDocumento	    |true
valorIngresso	      |75.00
dinheiroDisponivel	|100.00
idadeMinima	        |18

Parte 2 — Operações aritméticas

Calcule:
1. Quanto dinheiro sobraria após comprar o ingresso.
2. Quantos anos a participante tem acima da idade mínima.
Parte 3 — Operadores de comparação

Crie constantes booleanas para verificar:
1. Se a participante tem idade suficiente.
2. Se possui dinheiro suficiente para comprar o ingresso.
3. Se a idade é exatamente igual à idade mínima.
Parte 4 — Operadores lógicos

Crie constantes booleanas que respondam:
1. Entrada permitida: a participante tem idade suficiente E possui ingresso E possui documento.
2. Precisa de atendimento: a participante não possui ingresso OU não possui documento.
3. Pode comprar ingresso: a participante tem dinheiro suficiente E ainda não possui ingresso.
Parte 5 — Exibição

Exiba todas as informações e os resultados utilizando print() e interpolação de strings.

Regras
- Utilize &&, || e ! ao longo do exercício.
- Não utilize if, else ou laços de repetição.
- Não escreva resultados booleanos diretamente como true ou false: calcule-os por meio das expressões.
- Utilize pelo menos quatro tipos explicitamente declarados.
- Organize seu código com comentários.
 */

//Parte 1 — Cadastro
var nomeParticipante: String = "Nathália"
var idade: Int = 24
var possuiIngresso: Bool = true
var possuiDocumento: Bool = true
var valorIngresso = 75.00
var dinheiroDisponivel = 100.00
var idadeMinima = 18

//Parte 2 — Operações aritméticas
let troco = (dinheiroDisponivel - valorIngresso)
let idadeSuperior = (idade - idadeMinima)

//Parte 3 — Operadores de comparação
let idadeSuficiente = (idade >= idadeMinima)
let dinheiroSuficiente = (dinheiroDisponivel >= valorIngresso)
let idadeIgual = (idade == idadeMinima)

//Parte 4 — Operadores lógicos
let entradaPermitida =  (idadeSuficiente && possuiIngresso && possuiDocumento)
let precisaAtendimento = (!possuiIngresso || !possuiDocumento)
let podeComprarIngresso = (dinheiroSuficiente && !possuiIngresso)

//Parte 5 — Exibição
print("========== Controle de entrada ==========")
print("")
print("Nome: \(nomeParticipante)")
print("Idade: \(idade)")
print("Possui ingresso? \(possuiIngresso)")
print("Possui documento? \(possuiDocumento)")
print("Valor do Ingresso: \(valorIngresso)")
print("Dinheiro disponivel: \(dinheiroDisponivel)")
print("Idade Minima para o evento: \(idadeMinima)")

print(" ")
print("Quanto dinheiro irá sobrar após comprar o ingresso: \(troco) reais")
print(" ")
print("Quantos anos a participante tem acima da idade mínima: \(idadeSuperior)")
print(" ")
print("A participante tem idade suficiente? \(idadeSuficiente)")
print(" ")
print("Ela possui dinheiro suficiente para comprar o ingresso? \(dinheiroSuficiente)")
print(" ")
print("A idade é exatamente igual à idade mínima? \(idadeIgual)")
print(" ")
print("Entrada permitida (a participante tem idade suficiente E possui ingresso E possui documento): \(entradaPermitida)")
print(" ")
print("Precisa de atendimento (a participante não possui ingresso OU não possui documento): \(precisaAtendimento)")
print(" ")
print("Pode comprar ingresso (a participante tem dinheiro suficiente E ainda não possui ingresso): \(podeComprarIngresso)")
print("=======================================================================================================================")