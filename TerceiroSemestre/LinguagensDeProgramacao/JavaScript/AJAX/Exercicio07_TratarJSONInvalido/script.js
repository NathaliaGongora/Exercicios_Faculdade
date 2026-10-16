// Exercício 07 — TratarJSONInvalido
// Origem: Prática complementar aos slides
// Busque um arquivo cujo conteúdo não é JSON válido. Capture a falha de resposta.json e recupere os controles da página.
document.querySelector('#carregar').addEventListener('click', async function () {
    const botao = document.querySelector('#carregar');
    if (botao.disabled) return;
    botao.disabled = true;
    document.querySelector('.carregar').style.visibility = 'visible';
    document.querySelector('#mensagem').textContent = '';
    document.querySelector('#resultado').textContent = '';
    try {
        const resposta = await fetch('dados.json');
        if (!resposta.ok) throw new Error('Erro HTTP ' + resposta.status);
        const dados = await resposta.json();
        document.querySelector('#resultado').textContent = JSON.stringify(dados);
    } catch (erro) {
        document.querySelector('#mensagem').textContent = erro.message;
    } finally {
        botao.disabled = false;
        document.querySelector('.carregar').style.visibility = 'hidden';
    }
});
