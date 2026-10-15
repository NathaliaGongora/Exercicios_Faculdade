# Exercicio 06 — NotacoesMatematicas

**Origem:** Lista do professor.

## Enunciado

Explique as notacoes infixa, prefixa e pos-fixa para ((A+B)*C)/D. Leia A, B, C e D com Scanner, rejeite D=0, apresente as tres notacoes e demonstre a avaliacao pos-fixa com Stack<Double>.

## Arquivos e execucao

- [Exercicio6Notacoes.java](Exercicio6Notacoes.java)
- [Entrada.java](Entrada.java)

Execute os comandos dentro desta pasta, com o JDK instalado:

```bash
javac -encoding UTF-8 -d saida Exercicio6Notacoes.java Entrada.java
java -cp saida Exercicio6Notacoes
```

Cada pasta e um programa independente. Nao compile pastas diferentes juntas: algumas classes possuem o mesmo nome.



[Registro da execucao de teste](Execucao.txt)

[Voltar ao conteudo](../README.md)

## Notacoes

Infixa coloca o operador entre operandos; prefixa o coloca antes; pos-fixa o coloca depois. Em pos-fixa, a pilha recebe operandos e devolve os dois ultimos quando encontra um operador. A ordem das retiradas importa na subtracao e divisao. Parenteses e precedencia devem ser respeitados ao escrever a forma pos-fixa. A demonstracao avalia apenas a expressao fixa da lista.
