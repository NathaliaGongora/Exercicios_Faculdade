// Exercício 03 — Contador Completo
// Origem: Lista 02 do professor
// Enunciado:
// Crie uma página com um número exibido em um <span> (iniciando em 0) e três botões:
// +1 → incrementa o contador
// -1 → decrementa o contador (não pode ficar negativo)
// Zerar → volta para 0
// O valor deve ser atualizado na tela a cada clique.
let contador = 0;
const saida = document.getElementById("contador");

document.getElementById("incrementar").addEventListener("click", function () {
    contador++;
    saida.textContent = contador;
});
document.getElementById("decrementar").addEventListener("click", function () {
    if (contador > 0) contador--;
    saida.textContent = contador;
});
document.getElementById("zerar").addEventListener("click", function () {
    contador = 0;
    saida.textContent = contador;
});
