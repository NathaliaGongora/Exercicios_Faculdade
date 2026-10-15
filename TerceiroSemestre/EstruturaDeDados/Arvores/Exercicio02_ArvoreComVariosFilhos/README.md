# Exercicio 02 — ArvoreComVariosFilhos

**Origem:** Exercicio 2 dos slides.

## Enunciado

Crie uma arvore em que cada no possa armazenar qualquer quantidade de filhos. Implemente a soma dos valores dos filhos de um no pai. Leia os valores com Scanner.

## Arquivos e execucao

- [Main.java](Main.java)
- [Entrada.java](Entrada.java)
- [NoArvore.java](NoArvore.java)
- [Arvore.java](Arvore.java)

Execute os comandos dentro desta pasta, com o JDK instalado:

```bash
javac -encoding UTF-8 -d saida Main.java Entrada.java NoArvore.java Arvore.java
java -cp saida Main
```

Cada pasta e um programa independente. Nao compile pastas diferentes juntas: algumas classes possuem o mesmo nome.

somarFilhos soma apenas os filhos imediatos, sem incluir o pai. O metodo adicional somarDescendentes percorre todos os niveis inferiores. A estrutura representa uma arvore: cada filho deve ser novo, sem ciclos.

[Registro da execucao de teste](Execucao.txt)

[Voltar ao conteudo](../README.md)
