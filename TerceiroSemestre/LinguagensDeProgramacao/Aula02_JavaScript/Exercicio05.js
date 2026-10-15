let resultado = ""

for (let numero = 1; numero <= 10; numero++) {
    if (numero > 1) {
        resultado += " - "
    }
    resultado += numero
}

console.log(resultado)
