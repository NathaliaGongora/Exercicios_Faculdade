/*
 * Exercicio 03 - Arrow functions
 * Origem: lista do professor
 *
 * Elabore duas funções que recebem três parâmetros: capital inicial, taxa de juros e
 * tempo de aplicação. A primeira função retornará o montante da aplicação financeira
 * sob o regime de juros simples e a segunda retornará o valor da aplicação sob o regime
 * de juros compostos.
 *
 * Taxa em decimal: 0.02 representa 2% por periodo.
 * O tempo deve usar a mesma unidade da taxa.
 */

const jurosSimples = (capital, taxa, tempo) => capital * (1 + taxa * tempo)

const jurosCompostos = (capital, taxa, tempo) => capital * (1 + taxa) ** tempo

console.log(`Juros simples: ${jurosSimples(1000, 0.02, 3).toFixed(2)}`)
console.log(`Juros compostos: ${jurosCompostos(1000, 0.02, 3).toFixed(2)}`)
