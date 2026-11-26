/* Exercício complementar 08 — Consumo de energia
Calcule o consumo mensal de um aparelho e o custo estimado.
Considere 1.500 W, 2 horas por dia, 30 dias e tarifa de R$ 0,90 por kWh.
Exercício complementar para prática.
*/
let potenciaWatts: Double = 1500
let horasPorDia: Double = 2
let dias: Double = 30
let tarifa: Double = 0.90

let potenciaKw = potenciaWatts / 1000
let consumoMensal = potenciaKw * horasPorDia * dias
let custoMensal = consumoMensal * tarifa
let consumoAcimaDeCinquenta = consumoMensal > 50

print("Consumo mensal: \(consumoMensal) kWh")
print("Custo estimado: R$ \(custoMensal)")
print("Consumo acima de 50 kWh? \(consumoAcimaDeCinquenta)")
