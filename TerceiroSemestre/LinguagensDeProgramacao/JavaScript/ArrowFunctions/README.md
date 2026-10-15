# Arrow functions

Referência: “2- 02 JavaScript Exercicios.docx”. A lista pede o uso de arrow functions nos cinco exercícios fornecidos. Para completar dez exercícios neste conteúdo, os itens 6 a 10 são complementares.

## Conteúdo

Arrow functions, parâmetros, retorno de valores, condições e percursos em vetores. Os exemplos usam valores definidos no código e saída no console.

Uma expressão simples pode usar retorno implícito:

```javascript
const somar = (a, b) => a + b
```

Quando o corpo usa chaves e precisa devolver um valor, use return:

```javascript
const somar = (a, b) => {
    return a + b
}
```

## Exercícios

| Número | Tema | Origem |
|---|---|---|
| [01](Exercicio01_ClassificarTriangulos/README.md) | Classificação de triângulos | Lista do professor |
| [02](Exercicio02_FormatarDinheiro/README.md) | Formatação de dinheiro | Lista do professor |
| [03](Exercicio03_JurosSimples&Compostos/README.md) | Juros simples e compostos | Lista do professor |
| [04](Exercicio04_DivisibilidadePorTres/README.md) | Divisibilidade por 3 | Lista do professor |
| [05](Exercicio05_Menor&MaiorValor/README.md) | Menor e maior valor | Lista do professor |
| [06](Exercicio06_SomarNumeros/README.md) | Soma de dois números | Complementar |
| [07](Exercicio07_DobroPositivo/README.md) | Dobro de um número positivo | Complementar |
| [08](Exercicio08_Quadrado/README.md) | Quadrado de um número | Complementar |
| [09](Exercicio09_MediaDoVetor/README.md) | Média de um vetor | Complementar |
| [10](Exercicio10_NumerosPares/README.md) | Números pares do vetor | Complementar |

## Executar

Abra esta pasta no VS Code e execute no terminal, com o Node.js instalado:

```bash
node "Exercicio01_ClassificarTriangulos/script.js"
```

Cada arquivo tem o enunciado completo em comentário no início. Os programas são independentes e não exigem bibliotecas adicionais.

## Critérios usados

- O exercício 1 considera medidas numéricas, positivas e que atendam à desigualdade triangular. Medidas que não formam um triângulo retornam “Triangulo invalido”.
- No exercício 2, o resultado esperado para 0.1 + 0.2 é `R$0,30`. A função formata duas casas decimais e troca o separador. Não acrescenta separadores de milhar nem substitui cálculos monetários com precisão decimal.
- No exercício 3, as duas funções retornam o **montante**, não apenas os juros. A taxa é decimal e deve corresponder à unidade do tempo: taxa mensal com tempo em meses, por exemplo.
- Os exercícios de divisibilidade e menor/maior recebem números inteiros, conforme a lista. O exercício 5 informa “Vetor vazio” quando não há valores para comparar.

[Voltar a JavaScript](../README.md)
