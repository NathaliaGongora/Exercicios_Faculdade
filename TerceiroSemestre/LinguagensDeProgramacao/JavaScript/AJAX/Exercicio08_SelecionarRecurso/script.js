// Exercício 08 — SelecionarRecurso
// Origem: Prática complementar aos slides
// Escolha um dos dois cursos e busque seu arquivo JSON correspondente. Mostre nome e conteúdo sem recarregar a página.
document.querySelector('#carregar').addEventListener('click', async function () {
    const botao = document.querySelector('#carregar');
    if (botao.disabled) return;
    botao.disabled = true;
    document.querySelector('.carregar').style.visibility = 'visible';
    document.querySelector('#mensagem').textContent = '';
    document.querySelector('#resultado').textContent = '';
    try {
        const curso = document.querySelector('#curso').value;
        const arquivo = curso === 'html' ? 'html.json' : 'css.json';
        const resposta = await fetch(arquivo);
        if (!resposta.ok) throw new Error('Erro HTTP ' + resposta.status);
        const dados = await resposta.json();
        document.querySelector('#resultado').textContent = dados.nome + ': ' + dados.conteudo;
    } catch (erro) {
        document.querySelector('#mensagem').textContent = erro.message;
    } finally {
        botao.disabled = false;
        document.querySelector('.carregar').style.visibility = 'hidden';
    }
});
