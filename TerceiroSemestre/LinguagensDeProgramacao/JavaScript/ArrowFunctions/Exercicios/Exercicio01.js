/*
 * Exercicio 01 - Arrow functions
 * Origem: lista do professor
 *
 * Os triângulos podem ser classificados em 3 tipos quanto ao tamanho de seus lados:
 * Equilátero: Os três lados são iguais. Isósceles: Dois lados iguais. Escaleno: Todos
 * os lados são diferentes. Crie uma função que recebe os comprimentos dos três lados de
 * um triângulo e retorne sua classificação quanto ao tamanho de seus lados.
 */

const classificarTriangulo = (lado1, lado2, lado3) => {
    if (lado1 <= 0 || lado2 <= 0 || lado3 <= 0 ||
        lado1 + lado2 <= lado3 || lado1 + lado3 <= lado2 ||
        lado2 + lado3 <= lado1) {
        return "Triangulo invalido"
    }

    if (lado1 === lado2 && lado2 === lado3) {
        return "Equilatero"
    } else if (lado1 === lado2 || lado1 === lado3 || lado2 === lado3) {
        return "Isosceles"
    } else {
        return "Escaleno"
    }
}

console.log(classificarTriangulo(3, 3, 3))
console.log(classificarTriangulo(3, 3, 2))
console.log(classificarTriangulo(3, 4, 5))
console.log(classificarTriangulo(1, 2, 3))
