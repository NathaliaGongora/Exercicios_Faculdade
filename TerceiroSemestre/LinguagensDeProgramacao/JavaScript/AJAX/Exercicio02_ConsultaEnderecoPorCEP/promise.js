// Exercício 02 — Consulta com Promise
// Consultar o ViaCEP com fetch e .then(), preencher o endereço e tratar falhas.
document.querySelector('#formulario').addEventListener('submit', pesquisar);

function pesquisar(event) {
    event.preventDefault();
    const botao = document.querySelector('#pesquisar');
    if (botao.disabled) return;
    let cep = document.querySelector('#cep').value.trim();
    const mensagem = document.querySelector('#mensagem');
    for (const id of ['endereco', 'bairro', 'estado']) document.querySelector('#' + id).value = '';
    if (cep.length === 0) {
        mensagem.textContent = 'Informe o CEP.';
        return;
    }
    cep = cep.replace(/[.\-\s]/g, '');
    if (!/^[0-9]{8}$/.test(cep)) {
        mensagem.textContent = 'O CEP deve conter oito dígitos.';
        return;
    }
    const carregar = document.querySelector('.carregar');
    carregar.style.visibility = 'visible';
    botao.disabled = true;
    mensagem.textContent = '';
    return consultaCEP(cep)
        .then(function (endereco) {
            document.querySelector('#endereco').value = endereco.logradouro || '';
            document.querySelector('#bairro').value = endereco.bairro || '';
            document.querySelector('#estado').value = endereco.estado || endereco.uf || '';
            mensagem.textContent = 'Consulta concluída. Alguns CEPs não possuem logradouro ou bairro.';
        })
        .catch(function (erro) {
            mensagem.textContent = erro.message;
        })
        .finally(function () {
            carregar.style.visibility = 'hidden';
            botao.disabled = false;
        });
}

function consultaCEP(cep) {
    const url = `https://viacep.com.br/ws/${cep}/json/`;
    return fetch(url)
        .then(function (response) {
            if (!response.ok) throw new Error('Erro HTTP ' + response.status + ' ao consultar o CEP.');
            return response.json();
        })
        .then(function (dados) {
            if (dados.erro) throw new Error('CEP não encontrado.');
            return dados;
        });
}
