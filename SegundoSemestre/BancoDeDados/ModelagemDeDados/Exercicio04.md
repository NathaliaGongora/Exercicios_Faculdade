# Exercicio 04 - Controle de veiculos

O modelo registra os veiculos da frota, os motoristas, as viagens realizadas e as manutencoes. Cada viagem usa um veiculo e tem um motorista responsavel. Cada manutencao fica ligada ao veiculo que recebeu o servico.

O enunciado informa que a frota tem sete veiculos, mas esse numero representa a quantidade inicial de registros, nao uma regra que limita o banco a sete veiculos.

```mermaid
erDiagram
    VEICULO ||--o{ VIAGEM : realiza
    MOTORISTA ||--o{ VIAGEM : dirige
    VEICULO ||--o{ MANUTENCAO : recebe

    VEICULO {
        int id_veiculo PK
        string placa UK
        string modelo
        int ano
        int capacidade_passageiros
    }
    MOTORISTA {
        int id_motorista PK
        string nome
        string CNH UK
    }
    VIAGEM {
        int id_viagem PK
        int id_veiculo FK
        int id_motorista FK
        string destino
        datetime data_hora_saida
        datetime data_hora_retorno
        string tipo_carga
    }
    MANUTENCAO {
        int id_manutencao PK
        int id_veiculo FK
        date data_manutencao
        string servico
        decimal valor
    }
```

Cardinalidades: um veiculo pode ainda nao ter viagens ou manutencoes, ou pode ter varias. Cada viagem e cada manutencao pertence a exatamente um veiculo. Um motorista pode nao ter viagens cadastradas ou pode realizar varias; cada viagem tem exatamente um motorista.
