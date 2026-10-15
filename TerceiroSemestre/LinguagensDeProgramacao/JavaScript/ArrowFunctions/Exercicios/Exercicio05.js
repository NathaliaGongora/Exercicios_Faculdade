/*
 * Exercicio 05 - Arrow functions
 * Origem: lista do professor
 *
 * Escreva uma função que recebe um vetor de números inteiros e mostre como resultado
 * qual é o menor e qual é o maior número.
 */

const mostrarMenorMaior = numeros => {
    if (numeros.length === 0) {
        console.log("Vetor vazio")
        return
    }

    let menor = numeros[0]
    let maior = numeros[0]

    for (let i = 1; i < numeros.length; i++) {
        if (numeros[i] < menor) {
            menor = numeros[i]
        }
        if (numeros[i] > maior) {
            maior = numeros[i]
        }
    }

    console.log(`Menor: ${menor}`)
    console.log(`Maior: ${maior}`)
}

mostrarMenorMaior([8, 3, 15, -2, 10])
