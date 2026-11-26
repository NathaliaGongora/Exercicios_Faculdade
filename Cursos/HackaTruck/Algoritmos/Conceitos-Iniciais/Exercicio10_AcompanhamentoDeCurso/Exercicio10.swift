/* Exercício complementar 10 — Acompanhamento de curso
Calcule a média de três notas e a porcentagem de aulas frequentadas.
Verifique os requisitos de desempenho e frequência, sem usar condicionais.
Exercício complementar para prática.
*/
let nome: String = "Ana"
let nota1: Double = 8.0
let nota2: Double = 7.5
let nota3: Double = 9.0
let aulasAssistidas: Int = 18
let totalAulas: Int = 20
let matriculaAtiva: Bool = true
let possuiPendencias: Bool = false

let media = (nota1 + nota2 + nota3) / 3
let frequencia = Double(aulasAssistidas) / Double(totalAulas) * 100
let mediaSuficiente = media >= 7.0
let frequenciaSuficiente = frequencia >= 75.0
let requisitosAtendidos = mediaSuficiente && frequenciaSuficiente && matriculaAtiva && !possuiPendencias
let precisaRevisao = possuiPendencias || !matriculaAtiva

print("Estudante: \(nome)")
print("Média: \(media)")
print("Frequência: \(frequencia)%")
print("Requisitos atendidos? \(requisitosAtendidos)")
print("Precisa de revisão cadastral? \(precisaRevisao)")
