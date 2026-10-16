# Exercício 09 — EnviarFormularioJSON

**Origem:** Prática complementar aos slides.

## Enunciado

Leia nome e e-mail de um formulário com FormData. Envie POST em JSON usando method, headers e body. Verifique o resultado HTTP e mostre o id devolvido pela API. Trate falhas e restaure os controles.

## Executar

Abra esta pasta com um servidor local, como o Live Server do VS Code, e acesse [index.html](index.html) pelo endereço do servidor. No GitHub, o link mostra o código-fonte. Os exercícios com arquivos JSON locais precisam de HTTP; abrir por `file://` pode bloquear o fetch.

Configure seu próprio recurso no MockAPI com os campos `nome` e `email`. Use apenas dados fictícios. O endpoint está vazio; nenhuma requisição é enviada até configurá-lo. O exemplo 10 troca o envio de async/await por `.then()`, mantendo o formulário assíncrono.

[Voltar a AJAX](../README.md)
