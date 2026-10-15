/*
 * Exercicio 10 - Lista 01 de JavaScript
 *
 * Escreva uma função que verifique se uma determinada string é um palíndromo (ou seja,
 * pode ser lida da mesma forma tanto da esquerda para a direita quanto da direita para
 * a esquerda).
 *
 * Exemplo: arara
 */

function ehPalindromo(texto) {
    let invertida = ""

    for (let i = texto.length - 1; i >= 0; i--) {
        invertida += texto[i]
    }

    return texto === invertida
}

console.log(ehPalindromo("arara"))
console.log(ehPalindromo("javascript"))
