// Troque a imagem de uma lâmpada entre acesa e apagada ao clicar nos botões. Atualize também o texto alternativo.
function trocarImagem(estado) {
    const imagem = document.getElementById("lampada");
    imagem.setAttribute("src", "lampada_" + estado + ".jpg");
    imagem.setAttribute("alt", "Lâmpada " + estado);
}
document.getElementById("acender").addEventListener("click", function () { trocarImagem("acesa"); });
document.getElementById("apagar").addEventListener("click", function () { trocarImagem("apagada"); });
