# Exercício 02 — ConsultaComPromise

**Origem:** prática complementar baseada nos exemplos do professor.

## Enunciado

Crie uma consulta de CEP com Promise e then. Retorne a promessa e encadeie o preenchimento da página com `.then()`. Preserve a validação, as mensagens e o carregamento.

## Executar

Abra esta pasta com um servidor local, como o Live Server do VS Code, e acesse [index.html](index.html) pelo endereço do servidor. No GitHub, o link mostra o código-fonte. Os exercícios com arquivos JSON locais precisam de HTTP; abrir por `file://` pode bloquear o fetch.

Nesta prática: a consulta e o preenchimento usam `.then()`, `.catch()` e `.finally()`, mantendo a estrutura do código enviado. Requer internet.

[Voltar a AJAX](../README.md)

O HTML preserva os dois formulários e fieldsets enviados. A consulta usa o evento `submit` do formulário para funcionar também com Enter; o script fica dentro de `body`.
