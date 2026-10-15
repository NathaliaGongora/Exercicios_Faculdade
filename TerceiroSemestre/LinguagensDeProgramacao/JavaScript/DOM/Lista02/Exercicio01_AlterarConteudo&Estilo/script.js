// Exercício 01 — Alterar Conteudo e Estilo
// Origem: Lista 02 do professor
// Enunciado:
// Crie uma página HTML com um <h1> contendo o texto "Programação Web" e um botão "Alterar". Ao clicar no botão, o texto do <h1> deve mudar para "DOM Manipulado!" e a cor do texto deve ficar azul. Se clicar novamente, deve voltar ao texto e cor originais.
const titulo = document.getElementById("titulo");
const textoOriginal = titulo.textContent;
const corOriginal = titulo.style.color;
let alterado = false;

document.getElementById("alterar").addEventListener("click", function () {
    alterado = !alterado;
    titulo.textContent = alterado ? "DOM Manipulado!" : textoOriginal;
    titulo.style.color = alterado ? "blue" : corOriginal;
});
