# Exercicio 02 — PipelineCircular

**Origem:** Lista do professor.

## Enunciado

Crie EtapaPipeline com nome, responsavel e referencias proxima e anterior encapsulados. Implemente PipelineCircular com primeira, atual, quantidade, adicionar ao final e por indice, remover, avancar, voltar, exibirEtapaAtual, tamanho e imprimirPipeline recursivo. Crie MainPipeline com Scanner e menu 0 a 9. Valide indices e vazios e atualize a etapa atual quando removida. Sem colecoes prontas.

## Arquivos e execucao

- [MainPipeline.java](MainPipeline.java)
- [Entrada.java](Entrada.java)
- [EtapaPipeline.java](EtapaPipeline.java)
- [PipelineCircular.java](PipelineCircular.java)

Execute os comandos dentro desta pasta, com o JDK instalado:

```bash
javac -encoding UTF-8 -d saida MainPipeline.java Entrada.java EtapaPipeline.java PipelineCircular.java
java -cp saida MainPipeline
```

Cada pasta e um programa independente. Nao compile pastas diferentes juntas: algumas classes possuem o mesmo nome.

A opcao 9 cadastra o padrao somente na estrutura vazia, evitando duplicacao involuntaria. A impressao recursiva e adequada a exemplos pequenos; uma quantidade muito grande de etapas pode exceder a pilha de chamadas.

[Registro da execucao de teste](Execucao.txt)

[Voltar ao conteudo](../README.md)
