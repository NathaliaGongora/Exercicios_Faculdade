# Associação, agregação e composição

Exercícios de Programação Orientada a Objetos sobre relacionamentos entre classes.

A aula não apresenta uma lista de atividades no final. O primeiro exercício foi desenvolvido a partir do exemplo completo de UFC, e os demais seguem os exemplos e conceitos apresentados nos slides.

| Exercício | Relacionamento | Conteúdo |
|---|---|---|
| [Exercício 01](Exercicio01.java) | Associação | Luta relacionando dois lutadores |
| [Exercício 02](Exercicio02.java) | Agregação | Estado com cidades independentes |
| [Exercício 03](Exercicio03.java) | Composição | Biblioteca criando seus livros internamente |
| [Exercício 04](Exercicio04.java) | Associação | Compra relacionada a um cliente |
| [Exercício 05](Exercicio05.java) | Agregação | Escola com professores independentes |
| [Exercício 06](Exercicio06.java) | Composição | Pedido criando seus próprios itens |
| [Exercício 07](Exercicio07.java) | Associação | Consulta relacionando médico e paciente |
| [Exercício 08](Exercicio08.java) | Agregação | Time com jogadores independentes |
| [Exercício 09](Exercicio09.java) | Composição | Casa criando seus cômodos |
| [Exercício 10](Exercicio10.java) | Composição e agregação | Carro com motor e passageiros |

## Diferença principal

- Associação: um objeto conhece ou utiliza outro.
- Agregação: o objeto todo recebe partes que já existem de forma independente.
- Composição: o objeto todo cria e controla suas próprias partes.

No exemplo da biblioteca apresentado na aula, os livros são criados fora da biblioteca e entregues a ela. Para deixar a composição clara no exercício 03, a própria biblioteca cria os livros pelo método `adicionarLivro`.
