/* Sistema de estoque de uma loja
Imagine que você foi contratada para desenvolver a primeira versão de um sistema de controle de estoque.

O sistema precisa armazenar informações de um produto e permitir que elas sejam atualizadas.

Parte 1 — Cadastro inicial
Crie as seguintes informações:
Informação	Valor inicial	Declaração
codigoProduto	|"PROD001"    |Constante
nomeProduto	  |"Teclado"    |Variável
preco	        | 89.90	      |Variável
quantidade	  |15	          |Variável
disponivel	  |true	        |Variável
categoria	    |"Periféricos"|Constante

Exiba todas essas informações no terminal.

Parte 2 — Atualização

Imagine que o cadastro estava desatualizado. Você descobriu que:
- O nome correto é "Teclado Mecânico".
- O preço passou a ser 149.90.
- A quantidade disponível é 8.
- O produto está indisponível (false).
Atualize os valores sem declarar novas variáveis.

Parte 3 — Exibição final

Mostre novamente as informações do produto após as atualizações.

Exemplo do resultado esperado após a atualização:
=== PRODUTO ATUALIZADO ===
Código: PROD001
Produto: Teclado Mecânico
Categoria: Periféricos
Preço: 149.9
Quantidade: 8
Disponível: false
*/

let codigoProduto: String = "PROD001"
var nomeProduto: String = "Teclado"
var preco: Float = 89.90
var quantidade: Int = 15
var disponivel: Bool = true
let categoria: String = "Periféricos"

print("=== CADASTRO INICIAL ===")
print("Código do Produto: " + codigoProduto)
print("Nome do Produto: \(nomeProduto)")
print("Preço: \(preco)")
print("O item está disponivel? \(disponivel)")
print("Quantidade disponivel: \(quantidade)")
print ("Categoria do Produto: \(categoria)")

nomeProduto = "Teclado Mecânico"
preco = 149.90
quantidade = 8
disponivel = false

print(" ")
print("=== CADASTRO ATUALIZADO ===")
print("Código do Produto: " + codigoProduto)
print("Nome do Produto: \(nomeProduto)")
print("Preço: \(preco)")
print("O item está disponivel? \(disponivel)")
print("Quantidade disponivel: \(quantidade)")
print ("Categoria do Produto: \(categoria)")