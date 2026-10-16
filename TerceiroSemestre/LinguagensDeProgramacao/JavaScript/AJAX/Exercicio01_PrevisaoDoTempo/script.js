// Crie uma página de consulta de previsão do tempo conforme o modelo da lista. Ao digitar o nome da cidade e clicar em “Buscar Clima”, apresente as informações retornadas por https://wttr.in/Sorocaba?format=3 para a cidade informada.
document.querySelector('#formulario').addEventListener('submit', pesquisar);

async function pesquisar(event) {
    event.preventDefault();
    const cidade = document.querySelector('#cidade').value.trim();
    const resultado = document.querySelector('#resultado');
    const botao = document.querySelector('#buscar');
    if (botao.disabled) return;
    if (!cidade) {
        resultado.textContent = 'Digite o nome da cidade.';
        return;
    }
    botao.disabled = true;
    resultado.textContent = 'Carregando...';
    try {
        const clima = await consultaClima(cidade);
        resultado.textContent = clima;
    } catch (erro) {
        resultado.textContent = 'Não foi possível consultar o clima. Verifique a cidade e tente novamente.';
    } finally {
        botao.disabled = false;
    }
}

async function consultaClima(cidade) {
    const url = `https://wttr.in/${encodeURIComponent(cidade)}?format=3`;
    const resposta = await fetch(url);
    if (!resposta.ok) throw new Error('Erro HTTP ' + resposta.status);
    const texto = (await resposta.text()).trim();
    if (!texto) throw new Error('Resposta vazia.');
    return texto;
}
