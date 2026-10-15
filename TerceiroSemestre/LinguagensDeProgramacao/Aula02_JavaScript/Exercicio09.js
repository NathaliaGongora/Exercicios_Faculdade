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
