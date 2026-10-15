// Adicione ou remova uma classe de destaque com classList.toggle.
document.getElementById("destacar").addEventListener("click", function () {
    const ativo = document.getElementById("texto").classList.toggle("destaque");
    this.setAttribute("aria-pressed", ativo);
});
