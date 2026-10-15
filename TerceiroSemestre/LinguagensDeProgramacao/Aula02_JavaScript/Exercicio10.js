function ehPalindromo(texto) {
    let invertida = ""

    for (let i = texto.length - 1; i >= 0; i--) {
        invertida += texto[i]
    }

    return texto === invertida
}

console.log(ehPalindromo("arara"))
console.log(ehPalindromo("javascript"))
