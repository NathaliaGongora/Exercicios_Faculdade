// Exercício 08 — Galeria De Imagens
// Origem: Lista 02 do professor
// Enunciado:
// Crie uma página com uma imagem principal (pode usar uma URL de placeholder, como https://picsum.photos/200) e 3 botões com nomes de imagens diferentes. Cada botão deve:
// Alterar o atributo src da imagem usando setAttribute
// Alterar também o atributo width para um valor diferente
// Dica para o aluno: crie uma função trocarImagem(caminho, largura) e chame-a nos botões.
function trocarImagem(caminho, largura, descricao) {
    const imagem = document.getElementById("principal");
    imagem.setAttribute("src", caminho);
    imagem.setAttribute("width", largura);
    imagem.setAttribute("alt", descricao);
}
for (const botao of document.querySelectorAll("[data-imagem]")) {
    botao.addEventListener("click", function () {
        trocarImagem(botao.dataset.imagem, botao.dataset.largura, botao.dataset.descricao);
    });
}
