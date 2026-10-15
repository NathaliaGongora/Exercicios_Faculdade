// Exercício 06 — Validacao De Senha
// Origem: Lista 02 do professor
// Enunciado:
// Crie um campo de senha (type="password") que, enquanto o usuário digita, mostre uma mensagem abaixo indicando se a senha atende aos requisitos:
// Mínimo 8 caracteres
// Pelo menos 1 número
// A mensagem deve ficar vermelha quando houver erro e verde quando estiver tudo certo. Use o evento input (ou oninput).
const campo = document.getElementById("senha");
const mensagem = document.getElementById("mensagem");
campo.addEventListener("input", function () {
    const valida = campo.value.length >= 8 && /[0-9]/.test(campo.value);
    mensagem.textContent = valida ? "Senha atende aos requisitos." : "Use pelo menos 8 caracteres e 1 número.";
    mensagem.className = valida ? "sucesso" : "erro";
});
