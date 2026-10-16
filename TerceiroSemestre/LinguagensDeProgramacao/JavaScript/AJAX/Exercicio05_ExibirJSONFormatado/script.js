// Exercício 05 — ExibirJSONFormatado
// Origem: Prática complementar aos slides
// Carregue um objeto JSON e exiba sua representação com JSON.stringify(dados, null, 2). Use textContent para mostrar o texto recebido.
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
        document.querySelector('#resultado').textContent = JSON.stringify(dados, null, 2);
    } catch (erro) {
        document.querySelector('#mensagem').textContent = erro.message;
    } finally {
        botao.disabled = false;
        document.querySelector('.carregar').style.visibility = 'hidden';
    }
});
