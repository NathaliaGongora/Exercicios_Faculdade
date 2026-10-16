// Exercício 04 — ListarCursos
// Origem: Prática complementar aos slides
// Leia um array de cursos em JSON e crie itens de uma lista usando createElement e textContent. Limpe a lista antes de cada carregamento.
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
        for (const curso of dados) {
            const item = document.createElement('li');
            item.textContent = curso.nome + ' — ' + curso.duracao + ' horas';
            document.querySelector('#resultado').appendChild(item);
        }
    } catch (erro) {
        document.querySelector('#mensagem').textContent = erro.message;
    } finally {
        botao.disabled = false;
        document.querySelector('.carregar').style.visibility = 'hidden';
    }
});
