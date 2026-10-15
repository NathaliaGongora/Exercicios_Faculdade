// Selecione um parágrafo pelo id e altere seu texto ao clicar em um botão.
document.getElementById("alterar").addEventListener("click", function () {
    document.getElementById("texto").textContent = "Texto alterado pelo DOM.";
});
