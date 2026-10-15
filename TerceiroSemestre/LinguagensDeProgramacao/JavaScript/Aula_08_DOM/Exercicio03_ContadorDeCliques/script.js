// Crie uma página HTML com um botão e um contador. Quando o botão é clicado, o contador deve ser incrementado em 1 e o valor atualizado na página.
let contador = 0;
document.getElementById("contar").addEventListener("click", function () {
    contador++;
    document.getElementById("contador").textContent = contador;
});
