# Exercicio 08 — MemoriaDaJVM

**Origem:** Exemplo de sala solicitado na atividade.

## Enunciado

Execute o exemplo de memoria alocada: consulte totalMemory e freeMemory, crie um vetor double e compare as leituras antes e depois de solicitar gc.

## Arquivos e execucao

- [Main.java](Main.java)

Execute os comandos dentro desta pasta, com o JDK instalado:

```bash
javac -encoding UTF-8 -d saida Main.java
java -cp saida Main
```

Cada pasta e um programa independente. Nao compile pastas diferentes juntas: algumas classes possuem o mesmo nome.

As leituras variam conforme a JVM. A diferenca nao mede com exatidao o tamanho do vetor; gc e uma solicitacao, sem garantia de execucao imediata. O vetor permanece referenciado.

[Registro da execucao de teste](Execucao.txt)

[Voltar ao conteudo](../README.md)
