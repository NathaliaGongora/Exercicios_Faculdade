/*Sistema de Recursos Humanos
Imagine que uma empresa contratou você para desenvolver um programa simples que registre e atualize os dados de um funcionário.

Parte 1 — Cadastro inicial

O sistema deverá armazenar as seguintes informações:
Informação |	Nome da variável | Valor inicial
Código	   |codigoFuncionario	 |"FUNC001"
Nome	     |nomeFuncionario	   |"Mariana Silva"
Idade	     |idade	             |25
Cargo	     |cargo	             |"Estagiária"
Salário	   |salario	           |1800.50
Ativo	     |funcionarioAtivo	 |true
Empresa	   |nomeEmpresa	       |"Tech Solutions"

Regras: o código do funcionário e o nome da empresa devem ser constantes. Os demais dados devem ser variáveis.

Parte 2 — Exibição

Exiba todas as informações do funcionário no terminal, com o título === CADASTRO INICIAL ===.

Parte 3 — Atualização

Alguns meses se passaram, e Mariana recebeu uma promoção. Atualize os seguintes dados:
- Cargo: "Desenvolvedora Júnior"
- Salário: 3200.75
- Idade: 26
- Funcionário ativo: continua true
Não declare novamente as variáveis e não altere as constantes.

Parte 4 — Resultado atualizado

Exiba todas as informações com o título === CADASTRO ATUALIZADO ===, separando visualmente os dois cadastros.
 */

let codigoFuncionario: String = "FUNC001"
var nomeFuncionario: String = "Mariana Silva"
var idade: Int = 25
var cargo: String = "Estagiária"
var salario: Double = 1800.50
var funcionarioAtivo: Bool = true
let nomeEmpresa: String = "Tech Solutions"

print("=== CADASTRO INICIAL ===")
print("Código do Funcionário: " + codigoFuncionario)
print("Nome do Funcionário: \(nomeFuncionario)")
print("Idade: \(idade)")
print("Cargo:  \(cargo)")
print("Salário: \(salario)")
print ("O funcionário está ativo? \(funcionarioAtivo)")
print("Nome da Empresa: \(nomeEmpresa)")

cargo = "Desenvolvedora Júnior"
salario = 3200.75
idade = 26
funcionarioAtivo = true

print("")
print("=== CADASTRO ATUALIZADO ===")
print("Código do Funcionário: " + codigoFuncionario)
print("Nome do Funcionário: \(nomeFuncionario)")
print("Idade: \(idade)")
print("Cargo:  \(cargo)")
print("Salário: \(salario)")
print ("O funcionário está ativo? \(funcionarioAtivo)")
print("Nome da Empresa: \(nomeEmpresa)")