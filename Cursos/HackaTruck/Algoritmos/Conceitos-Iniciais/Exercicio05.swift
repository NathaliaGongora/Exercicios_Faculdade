/*Calculadora de compras de uma papelaria
Imagine que você está desenvolvendo um sistema para uma papelaria que precisa calcular o valor de uma compra.

Parte 1 — Cadastro dos produtos

Crie as seguintes informações:
Variável	Valor
precoCaderno	25.50
quantidadeCaderno	3
precoCaneta	4.00
quantidadeCaneta	5

Parte 2 — Cálculos

Seu programa deverá calcular:
1. O valor total dos cadernos.
2. O valor total das canetas.
3. O valor total da compra.
4. O valor restante caso o cliente pague R$ 100,00.
Parte 3 — Comparações

Crie três constantes booleanas para verificar:
1. Se o total da compra é maior que R$ 80,00.
2. Se o pagamento de R$ 100,00 é suficiente para cobrir a compra.
3. Se a quantidade de cadernos é igual à quantidade de canetas.
Parte 4 — Exibição

Mostre os resultados dos cálculos e das comparações usando print() e interpolação de strings.
 */

let precoCaderno = 25.50
var quantidadeCaderno = 3
let precoCaneta = 4.00
var quantidadeCaneta = 5
let canetaDecimal = Double(quantidadeCaneta)
let cadernoDecimal = Double(quantidadeCaderno)
var valorTotalCadernos = precoCaderno * cadernoDecimal
var valorTotalCanetas = precoCaneta * canetaDecimal
var valorTotal = valorTotalCadernos + valorTotalCanetas
var troco = 100.00 - valorTotal

//Parte 2 — Cálculos
print("========== Calculadora de compras de uma papelaria ==========")
print("Valor total dos cadernos: \(precoCaderno) * \(quantidadeCaderno) = \(valorTotalCadernos)")
print ("Valor total das canetas: \(precoCaneta) * \(quantidadeCaneta) = \(valorTotalCanetas)")
print("Valor total da compra: \(valorTotalCadernos) + \(valorTotalCanetas) = \(valorTotal)")
print("O troco é: \(troco)")

let pagamentoSuficiente = (100.00 >= valorTotal)
let pagamentoMaior = (valorTotal > 80.00)
let quantidadesIguais = (quantidadeCaderno == quantidadeCaneta)

//Parte 3 — Comparações
print("O total da compra é maior que R$ 80,00? \(pagamentoMaior)")
print("O pagamento de R$ 100,00 é suficiente para cobrir a compra? \(pagamentoSuficiente)")
print("A quantidade de cadernos é igual à quantidade de canetas? \(quantidadesIguais)")