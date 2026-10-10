# Consultorio Medico

Script SQL Server criado a partir do Modelo Entidade-Relacionamento do consultorio medico.

## Estrutura

O banco possui as tabelas:

- `Paciente`
- `Exame`
- `Medico`
- `Especialidade`
- `Consulta`
- `MedicoEspecialidade`

A tabela `MedicoEspecialidade` representa o relacionamento de muitos para muitos entre medicos e especialidades.

## Arquivo

- [ConsultorioMedico.sql](ConsultorioMedico.sql)

## Execucao

Abra o arquivo no SQL Server Management Studio, selecione todo o conteudo e execute o script.
