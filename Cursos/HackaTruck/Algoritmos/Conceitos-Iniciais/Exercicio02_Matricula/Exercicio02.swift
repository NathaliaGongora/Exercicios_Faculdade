/* Sistema de matrícula do HackaTruck
Imagine que você está desenvolvendo um pequeno sistema para acompanhar a situação de uma estudante.

Sua missão:
1. Crie uma constante chamada nomeAluno com seu nome.
2. Crie uma variável chamada moduloAtual com o valor 1.
3. Crie uma variável chamada nota com o valor 7.5.
4. Crie uma variável chamada matriculaAtiva com o valor true.
5. Mostre as quatro informações usando print().
Agora vem o desafio!

Sem declarar novamente as variáveis, atualize os valores:
- moduloAtual para 2.
- nota para 9.0.
- matriculaAtiva para false.
Por fim, utilize novos print() para mostrar os valores atualizados.
*/

let nomeAluno = "Nathalia"
var moduloAtual = 1
var nota = 7.5
var matriculaAtiva = true

print("=== CADASTRO INICIAL ===")
print("Nome do aluno: " + nomeAluno)
print("Modulo atual: \(moduloAtual)")
print("Nota: \(nota)")
print("A matricula está ativa? \(matriculaAtiva)")

moduloAtual = 2
nota = 9.0
matriculaAtiva = false

print(" ")
print("=== CADASTRO ATUALIZADO ===")
print("Nome do aluno: " + nomeAluno)
print("Modulo atual: \(moduloAtual)")
print("Nota: \(nota)")
print("A matricula está ativa? \(matriculaAtiva)")