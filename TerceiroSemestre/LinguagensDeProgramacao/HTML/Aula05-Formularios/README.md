# Aula 05 — Formulários HTML

Referências: “5- Formulário HTML.pptx” e “5- Formulário HTML Exercicios (1).docx”.

## Atividades

A atividade 1 resolve o problema **Cursos e Inscrição** da lista. As atividades 2 a 10 são complementares dos temas dos slides. Cada arquivo começa com seu enunciado.

| Exercício | Tema | Origem |
|---|---|---|
| [01](01-CursosEInscricao/README.md) | Cursos e inscrição | Lista do professor |
| [02](Exercicio02.html) | Formulário de contato | Complementar |
| [03](Exercicio03.html) | Pesquisa por GET | Complementar |
| [04](Exercicio04.html) | Seleção de interesses | Complementar |
| [05](Exercicio05.html) | Escolha única de turno | Complementar |
| [06](Exercicio06.html) | Menu de cursos | Complementar |
| [07](Exercicio07.html) | Campos numéricos e faixa | Complementar |
| [08](Exercicio08.html) | Agendamento | Complementar |
| [09](Exercicio09.html) | Validação nativa | Complementar |
| [10](Exercicio10.html) | Botões e campos desabilitados | Complementar |

## Por onde começar

Acesse [01 — Cursos e inscrição](01-CursosEInscricao/README.md) para consultar
o objetivo, os arquivos e as instruções de execução da atividade do professor.
As atividades 02 a 10 ficam nesta pasta e praticam separadamente os controles
de formulário. `demonstracao.js` simula o envio dessas práticas sem gravar dados;
`estilo.css` organiza sua apresentação.

Para executar, baixe ou clone o repositório e abra o HTML no navegador.
No GitHub, os links para arquivos HTML exibem o código-fonte.
Para a atividade com API, siga as instruções específicas da pasta 01.

## Conceitos e limites

`id` identifica o elemento na página, `for` associa o label, e `name` identifica os dados. Radios com o mesmo name permitem uma escolha no grupo; checkboxes são independentes. Um campo disabled não participa do envio HTML nativo; readonly não é a mesma coisa.

GET coloca os dados na querystring. POST coloca os dados no corpo, mas não fornece criptografia por si só. Não existe um limite universal de 3.000 caracteres para URLs, nem tamanho ilimitado garantido para POST: navegadores, servidores e serviços impõem seus limites.

A validação do navegador melhora a interação, mas não substitui validação no servidor. O MockAPI é usado como serviço de demonstração. Use apenas dados fictícios, especialmente nos campos pessoais do aluno e dos responsáveis. A atividade não implementa autenticação, regras de acesso nem proteção de dados de um sistema escolar real.

[Documentação do MockAPI](https://github.com/mockapi-io/docs/wiki/Quick-start-guide) · [Referência de formulários HTML](https://html.spec.whatwg.org/multipage/forms.html)

[Voltar a HTML](../README.md)
