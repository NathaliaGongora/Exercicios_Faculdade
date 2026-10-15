// Exercício 09 — Sistema De Abas
// Origem: Lista 02 do professor
// Enunciado:
// Crie uma página com 3 abas no topo (ex.: "HTML", "CSS", "JavaScript") e uma área de conteúdo abaixo. Ao clicar em uma aba:
// O conteúdo correspondente deve ser exibido
// As outras abas devem ser ocultadas
// A aba ativa deve receber um destaque visual (ex.: fundo diferente)
// Os conteúdos podem ser textos simples explicando cada tecnologia.
// Dica para o aluno: use data-* attributes (ex.: data-aba="html") para associar cada botão ao seu conteúdo.
const botoes = document.querySelectorAll("[data-aba]");
const paineis = document.querySelectorAll(".painel");
for (const botao of botoes) {
    botao.addEventListener("click", function () {
        for (const painel of paineis) {
            painel.hidden = painel.id !== botao.dataset.aba;
        }
        for (const outroBotao of botoes) {
            const ativo = outroBotao === botao;
            outroBotao.classList.toggle("ativa", ativo);
            outroBotao.setAttribute("aria-pressed", ativo);
        }
    });
}
