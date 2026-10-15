# Cursos e inscrição

A atividade utiliza os arquivos desenvolvidos em aula: `index.html` e
`inscricao.html`. Foram preservados o catálogo, os campos, os nomes usados
no formulário e a estrutura com tabelas e fieldsets. Os nomes dos arquivos
ficaram em minúsculas para corresponder aos links também no GitHub.

1. Abra [index.html](index.html) e escolha “Inscrever-se”.
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

## Arquivos

| Arquivo | Função |
|---|---|
| [index.html](index.html) | Catálogo e ponto de entrada da atividade |
| [inscricao.html](inscricao.html) | Formulário de inscrição |
| [inscricao.js](inscricao.js) | Preenchimento do curso e envio à API |

[Voltar à aula 05](../README.md)
