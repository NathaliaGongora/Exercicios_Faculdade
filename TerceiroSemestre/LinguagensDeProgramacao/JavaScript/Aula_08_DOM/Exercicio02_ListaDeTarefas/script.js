// Crie uma página HTML com um campo de entrada de texto, um botão "Adicionar" e uma lista de tarefas. Quando o usuário digita uma tarefa no campo de entrada e clica no botão, a tarefa deve ser adicionada à lista. Use createElement e appendChild.
document.getElementById("adicionar").addEventListener("click", function () {
    const campo = document.getElementById("tarefa");
    const texto = campo.value.trim();
    if (!texto) { document.getElementById("mensagem").textContent = "Digite uma tarefa."; return; }
    const item = document.createElement("li");
    item.textContent = texto;
    document.getElementById("tarefas").appendChild(item);
    campo.value = "";
    campo.focus();
    document.getElementById("mensagem").textContent = "Tarefa adicionada.";
});
