// Exercício 04 — Tarefas Com Remocao
// Origem: Lista 02 do professor
// Enunciado:
// Expanda o exercício 2 da lista anterior: além de adicionar tarefas à lista, cada item deve ter um botão "X" ao lado para removê-lo. Ao remover, o item sai da lista.
// Conceitos praticados:
// document.createElement('li')
// appendChild
// addEventListener em elementos criados dinamicamente
// element.remove() ou removeChild
// input.value para leitura
// Dica para o aluno: crie o botão "X" junto com o <li> e associe o evento antes de inserir na lista.
document.getElementById("adicionar").addEventListener("click", function () {
    const campo = document.getElementById("tarefa");
    const texto = campo.value.trim();
    const mensagem = document.getElementById("mensagem");
    if (texto === "") {
        mensagem.textContent = "Digite uma tarefa.";
        return;
    }
    const item = document.createElement("li");
    const descricao = document.createElement("span");
    descricao.textContent = texto;
    const remover = document.createElement("button");
    remover.type = "button";
    remover.textContent = "X";
    remover.setAttribute("aria-label", "Remover tarefa: " + texto);
    remover.addEventListener("click", function () {
        item.remove();
        mensagem.textContent = "Tarefa removida.";
        campo.focus();
    });
    item.appendChild(descricao);
    item.appendChild(remover);
    document.getElementById("tarefas").appendChild(item);
    campo.value = "";
    campo.focus();
    mensagem.textContent = "Tarefa adicionada.";
});
