// Crie uma página HTML que conte o número de palavras em uma frase ou parágrafo inserido pelo usuário. Exiba o resultado na página.
document.getElementById("contar").addEventListener("click", function () {
    const texto = document.getElementById("frase").value.trim();
    const quantidade = texto === "" ? 0 : texto.split(/\s+/).length;
    document.getElementById("resultado").textContent = "Palavras: " + quantidade;
});
