# Exercício 06 — TratarErroHTTP

**Origem:** Prática complementar aos slides.

## Enunciado

Tente buscar um arquivo que não existe no servidor local. Verifique response.ok e mostre o status HTTP sem deixar o carregamento ativo.

## Executar

Abra esta pasta com um servidor local, como o Live Server do VS Code, e acesse [index.html](index.html) pelo endereço do servidor. No GitHub, o link mostra o código-fonte. Os exercícios com arquivos JSON locais precisam de HTTP; abrir por `file://` pode bloquear o fetch.

Este exercício provoca uma falha de propósito. Um servidor local comum retorna 404 para o arquivo ausente. O status real aparece na mensagem.

[Voltar a AJAX](../README.md)
