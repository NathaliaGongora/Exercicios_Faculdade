const nome = "Edson Martin Feitosa"
const partes = nome.trim().split(" ")
const primeiroNome = partes[0].toLowerCase()
const ultimoNome = partes[partes.length - 1].toLowerCase()

console.log(`${primeiroNome}.${ultimoNome}@facens.br`)
