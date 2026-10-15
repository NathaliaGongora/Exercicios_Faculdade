// Exercício 07 — Filtro De Nomes
// Origem: Lista 02 do professor
// Enunciado:
// Crie uma lista com 10 nomes (ex.: Ana, Bruno, Carla, Daniel, Eduarda, Felipe, Gabriela, Henrique, Isabela, João) e um campo de busca acima. Conforme o usuário digita, apenas os nomes que contêm o texto digitado devem permanecer visíveis; os demais devem ser ocultados.
// Dica para o aluno: percorra a lista com for ou forEach e compare o texto de cada <li> com o valor digitado.
const busca = document.getElementById("busca");
const nomes = document.querySelectorAll("#nomes li");
busca.addEventListener("input", function () {
    const filtro = busca.value.trim().toLocaleLowerCase("pt-BR");
    for (const nome of nomes) {
        nome.hidden = !nome.textContent.toLocaleLowerCase("pt-BR").includes(filtro);
    }
});
