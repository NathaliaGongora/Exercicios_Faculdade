// Com o auxílio do Flexbox, faça uma tela de login centralizada na página, conforme a imagem da lista.
document.querySelector("form").addEventListener("submit", function (evento) {
    evento.preventDefault();
    document.getElementById("mensagem").textContent = "Demonstração de layout: não há autenticação.";
});
