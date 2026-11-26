/* Exercício complementar 09 — Pedido de uma papelaria
Calcule o valor de um pedido, o desconto e o saldo após o pagamento.
Verifique se o pagamento cobre o total e se há produtos disponíveis.
Exemplo complementar elaborado com auxílio de IA para prática.
*/
let precoUnitario: Double = 12.50
let quantidade: Int = 4
let desconto: Double = 5.00
let pagamento: Double = 60.00
let estoque: Int = 10

let subtotal = precoUnitario * Double(quantidade)
let total = subtotal - desconto
let saldo = pagamento - total
let pagamentoSuficiente = pagamento >= total
let estoqueSuficiente = estoque >= quantidade
let pedidoPodeSerAtendido = pagamentoSuficiente && estoqueSuficiente

print("Subtotal: R$ \(subtotal)")
print("Total com desconto: R$ \(total)")
print("Saldo do pagamento: R$ \(saldo)")
print("Pagamento suficiente? \(pagamentoSuficiente)")
print("Estoque suficiente? \(estoqueSuficiente)")
print("Pedido pode ser atendido? \(pedidoPodeSerAtendido)")
