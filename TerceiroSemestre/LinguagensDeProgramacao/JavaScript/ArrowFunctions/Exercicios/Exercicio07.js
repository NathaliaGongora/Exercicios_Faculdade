/*
 * Exercicio 07 - Arrow functions
 * Origem: exercicio complementar
 *
 * Crie uma arrow function que receba um número e retorne seu dobro se ele for maior que
 * zero. Caso contrário, retorne a mensagem "Numero invalido".
 */

const dobroPositivo = numero => {
    if (numero <= 0) {
        return "Numero invalido"
    }
    return numero * 2
}

console.log(dobroPositivo(4))
console.log(dobroPositivo(0))
