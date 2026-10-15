/*
 * Exercicio 04 - Lista 01 de JavaScript
 *
 * Faça um programa que recebe o nome de uma variável e mostre o <<primeiro>>.<<último
 * nome>>@facens.br
 *
 * Por exemplo:
 *
 * A variável nome possui o conteúdo “Edson Martin Feitosa”.
 *
 * Deve mostrar edson.feitosa@facens.br
 */

const nome = "Edson Martin Feitosa"
const partes = nome.trim().split(" ")
const primeiroNome = partes[0].toLowerCase()
const ultimoNome = partes[partes.length - 1].toLowerCase()

console.log(`${primeiroNome}.${ultimoNome}@facens.br`)
