// Crie uma página HTML com um botão e uma <div>. Quando o botão é clicado, a cor de fundo da <div> deve mudar para uma cor aleatória. Use um array com cinco cores, Math.random e Math.floor.
const cores = ["#d6e5ff", "#ffd2bd", "#d6f4dc", "#fff0a8", "#e7d5fc"];
document.getElementById("trocar").addEventListener("click", function () {
    const indice = Math.floor(Math.random() * cores.length);
    document.getElementById("caixa").style.backgroundColor = cores[indice];
});
