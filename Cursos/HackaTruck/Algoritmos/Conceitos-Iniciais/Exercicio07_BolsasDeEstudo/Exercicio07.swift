/* Análise de bolsas de estudo
Imagine que você está desenvolvendo um programa para uma instituição de ensino que oferece bolsas a estudantes com bom desempenho acadêmico.

O sistema deverá analisar notas, frequência, renda familiar e outras condições para verificar se um estudante pode receber uma bolsa.

Parte 1 — Cadastro do estudante

Declare as seguintes informações:
Variável	Valor inicial
nomeAluno	"Carlos"
notaProva1	8.5
notaProva2	7.0
notaTrabalho	9.0
frequencia	85.0
rendaFamiliar	2500.00
possuiPendencias	false
matriculaAtiva	true

Parte 2 — Operações aritméticas

Calcule:
1. A média das três notas.
2. Quantos pontos faltam ou sobram em relação à média mínima de 7.0, usando a média calculada.
3. Quanto a renda familiar está abaixo ou acima do limite de 3000.00, calculando a diferença entre o limite e a renda.
Parte 3 — Comparações

Crie constantes booleanas para verificar:
1. Se a média é maior ou igual a 7.0.
2. Se a frequência é maior ou igual a 75.0.
3. Se a renda familiar é menor ou igual a 3000.00.
Parte 4 — Operadores lógicos

Crie constantes booleanas para verificar:
1. Bolsa aprovada: o estudante tem média suficiente E frequência suficiente E renda dentro do limite E matrícula ativa E não possui pendências.
2. Precisa de revisão: o estudante possui pendências OU a matrícula não está ativa.
3. Elegível por desempenho: a média é maior ou igual a 8.0 E a frequência é maior ou igual a 90.0.
4. Bolsa especial: o estudante é elegível por desempenho OU possui média maior ou igual a 9.0 E renda familiar menor ou igual a 2000.00.
Na última condição, utilize parênteses para deixar clara a prioridade das operações.

Parte 5 — Exibição

Exiba todos os dados iniciais, os cálculos e as verificações com mensagens explicativas.
 Regras do desafio
- Utilize apenas os conteúdos dos nove primeiros tópicos do HackaTruck.
- Não utilize if, else, switch ou laços.
- Declare explicitamente pelo menos quatro tipos.
- Utilize &&, ||, ! e operadores de comparação.
- Não coloque resultados calculados manualmente nas variáveis: use expressões.
- Organize o código com comentários.
*/

//Parte 1 — Cadastro do estudante
var nomeAluno: String = "Carlos"
var notaProva1: Double = 8.5
var notaProva2: Double = 7.0
var notaTrabalho: Double = 9.0
var frequencia = 85.0
var rendaFamiliar = 2500.00
var possuiPendencias = false
var matriculaAtiva = true

//Parte 2 — Operações aritméticas
let calculoMedia = ((notaProva1 + notaProva2 + notaTrabalho)/3)
let mediaMinima = 7.0
let mediaFaltante = (calculoMedia - mediaMinima) 
let calculoRenda = (3000.00 - rendaFamiliar)

//Parte 3 — Comparações
let media = (calculoMedia >= 7.00)
let calculoFrequencia = (frequencia >= 75.0)
let renda = (rendaFamiliar <= 3000.00)

//Parte 4 — Operadores lógicos
let bolsaAprovada = ((calculoMedia >= 7.0) && (frequencia >= 75.00) && (renda) && (matriculaAtiva == true) && (possuiPendencias == false))
let precisaRevisao = ((possuiPendencias == true) || (matriculaAtiva == false))
let elegivelDesempenho = ((calculoMedia >= 8.0) && (frequencia >= 90.0))
let bolsaEspecial = ((elegivelDesempenho == true) || ((calculoMedia >= 9.0) && rendaFamiliar <= 2000.00 ))

//Parte 5 — Exibição
print("========== Sistema de Análise de Bolsas ==========")
print(" ")
print("          Dados do Aluno          ")
print("Nome do Aluno: \(nomeAluno)")
print("Nota na Prova 1: \(notaProva1)")
print ("Nota na Prova 2: \(notaProva2)")
print("Nota no Trabalho \(notaTrabalho)")
print("Frequencia: \(frequencia)")
print("Renda Familiar \(rendaFamiliar)")
print("O aluno possui pendências? \(possuiPendencias)")
print("O aluno possui matricula ativa? \(matriculaAtiva)")

print(" ")
print("Média do aluno no semestre: \(calculoMedia)")
print("Quantos pontos faltam ou sobram em relação à média mínima de 7.0: \(mediaFaltante)")
print("Quanto a renda familiar está abaixo ou acima do limite de 3000.00: \(calculoRenda)")

print(" ")
print("A média é maior ou igual a 7.0? \(media)")
print("A frequência é maior ou igual a 75.0? \(calculoFrequencia)")
print("A renda familiar é menor ou igual a 3000.00? \(renda)")

print(" ")
print("A bolsa foi aprovada? (Requisitos:o estudante tem média suficiente E frequência suficiente E renda dentro do limite E matrícula ativa E não possui pendências) \(bolsaAprovada)")
print(" ")
print("Precisa de Revisão? (Requisitos: o estudante possui pendências OU a matrícula não está ativa.) \(precisaRevisao)")
print(" ")
print("O aluno está elegivel por desempenho? (Requisitos: a média é maior ou igual a 8.0 E a frequência é maior ou igual a 90.0.) \(elegivelDesempenho)")
print(" ")
print("O aluno está elegivel por bolsa especial? (Requisitos: o estudante é elegível por desempenho OU possui média maior ou igual a 9.0 E renda familiar menor ou igual a 2000.00) \(bolsaEspecial)")