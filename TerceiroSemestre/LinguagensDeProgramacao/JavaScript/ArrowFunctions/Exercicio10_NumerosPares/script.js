/*
 * Exercicio 10 - Arrow functions
 * Origem: exercicio complementar
 *
 * Crie uma arrow function que receba um vetor de números inteiros e retorne outro vetor
 * com os números pares, mantendo a ordem original.
 */

const filtrarPares = numeros => {
    const pares = []

    for (let i = 0; i < numeros.length; i++) {
        if (numeros[i] % 2 === 0) {
            pares.push(numeros[i])
        }
    }

    return pares
}

console.log(filtrarPares([1, 2, 3, 4, 5, 6]))
