# AJAX e Fetch

Referências: slides “9 - AJAX.pptx”, exemplos de CEP apresentados pelo professor e lista “10 - AJAX Previsao do Tempo-1.docx”.

A atividade 01 resolve a consulta de clima solicitada na lista. As atividades 02 a 10 são complementares, baseadas nos conceitos dos exemplos: requisições GET, texto e JSON, Promise, async/await e envio POST com FormData. Os arquivos originais de demonstração do professor não foram publicados como trabalhos da aluna.

| Nº | Atividade | Origem |
|---|---|---|
| 01 | [PrevisaoDoTempo](Exercicio01_PrevisaoDoTempo/README.md) | Lista do professor |
| 02 | [ConsultaEnderecoPorCEP](Exercicio02_ConsultaEnderecoPorCEP/README.md) | Prática complementar |
| 03 | [CarregarJSONLocal](Exercicio03_CarregarJSONLocal/README.md) | Prática complementar |
| 04 | [ListarCursos](Exercicio04_ListarCursos/README.md) | Prática complementar |
| 05 | [ExibirJSONFormatado](Exercicio05_ExibirJSONFormatado/README.md) | Prática complementar |
| 06 | [TratarErroHTTP](Exercicio06_TratarErroHTTP/README.md) | Prática complementar |
| 07 | [TratarJSONInvalido](Exercicio07_TratarJSONInvalido/README.md) | Prática complementar |
| 08 | [SelecionarRecurso](Exercicio08_SelecionarRecurso/README.md) | Prática complementar |
| 09 | [EnviarFormularioJSON](Exercicio09_EnviarFormularioJSON/README.md) | Prática complementar |
| 10 | [MenuComFetch](Exercicio10_MenuComFetch/README.md) | Prática complementar |

## Executar

Use um servidor local, como o Live Server do VS Code. As consultas ao wttr.in e ao ViaCEP precisam de internet; os exemplos 03 a 08 buscam arquivos do próprio exercício. O envio ao MockAPI depende de configurar o endpoint na atividade 09. Não há dependências de frameworks.

## Conceitos

- `event.preventDefault()` impede o envio tradicional do formulário.
- `fetch()` retorna uma Promise. `await` aguarda sua conclusão dentro de uma função `async`.
- `resposta.json()` também é assíncrono.
- Um status HTTP de erro precisa ser verificado com `resposta.ok`; `.catch()` não substitui essa verificação.
- `finally` restaura a interface tanto no sucesso quanto no erro.
- AJAX não exige XML: os exemplos desta aula usam JSON.

O ViaCEP recebe CEP com oito dígitos, informa CEP inexistente com a propriedade `erro`, e pode devolver endereço ou bairro vazios. O campo `estado` foi mantido conforme o código enviado; `uf` serve como alternativa quando necessário. [Documentação do ViaCEP](https://viacep.com.br/).

Os exemplos foram verificados com respostas simuladas; a disponibilidade das APIs externas depende dos serviços. Não foram criados clientes no MockAPI durante os testes.

[Voltar a JavaScript](../README.md)
