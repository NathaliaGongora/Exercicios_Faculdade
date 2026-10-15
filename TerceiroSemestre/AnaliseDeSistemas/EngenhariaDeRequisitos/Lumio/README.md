# Lumio — RF01: Enviar conta de energia

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

[Voltar para Engenharia de Requisitos](../README.md)
