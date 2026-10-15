/*
 * Exercicio 09 - Lista 01 de JavaScript
 *
 * Escreva uma função que recebe um endereço de e-mail como argumento e retorna true se
 * o e-mail for válido ou false caso contrário. Um e-mail válido deve conter um único
 * símbolo '@' e pelo menos um ponto '.' após o '@'.
 */

function validarEmail(email) {
    let quantidadeArrobas = 0
    let posicaoArroba = -1

    for (let i = 0; i < email.length; i++) {
        if (email[i] === "@") {
            quantidadeArrobas++
            posicaoArroba = i
        }
    }

    const posicaoPonto = email.indexOf(".", posicaoArroba + 1)
    return quantidadeArrobas === 1 && posicaoPonto > posicaoArroba
}

console.log(validarEmail("aluno@facens.br"))
console.log(validarEmail("aluno@@facens.br"))
