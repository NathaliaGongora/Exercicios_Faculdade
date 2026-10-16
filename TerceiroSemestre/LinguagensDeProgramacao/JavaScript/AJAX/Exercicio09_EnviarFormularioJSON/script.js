// Exercício 09 — EnviarFormularioJSON
// Origem: Prática complementar aos slides
// Leia nome e e-mail de um formulário com FormData. Envie POST em JSON usando method, headers e body. Verifique o resultado HTTP e mostre o id devolvido pela API. Trate falhas e restaure os controles.
document.querySelector('#formulario').addEventListener('submit', salvar);
async function salvar(event) {
    event.preventDefault();
    const botao = document.querySelector('#salvar');
    if (botao.disabled) return;
    const formulario = document.querySelector('#formulario');
    const mensagem = document.querySelector('#mensagem');
    if (!formulario.reportValidity()) return;
    const nome = document.querySelector('#nome').value.trim();
    if (!nome) { mensagem.textContent = 'Digite um nome.'; return; }
    if (!endpoint) { mensagem.textContent = 'Configure o endpoint em configuracao.js.'; return; }
    const formDados = new FormData(formulario);
    const dados = {};
    formDados.forEach(function (valor, chave) { dados[chave] = valor.trim(); });
    botao.disabled = true;
    document.querySelector('.carregar').style.visibility = 'visible';
    mensagem.textContent = 'Salvando...';
    try {
        const resultado = await enviar(dados);
        mensagem.textContent = 'Salvo com sucesso! Id: ' + resultado.id;
    } catch (erro) {
        mensagem.textContent = erro.message;
    } finally {
        botao.disabled = false;
        document.querySelector('.carregar').style.visibility = 'hidden';
    }
}
async function enviar(dados) {
    const resposta = await fetch(endpoint, {
        method: 'POST',
        headers: { 'Content-Type': 'application/json' },
        body: JSON.stringify(dados)
    });
    if (!resposta.ok) throw new Error('Erro HTTP ' + resposta.status + ' ao salvar.');
    return resposta.json();
}
