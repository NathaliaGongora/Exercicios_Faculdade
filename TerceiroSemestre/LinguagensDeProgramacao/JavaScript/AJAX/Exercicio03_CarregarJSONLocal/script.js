// Exercício 03 — CarregarJSONLocal
// Origem: Prática complementar aos slides
// Leia um objeto JSON local com fetch e apresente seus campos na página após o clique.
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
        document.querySelector('#resultado').textContent = dados.nome + ' — ' + dados.curso;
    } catch (erro) {
        document.querySelector('#mensagem').textContent = erro.message;
    } finally {
        botao.disabled = false;
        document.querySelector('.carregar').style.visibility = 'hidden';
    }
});
