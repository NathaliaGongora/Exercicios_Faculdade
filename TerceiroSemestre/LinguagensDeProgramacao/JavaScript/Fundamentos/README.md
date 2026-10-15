# Aula 02 — JavaScript

Professor: Edson Martin Feitosa. Referências: slides “1- 02 JavaScript (1).pptx” e “1- 03 JavaScript Exercicios.docx”, Lista 01.

## Conteúdo

Declaração de variáveis, tipos, operações numéricas, strings, template strings, valores booleanos e funções. A lista também pede condições e laços de repetição.

## Executar

Abra a pasta Fundamentos no VS Code e use o terminal, com o Node.js instalado:

```bash
node "Exercicio01_QuatroOperacoes/script.js"
```

Troque o nome do arquivo para executar outro exercício. Cada arquivo funciona sozinho, com valores de exemplo no código e saída no console. Não precisa instalar bibliotecas nem criar uma página HTML para esta lista.

## Lista 01 — Dez exercícios

### Exercício 01

Escreva um programa que declare duas variáveis numéricas e realize as quatro operações matemáticas básicas (+, -, *, /). Imprima os resultados no console.

[Ver resolução](Exercicio01_QuatroOperacoes/README.md)

### Exercício 02

Faça um programa que mostre os números impares em um intervalo de 0 a 100.

[Ver resolução](Exercicio02_NumerosImpares/README.md)

### Exercício 03

Faça um programa que mostre a quantidade de caracteres para o texto “Disciplina de Programação para web”.

[Ver resolução](Exercicio03_QuantidadeDeCaracteres/README.md)

### Exercício 04

Faça um programa que recebe o nome de uma variável e mostre o <<primeiro>>.<<último nome>>@facens.br

Por exemplo:

A variável nome possui o conteúdo “Edson Martin Feitosa”.

Deve mostrar edson.feitosa@facens.br

[Ver resolução](Exercicio04_EmailInstitucional/README.md)

### Exercício 05

Escreva um programa que imprima os números de 1 a 10 no console usando um loop. Os número devem ser separados com um traço, ex.: 1 – 2 – 3 - ... – 10. Observação: após o número 10 não pode ter um traço.

[Ver resolução](Exercicio05_SequenciaComTracos/README.md)

### Exercício 06

Faça uma função que mostre o dobro do número passado. Caso o número seja menor ou igual a zero deve mostrar a mensagem “Só é aceito números positivos maiores que zero”.

[Ver resolução](Exercicio06_DobroPositivo/README.md)

### Exercício 07

Escreva uma função que receba uma string como argumento e retorne a string invertida.

[Ver resolução](Exercicio07_StringInvertida/README.md)

### Exercício 08

Escreva uma função que recebe uma string como argumento e retorna o número de vogais presentes nessa string. Considere apenas vogais minúsculas (a, e, i, o, u).

[Ver resolução](Exercicio08_ContarVogais/README.md)

### Exercício 09

Escreva uma função que recebe um endereço de e-mail como argumento e retorna true se o e-mail for válido ou false caso contrário. Um e-mail válido deve conter um único símbolo '@' e pelo menos um ponto '.' após o '@'.

[Ver resolução](Exercicio09_ValidarEmail/README.md)

### Exercício 10

Escreva uma função que verifique se uma determinada string é um palíndromo (ou seja, pode ser lida da mesma forma tanto da esquerda para a direita quanto da direita para a esquerda).

Exemplo: arara

[Ver resolução](Exercicio10_Palindromo/README.md)

## Observações

- No exercício 4, o valor de exemplo é um nome completo com pelo menos nome e sobrenome. A saída é `edson.feitosa@facens.br`.
- O exercício 6 mantém a mensagem pedida no enunciado.
- O exercício 8 conta somente as vogais minúsculas sem acento, conforme a lista.
- O exercício 9 verifica exatamente as duas regras pedidas: um único `@` e um ponto depois dele. Isso não é uma validação completa de endereços reais.
- O exercício 10 compara o texto como foi recebido, distinguindo maiúsculas, espaços e acentos. A lista usa uma palavra simples como exemplo e não pede normalização de frases.

## Cuidados com os conceitos da aula

`var` tem escopo de função ou global, conforme onde é declarado; ele não tem escopo de bloco. `let` e `const` têm escopo de bloco. `const` impede reatribuir a variável. `undefined` indica ausência de valor atribuído. `Infinity` e `NaN` são valores do tipo `number`. `toFixed()` retorna uma string formatada.

[Voltar à disciplina](../README.md)
