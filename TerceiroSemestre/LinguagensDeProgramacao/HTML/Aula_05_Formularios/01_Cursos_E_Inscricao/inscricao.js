// Apoio ao exercício 01: identificar o curso e enviar o formulário.
const cursos = [
    { codigo: "1", nome: "Desenho e pintura", valor: 150 },
    { codigo: "2", nome: "Música", valor: 180 },
    { codigo: "3", nome: "Teatro", valor: 200 }
];
const formulario = document.getElementById("inscricao");
const nomeCurso = document.getElementById("nomeCurso");
const valorCurso = document.getElementById("valorCurso");
const codigoCurso = document.getElementById("codigoCurso");
const mensagem = document.getElementById("mensagem");
const salvar = document.getElementById("salvar");
const codigoNaURL = new URLSearchParams(window.location.search).get("codigo");

function preencherCurso(curso) {
    nomeCurso.value = curso ? curso.nome : "";
    valorCurso.value = curso ? curso.valor : "";
    codigoCurso.value = curso ? curso.codigo : "";
}
preencherCurso(cursos.find(function (curso) { return curso.codigo === codigoNaURL; }));
if (codigoNaURL && !codigoCurso.value) {
    mensagem.textContent = "Código de curso inválido. Escolha um curso abaixo ou volte ao catálogo.";
}
nomeCurso.addEventListener("change", function () {
    preencherCurso(cursos.find(function (curso) { return curso.nome === nomeCurso.value; }));
    mensagem.textContent = "";
});
formulario.addEventListener("reset", function () {
    setTimeout(function () {
        preencherCurso(cursos.find(function (curso) { return curso.codigo === codigoNaURL; }));
        mensagem.textContent = "";
    }, 0);
});
formulario.addEventListener("submit", async function (evento) {
    evento.preventDefault();
    // required não rejeita um nome composto apenas de espaços.
    for (const campo of formulario.querySelectorAll("[required]")) {
        if (!campo.value.trim()) {
            mensagem.textContent = "Preencha todos os campos obrigatórios.";
            campo.focus();
            return;
        }
    }
    if (!formulario.reportValidity() || !codigoCurso.value) return;
    const dados = Object.fromEntries(new FormData(formulario));
    dados.valorCurso = Number(dados.valorCurso);
    dados.parcelas = Number(dados.parcelas);
    salvar.disabled = true;
    mensagem.textContent = "Salvando inscrição...";
    try {
        const resposta = await fetch(formulario.action, {
            method: "POST",
            headers: { "Content-Type": "application/json" },
            body: JSON.stringify(dados)
        });
        if (!resposta.ok) throw new Error("Falha ao salvar");
        mensagem.textContent = "Inscrição salva com sucesso!";
    } catch (erro) {
        mensagem.textContent = "Não foi possível salvar. Confira a conexão e o endereço do MockAPI antes de tentar novamente.";
    } finally {
        salvar.disabled = false;
    }
});
