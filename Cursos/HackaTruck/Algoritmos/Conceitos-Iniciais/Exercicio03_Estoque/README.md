# Exercício 03 — Controle de estoque

## Enunciado

Sistema de estoque de uma loja
Imagine que você foi contratada para desenvolver a primeira versão de um sistema de controle de estoque.

O sistema precisa armazenar informações de um produto e permitir que elas sejam atualizadas.

Parte 1 — Cadastro inicial
Crie as seguintes informações:
Informação	Valor inicial	Declaração
codigoProduto	|"PROD001"    |Constante
nomeProduto	  |"Teclado"    |Variável
preco	        | 89.90	      |Variável
quantidade	  |15	          |Variável
disponivel	  |true	        |Variável
categoria	    |"Periféricos"|Constante

Exiba todas essas informações no terminal.

Parte 2 — Atualização

Imagine que o cadastro estava desatualizado. Você descobriu que:
- O nome correto é "Teclado Mecânico".
- O preço passou a ser 149.90.
- A quantidade disponível é 8.
- O produto está indisponível (false).
Atualize os valores sem declarar novas variáveis.

Parte 3 — Exibição final

Mostre novamente as informações do produto após as atualizações.

Exemplo do resultado esperado após a atualização:
=== PRODUTO ATUALIZADO ===
Código: PROD001
Produto: Teclado Mecânico
Categoria: Periféricos
Preço: 149.9
Quantidade: 8
Disponível: false

## Executar

Com Swift instalado, abra esta pasta e execute:

```bash
swift Exercicio03.swift
```

Também é possível executar o código no SwiftFiddle.

[Código](Exercicio03.swift) · [Voltar ao conteúdo](../README.md)
