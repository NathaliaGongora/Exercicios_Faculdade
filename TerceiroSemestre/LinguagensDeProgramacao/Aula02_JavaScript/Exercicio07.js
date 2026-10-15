/*
 * Exercicio 07 - Lista 01 de JavaScript
 *
 * Escreva uma função que receba uma string como argumento e retorne a string invertida.
 */

function inverterString(texto) {
    let invertida = ""

    for (let i = texto.length - 1; i >= 0; i--) {
        invertida += texto[i]
    }

    return invertida
}

console.log(inverterString("javascript"))
