# Resumo da aula — Diagrama de atividades

Aula 9 de Análise de Sistemas, professor Evandro Veronez. Resumo do material “Diagrama de atividades (1).pptx”, com 20 slides.

## Para que serve

Representa as ações de uma atividade, a ordem em que ocorrem, suas decisões e os caminhos possíveis. Pode descrever um processo ou o comportamento de um método. A atividade é o comportamento completo do recorte; uma ação é um passo dentro dele.

## Elementos estudados

| Elemento | Representação e função |
|---|---|
| Ação | Retângulo com cantos arredondados. Descreve um passo, como “Consultar conta” |
| Nó inicial | Círculo preenchido. Marca o início do fluxo |
| Fluxo de controle | Seta que mostra a sequência de execução |
| Decisão | Losango com uma entrada e saídas condicionais, como [válido] e [inválido] |
| União (merge) | Losango que reúne caminhos alternativos sem esperar todos eles |
| Final de atividade | Círculo preenchido dentro de outro círculo. Encerra a atividade inteira |
| Final de fluxo | Círculo com X. Encerra apenas aquele fluxo |
| Nó de objeto | Retângulo que representa um objeto ou dado disponível no fluxo |
| Fluxo de objetos | Transporta dados ou objetos entre ações e nós de objeto |
| Pins | Pequenos quadrados na ação que representam entradas ou saídas |
| Parâmetro de atividade | Nó de objeto na borda da atividade que representa uma entrada ou saída |
| Tratamento de exceção | Desvia uma situação excepcional para um tratador |
| Envio e aceitação de sinal | Representam emissão de sinal e espera pelo seu recebimento |
| Conector | Par de círculos com a mesma identificação para continuar o fluxo em outro ponto |
| Partição (raia) | Agrupa ações pelo responsável, setor ou papel |

## Paralelismo e união de caminhos

Uma barra de **bifurcação (fork)** abre fluxos paralelos. Uma barra de **sincronização (join)** aguarda os fluxos de entrada necessários antes de continuar. Um losango de união reúne alternativas: basta chegar o fluxo do caminho escolhido. São situações diferentes.

As condições de decisão devem deixar claro qual caminho seguir. Repetições podem ser mostradas com uma decisão que retorna a uma ação anterior, passando por um nó de união quando houver alternativas de entrada.

## Prática proposta na aula

O slide 19 pede: escolher uma atividade e usar a maior quantidade de ações possível. Isso pede detalhamento das etapas do processo, preservando a clareza. Não é necessário inventar ações ou usar todos os símbolos em todo desenho.

O slide 20 indica um vídeo de apoio no Lucidchart. Os exemplos desta pasta acompanham essa prática visual, com imagens e explicações em linguagem natural.

## Conferência antes de exportar

- Dar nomes de ação com verbos, como “Registrar conta”.
- Conferir início, setas, guardas e término.
- Usar união para alternativas e sincronização para paralelismo.
- Verificar se cada caminho chega ao destino esperado ou retorna de forma clara.
- Usar raias quando for necessário distinguir responsabilidades.

[Voltar aos problemas](README.md)
