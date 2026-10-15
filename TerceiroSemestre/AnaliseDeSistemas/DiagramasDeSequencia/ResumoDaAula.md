# Resumo da aula — diagramas de sequência

## O que o diagrama representa

Mostra a troca de mensagens entre participantes de um cenário de caso de uso. O tempo avança de cima para baixo; a posição horizontal separa participantes e não indica prioridade. Cada cenário pode ter sua própria sequência, inclusive alternativas e erros; não existe obrigação de fazer exatamente um diagrama por caso de uso.

O **Diagrama de Sequência do Sistema (DSS)** trata o sistema como uma caixa única e mostra eventos de entrada e respostas observáveis. Uma sequência detalhada abre essa caixa e mostra interface, controle, entidades e serviços. O Lumio desta pasta usa esse segundo nível. Uma linha de vida de serviço ou banco pode representar um participante lógico; não precisa corresponder diretamente a uma classe Java.

## Elementos da aula

| Elemento | Significado |
|---|---|
| Ator | Papel externo que participa da interação |
| Participante / objeto | Instância ou parte do sistema que envia ou recebe mensagens |
| Linha de vida | Existência do participante ao longo da interação |
| Barra de execução | Intervalo em que uma operação está em execução; pode conter chamadas aninhadas |
| Chamada síncrona | O remetente aguarda a conclusão; seta com ponta preenchida |
| Mensagem assíncrona | O remetente pode continuar sem aguardar; ponta aberta |
| Retorno | Resposta a uma chamada; linha tracejada com a resposta |
| Autochamada | Participante chama uma operação própria |
| Criação | Mensagem que inicia a linha de vida de uma nova instância |
| Destruição | Um X termina a linha de vida; não é obrigatório destruir objetos ao terminar toda operação |
| Restrição de tempo | Condição temporal ou limite de duração associado à interação |
| Mensagem perdida | Destinatário fora do recorte ou destino desconhecido, indicado por círculo preenchido |
| Mensagem encontrada | Remetente fora do recorte ou origem desconhecida, indicado por círculo preenchido |
| Porta | Ponto de comunicação específico de um participante |

Os exemplos usam setas contínuas para chamadas e tracejadas para retornos. Barras de execução são opcionais nestes exemplos e só foram desenhadas nas autochamadas. A notificação ao cliente no exemplo de login representa entrega abstrata do código, sem detalhar transporte ou concorrência.

## Fragmentos e referências de interação

| Notação | Uso |
|---|---|
| `alt` | Alternativas com condições de guarda, como pagamento aprovado ou recusado |
| `opt` | Trecho executado apenas quando a condição é verdadeira |
| `loop` | Repetição com condição ou limites definidos |
| `break` | Quando a guarda é verdadeira, executa o trecho e abandona o restante da interação envolvente; não se limita a laços |
| `neg` | Sequência considerada inválida/proibida; não é um tratamento genérico de erro de execução |
| `ref` | Referência a outra interação definida separadamente, para reutilizar ou dividir cenários |

As guardas ficam entre colchetes na notação UML. Use condições claras e, nas alternativas deste material, mutuamente exclusivas. O `else` cobre os casos restantes. Os exemplos praticam `alt`, `opt` e `loop`; os demais recursos ficam resumidos na teoria, sem fragmentos artificiais apenas para preencher o desenho.

## Como montar e revisar

1. Escolher um cenário do caso de uso e registrar a pré-condição.
2. Identificar o ator e os participantes necessários ao cenário.
3. Ordenar chamadas e retornos; cada mensagem deve ter uma origem e um destino coerentes.
4. Incluir validações, alternativas e repetições onde existirem regras.
5. Conferir se cada retorno corresponde a uma solicitação anterior e se os dados são salvos no momento correto.
6. Comparar os nomes e responsabilidades com os modelos de classes e componentes. Participantes lógicos não são, por si só, novas classes exigidas no projeto.

[Voltar aos problemas](README.md)
