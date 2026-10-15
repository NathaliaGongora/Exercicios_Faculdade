/*
 * Exercicio 05 - Lista 01 de JavaScript
 *
 * Escreva um programa que imprima os números de 1 a 10 no console usando um loop. Os
 * número devem ser separados com um traço, ex.: 1 – 2 – 3 - ... – 10. Observação: após
 * o número 10 não pode ter um traço.
 */

let resultado = ""

for (let numero = 1; numero <= 10; numero++) {
    if (numero > 1) {
        resultado += " - "
    }
    resultado += numero
}

console.log(resultado)
