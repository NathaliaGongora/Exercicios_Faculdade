# Formulários HTML

Referências: “5- Formulário HTML.pptx” e “5- Formulário HTML Exercicios (1).docx”.

## Atividades

A atividade 1 resolve o problema **Cursos e Inscrição** da lista. As atividades 2 a 10 são complementares dos temas dos slides. Cada arquivo começa com seu enunciado.

| Exercício | Tema | Origem |
|---|---|---|
| [01](cursos.html) | Cursos e inscrição | Lista do professor |
| [02](Exercicio02.html) | Formulário de contato | Complementar |
| [03](Exercicio03.html) | Pesquisa por GET | Complementar |
| [04](Exercicio04.html) | Seleção de interesses | Complementar |
| [05](Exercicio05.html) | Escolha única de turno | Complementar |
| [06](Exercicio06.html) | Menu de cursos | Complementar |
| [07](Exercicio07.html) | Campos numéricos e faixa | Complementar |
| [08](Exercicio08.html) | Agendamento | Complementar |
| [09](Exercicio09.html) | Validação nativa | Complementar |
| [10](Exercicio10.html) | Botões e campos desabilitados | Complementar |

## Cursos e Inscrição

A atividade utiliza os arquivos desenvolvidos em aula: `cursos.html` e
`inscricao.html`. Foram preservados o catálogo, os campos, os nomes usados
no formulário e a estrutura com tabelas e fieldsets. Os nomes dos arquivos
ficaram em minúsculas para corresponder aos links também no GitHub.

1. Abra [cursos.html](cursos.html) e escolha “Inscrever-se”.
2. O link passa o código, por exemplo `inscricao.html?codigo=1`.
3. O JavaScript preenche o nome e o valor do curso. Também é possível escolher outro curso no formulário.
4. Preencha os 16 campos obrigatórios e clique em “Salvar inscrição”.
5. O envio faz POST com os dados em JSON; a confirmação aparece somente após uma resposta de sucesso.

O arquivo `inscricao.js` complementa a marcação HTML com leitura da URL,
preenchimento do curso e envio à API. O valor acompanha o catálogo e não é
editado manualmente. O botão de limpar restaura o curso indicado no link.

### MockAPI

O atributo `action` de `inscricao.html` mantém o endpoint do arquivo da aula.
Se o projeto ou recurso mudar, atualize esse endereço. Abra a atividade
com um servidor local, como o Live Server do VS Code, e utilize dados fictícios.
Confira no painel do MockAPI se o recurso está disponível e permite POST.
O funcionamento do serviço externo precisa ser conferido na sua conta;
a revisão do código não criou inscrições nesse endpoint.

Os nomes enviados são os atributos `name` dos seus campos: `nomeAluno`,
`celularAluno`, `emailAluno`, `corAluno`, os demais dados de aluno, pai e mãe,
`nomeCurso`, `dataIngresso`, `valorCurso`, `parcelas` e `codigoCurso`.
`valorCurso` e `parcelas` são números; os outros valores são textos.
Os rádios de responsabilidade financeira enviam `sim` ou `nao` quando
selecionados e não entram no envio quando nenhuma opção está marcada.

### Arquivos de apoio

- `inscricao.html`: formulário da atividade 1.
- `inscricao.js`: código do curso na URL e envio em JSON.
- `demonstracao.js`: simula o envio dos exercícios 2 a 10, sem gravar dados.
- `estilo.css`: apresentação dos exercícios complementares.

## Conceitos e limites

`id` identifica o elemento na página, `for` associa o label, e `name` identifica os dados. Radios com o mesmo name permitem uma escolha no grupo; checkboxes são independentes. Um campo disabled não participa do envio HTML nativo; readonly não é a mesma coisa.

GET coloca os dados na querystring. POST coloca os dados no corpo, mas não fornece criptografia por si só. Não existe um limite universal de 3.000 caracteres para URLs, nem tamanho ilimitado garantido para POST: navegadores, servidores e serviços impõem seus limites.

A validação do navegador melhora a interação, mas não substitui validação no servidor. O MockAPI é usado como serviço de demonstração. Use apenas dados fictícios, especialmente nos campos pessoais do aluno e dos responsáveis. A atividade não implementa autenticação, regras de acesso nem proteção de dados de um sistema escolar real.

[Documentação do MockAPI](https://github.com/mockapi-io/docs/wiki/Quick-start-guide) · [Referência de formulários HTML](https://html.spec.whatwg.org/multipage/forms.html)

[Voltar a HTML](../README.md)
