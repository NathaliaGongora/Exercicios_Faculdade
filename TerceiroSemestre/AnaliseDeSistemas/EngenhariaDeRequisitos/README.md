# Engenharia de Requisitos

Resumo de aprendizagem baseado nos slides da aula e um exemplo do projeto Lumio.

## Conceitos da aula

### Tipos de requisitos

- **Requisitos de usuário** descrevem, em linguagem próxima à do usuário, o que ele precisa realizar.
- **Requisitos de sistema** detalham os serviços e as restrições que o sistema deve cumprir.
- **Requisitos funcionais** descrevem serviços, respostas a entradas e comportamentos em situações específicas.
- **Requisitos não funcionais** estabelecem restrições e qualidades do sistema, como desempenho, segurança, disponibilidade e facilidade de uso. Devem ser descritos com critérios que possam ser verificados.

### Elicitação e análise

A elicitação busca descobrir e compreender as necessidades dos stakeholders. A aula destaca entrevistas e observação do trabalho, além de histórias e cenários. Stakeholders podem ter objetivos diferentes, usar termos próprios, não saber expressar exatamente o que precisam e ser afetados por mudanças no ambiente de negócio.

O processo de requisitos é iterativo: elicitar e analisar, especificar e validar, revendo requisitos conforme novas informações surgem.

### Especificação

Requisitos podem ser registrados em linguagem natural, templates estruturados, diagramas ou notações matemáticas. Um template funcional pode documentar função, descrição, entradas, origem, saídas, destino, ação, dados necessários, pré-condição, pós-condição e efeitos colaterais. Use linguagem clara, padrão consistente, diferencie o obrigatório do desejável e registre a justificativa quando possível.

### Validação e gerenciamento

A validação verifica validade, consistência, completude, realismo e verificabilidade. Revisões, protótipos e casos de teste ajudam nessa conferência. O gerenciamento de requisitos organiza identificação, mudanças, rastreabilidade e apoio de ferramentas durante a evolução do sistema.

## Exemplo do Lumio: RF01 — Enviar conta de energia

| Campo | Especificação |
|---|---|
| Função | Permitir que o usuário envie uma conta de energia para o Lumio registrar e analisar as informações. |
| Descrição | O usuário envia a conta; o sistema identifica os dados principais e os apresenta para conferência antes de salvar. |
| Entradas | Arquivo da conta de energia. |
| Fonte | Conta enviada pelo usuário. |
| Saídas | Consumo em kWh, valor da conta e mês de referência identificados. |
| Destino | Sistema Lumio e unidade consumidora escolhida. |
| Ação | Receber o arquivo, extrair os dados, permitir a conferência e salvar após confirmação. |
| Requisitos | O usuário deve estar autenticado e ter uma unidade consumidora cadastrada para vincular a conta. |
| Pré-condição | Usuário autenticado e unidade consumidora cadastrada. |
| Pós-condição | Dados da conta salvos e disponíveis no histórico para consulta de consumo e gastos. |

O requisito foi estruturado a partir do exemplo enviado. A extração automática dos dados é uma proposta de interpretação da ação mostrada na atividade; os dados exatos e regras de validação podem ser refinados com stakeholders.
