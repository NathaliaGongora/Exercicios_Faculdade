// Crie um menu com quatro links. Intercepte o clique com preventDefault, busque o HTML com fetch e response.text e apresente o conteúdo na div da página, sem navegação completa. Trate falha HTTP e restaure o estado de carregamento.
const links = document.querySelectorAll('nav a');
const conteudo = document.querySelector('.conteudo');
const mensagem = document.querySelector('#mensagem');
let carregando = false;

links.forEach(function (link) {
    link.addEventListener('click', function (event) {
        event.preventDefault();
        if (carregando) return;
        carregando = true;
        conteudo.setAttribute('aria-busy', 'true');
        conteudo.textContent = '';
        mensagem.textContent = 'Carregando...';
        return fetch(link.getAttribute('href'))
            .then(function (response) {
                if (!response.ok) throw new Error('Erro HTTP ' + response.status);
                return response.text();
            })
            .then(function (data) {
                // Fragmentos HTML locais, escritos para este exercício.
                conteudo.innerHTML = data;
                mensagem.textContent = 'Conteúdo carregado.';
            })
            .catch(function () {
                mensagem.textContent = 'Não foi possível carregar o conteúdo.';
            })
            .finally(function () {
                carregando = false;
                conteudo.setAttribute('aria-busy', 'false');
            });
    });
});

conteudo.addEventListener('submit', function (event) {
    event.preventDefault();
    mensagem.textContent = 'Formulário de demonstração: nenhum dado foi enviado.';
});
