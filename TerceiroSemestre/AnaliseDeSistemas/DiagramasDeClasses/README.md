# Diagramas de Classes

Material da aula de Análise de Sistemas. O diagrama de classes mostra a estrutura do sistema: classes, atributos, operações e os relacionamentos entre elas.

## O que foi visto

- Uma classe representa um tipo de objeto. O retângulo da classe pode ser dividido em nome, atributos e métodos.
- Os atributos representam dados da classe. Os métodos representam operações ou comportamentos.
- A visibilidade aparece antes do membro: `+` público, `-` privado e `#` protegido.
- Associação representa uma ligação entre classes. A multiplicidade informa quantos objetos podem participar, como `1`, `0..1` e `0..*`.
- Agregação representa uma relação todo-parte em que a parte pode existir separadamente.
- Composição representa uma relação todo-parte mais forte, em que a parte acompanha o ciclo de vida do todo.
- Generalização representa herança. A seta aponta para a classe mais geral.
- Dependência indica que uma classe usa outra de forma pontual.
- O professor recomenda identificar primeiro as classes e os relacionamentos. Os métodos podem ser detalhados depois dos diagramas de sequência.

## Os cinco diagramas

O Lumio continua como projeto principal. Os quatro exemplos genéricos reaproveitam os domínios dos diagramas de casos de uso para manter os materiais relacionados.

| Sistema | Conteúdo | Prévia | Fonte editável |
|---|---|---|
| Lumio | Usuários, residências, contas de energia, metas e recomendações | [SVG](Lumio.svg) | [PlantUML](Lumio.puml) |
| Campeonato virtual de skate | Skatistas, campeonatos, vídeos, inscrições e avaliações | [SVG](Campeonato_Skate.svg) | [PlantUML](Campeonato_Skate.puml) |
| Cadastro e autenticação | Usuários, credenciais, validação de CPF e consentimentos | [SVG](Cadastro_Autenticacao.svg) | [PlantUML](Cadastro_Autenticacao.puml) |
| Biblioteca | Leitores, livros, exemplares, empréstimos e reservas | [SVG](Biblioteca.svg) | [PlantUML](Biblioteca.puml) |
| Loja virtual | Clientes, pedidos, produtos, pagamentos e entregas | [SVG](Loja_Virtual.svg) | [PlantUML](Loja_Virtual.puml) |

Cada página Markdown contém também uma versão Mermaid para visualização rápida no GitHub. Os arquivos PlantUML são fontes editáveis e os SVGs podem ser baixados ou inseridos em trabalhos.

## Critérios dos modelos

Os nomes das classes representam conceitos do domínio. Os atributos guardam seus dados principais e os métodos descrevem ações compatíveis com o sistema. Os exemplos mostram associação, composição, generalização e dependência quando elas fazem sentido para o domínio.

No modelo do Lumio, as operações são propostas a partir das funções já discutidas para o projeto. Elas ainda podem ser refinadas quando os diagramas de sequência forem definidos. As relações e multiplicidades também registram as premissas usadas nesta versão.
