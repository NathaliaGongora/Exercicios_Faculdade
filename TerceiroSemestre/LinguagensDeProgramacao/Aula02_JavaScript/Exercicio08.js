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
