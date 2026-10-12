# Ideias para o sistema de campeonato virtual de skate

Sugestões de casos de uso para ampliar o diagrama sem colocar todos de uma vez. A seleção final deve priorizar as funções que realmente fazem parte do escopo do sistema.

## Usuários e skatistas

- Realizar login, recuperar senha, confirmar e-mail e editar perfil.
- Autenticar em dois fatores e vincular uma rede social.
- Consultar histórico de campeonatos, pontuações e evolução no ranking.
- Solicitar mudança de categoria ou revisão de uma nota.
- Gerenciar patrocinadores e documentos do skatista.

## Vídeos e campeonatos

- Enviar, editar, substituir, compartilhar e favoritar vídeos.
- Validar formato e duração e gerar miniatura do vídeo.
- Criar, editar e cancelar campeonato; definir regulamento, critérios, categorias, fases e cronograma.
- Abrir ou encerrar inscrições, publicar resultados, emitir certificados e registrar premiações.

## Avaliação, ranking e comunidade

- Avaliar dificuldade, execução e criatividade; registrar observações e validar notas.
- Solicitar revisão da avaliação e resolver desempate.
- Consultar rankings geral, por categoria, cidade, estado ou período.
- Criar tópicos, responder, editar e denunciar comentários; pesquisar e moderar o fórum.

## Denúncias e administração

- Abrir e acompanhar denúncia, anexar evidências, notificar envolvidos, arquivar ou reabrir denúncia.
- Gerenciar usuários, juízes, categorias, patrocinadores e banners.
- Configurar o sistema, consultar logs de acesso e operações, auditar ações e administrar backup.
- Bloquear usuário e detectar conteúdo duplicado ou tentativa de fraude.

## Comunicação, relatórios e integrações

- Enviar notificações por e-mail ou push sobre inscrições, resultados e suspensões.
- Conversar com a organização e consultar relatórios de inscrições, campeonatos, vídeos, denúncias e desempenho de juízes.
- Exportar relatórios para PDF ou planilha.
- Integrar com redes sociais, YouTube e APIs de parceiros.
- Se houver cobrança, realizar pagamento, emitir recibo, consultar pagamentos e solicitar reembolso.
- Se fizer sentido para o público do sistema, adicionar conquistas, medalhas, níveis e desafios.

## Relações UML possíveis

- `Enviar vídeo` `<<include>>` `Validar formato e duração`: a validação é obrigatória no envio.
- `Avaliar vídeo` `<<include>>` `Registrar nota`: toda avaliação concluída precisa registrar uma nota.
- `Analisar denúncia` pode ser ampliado por `Excluir vídeo` ou `Suspender usuário` com `<<extend>>`, quando a análise concluir que há violação.
- `Publicar resultado` pode ser ampliado por `Emitir certificado` com `<<extend>>` quando o campeonato oferece certificado.
- `Exportar relatório` pode estender `Consultar relatório` quando o usuário escolher exportar.

Em `<<include>>`, a seta vai do caso principal para o caso obrigatório incluído. Em `<<extend>>`, a seta vai do caso opcional para o caso base.
