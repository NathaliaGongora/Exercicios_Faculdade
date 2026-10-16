# Exercício 10 — Menu com fetch

**Origem:** prática complementar baseada no menu de opções demonstrado pelo professor.

## Enunciado

Crie um menu com quatro links. Intercepte o clique com preventDefault, busque o HTML com fetch e response.text e apresente o conteúdo na div da página, sem navegação completa. Trate falha HTTP e restaure o estado de carregamento.

## Executar

Abra a pasta em um servidor local, como o Live Server do VS Code, e acesse [index.html](index.html). Clique em Tabela, Imagem, Flexbox ou Formulário. O conteúdo é carregado em `.conteudo`. O envio do formulário é apenas demonstrativo e não grava dados.

Os quatro arquivos HTML de apoio são fragmentos de conteúdo, sem outro `head` ou `body`. Os estilos ficam na página principal e a imagem tem caminho relativo a esta pasta. Isso permite carregar o material com o padrão dos exemplos sem depender dos caminhos antigos das aulas. `innerHTML` é usado apenas para os fragmentos locais preparados para esta prática.

[Voltar a AJAX](../README.md)
