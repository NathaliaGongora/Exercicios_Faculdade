/*
 * Exercicio 08 - Lista 01 de JavaScript
 *
 * Escreva uma função que recebe uma string como argumento e retorna o número de vogais
 * presentes nessa string. Considere apenas vogais minúsculas (a, e, i, o, u).
 */

function contarVogais(texto) {
    let quantidade = 0

    for (let i = 0; i < texto.length; i++) {
        const letra = texto[i]
        if (letra === "a" || letra === "e" || letra === "i" ||
            letra === "o" || letra === "u") {
            quantidade++
        }
    }

    return quantidade
}

console.log(contarVogais("javascript"))
