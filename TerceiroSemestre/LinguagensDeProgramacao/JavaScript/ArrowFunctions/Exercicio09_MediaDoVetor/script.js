/*
 * Exercicio 09 - Arrow functions
 * Origem: exercicio complementar
 *
 * Crie uma arrow function que receba um vetor de números e retorne a média dos valores.
 * Se o vetor estiver vazio, retorne a mensagem "Vetor vazio".
 */

const calcularMedia = numeros => {
    if (numeros.length === 0) {
        return "Vetor vazio"
    }

    let soma = 0
    for (let i = 0; i < numeros.length; i++) {
        soma += numeros[i]
    }

    return soma / numeros.length
}

console.log(calcularMedia([7, 8, 9]))
