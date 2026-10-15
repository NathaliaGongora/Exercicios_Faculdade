// Conte os caracteres de um campo no evento input, incluindo textos colados.
document.getElementById("texto").addEventListener("input", function () {
    document.getElementById("resultado").textContent = "Caracteres: " + this.value.length;
});
