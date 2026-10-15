function inverterString(texto) {
    let invertida = ""

    for (let i = texto.length - 1; i >= 0; i--) {
        invertida += texto[i]
    }

    return invertida
}

console.log(inverterString("javascript"))
