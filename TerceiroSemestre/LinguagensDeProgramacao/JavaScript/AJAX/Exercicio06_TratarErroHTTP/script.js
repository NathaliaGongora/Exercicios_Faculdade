// Exercício 06 — TratarErroHTTP
// Origem: Prática complementar aos slides
// Tente buscar um arquivo que não existe no servidor local. Verifique response.ok e mostre o status HTTP sem deixar o carregamento ativo.
document.querySelector('#carregar').addEventListener('click', async function () {
    const botao = document.querySelector('#carregar');
    if (botao.disabled) return;
    botao.disabled = true;
    document.querySelector('.carregar').style.visibility = 'visible';
    document.querySelector('#mensagem').textContent = '';
    document.querySelector('#resultado').textContent = '';
    try {
        const resposta = await fetch('arquivo_inexistente.json');
        if (!resposta.ok) throw new Error('Erro HTTP ' + resposta.status + ': recurso não encontrado.');
        document.querySelector('#resultado').textContent = await resposta.text();
    } catch (erro) {
        document.querySelector('#mensagem').textContent = erro.message;
    } finally {
        botao.disabled = false;
        document.querySelector('.carregar').style.visibility = 'hidden';
    }
});
