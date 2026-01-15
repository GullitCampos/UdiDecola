#  Udi-Decola — Sistema de Busca e Compra de Viagens

## Visão Geral
O **Udi-Decola** é um sistema desenvolvido em **Java** que permite a busca e a compra de **passagens aéreas** e **diárias em hotéis**, além do gerenciamento completo de clientes, funcionários, companhias aéreas e hotéis parceiros.

Este projeto foi desenvolvido como **Projeto Final**, aplicando conceitos de **Programação Orientada a Objetos**, **encapsulamento**, **herança**, **classes abstratas**, **listas dinâmicas**, **interface gráfica**, **persistência em banco de dados** e **arquivos**.

---

## Domínio do Problema

### Voos e Trechos
- Cadastro de **trechos de voo** com:
  - Código identificador (3 letras + 5 números)
  - Origem e destino (considerando múltiplos aeroportos por cidade)
  - Hora de saída e chegada
  - Companhia aérea responsável
- Cadastro prévio de **companhias aéreas**, contendo:
  - CNPJ
  - Nome oficial
  - Nome de divulgação
  - Data de criação
- Cada trecho pode gerar **vários voos**, em datas diferentes:
  - Data do voo
  - Hora programada de partida e chegada
  - Número de vagas disponíveis
  - Valor da passagem (variável conforme época e eventos)
- Cada companhia aérea paga um **valor fixo** ao Udi-Decola por passagem vendida.

---

###  Hotéis
- Cadastro de **hotéis parceiros**, contendo:
  - CNPJ
  - Nome oficial e nome de divulgação
  - Endereço completo
  - Cidade
  - Ano de criação
  - Número de estrelas
  - Aceita pets ou não
  - Número total de quartos
  - Horário de check-in e check-out
  - Mensagem de divulgação
  - Descrição do hotel
- Para cada **data do ano**, o sistema registra:
  - Quartos *standard* (single, duplo e triplo):
    - Quantidade disponível
    - Valor da diária sem desconto
    - Valor do desconto
    - Valor final com desconto
    - Se aceita cancelamento
  - Quartos de luxo:
    - Quantidade disponível
    - Valor da diária sem desconto
    - Valor do desconto
    - Valor final com desconto
- Cada hotel paga um **valor fixo** ao Udi-Decola por diária vendida.

---

### Clientes
- Cadastro obrigatório para efetuar compras:
  - CPF (com validação real)
  - Nome
  - Endereço completo
  - Data de nascimento
  - Data de cadastro
  - E-mail
- Controle do número de compras realizadas
- Cliente pode se tornar **VIP** ao atingir um número mínimo de compras:
  - Data em que se tornou VIP
  - Percentual de desconto aplicado em novas compras

---

###  Funcionários
- Cadastro de funcionários com:
  - Nome
  - CPF
  - Endereço completo
  - Número da carteira de trabalho
  - Data de nascimento
  - Salário fixo
- Funcionário pode também ser cliente
- Funcionários responsáveis por **parcerias de hotéis**:
  - Registro do funcionário responsável por cada hotel
  - Controle do número de hotéis cadastrados
  - Salário = salário fixo + percentual por hotel cadastrado

---

### Pesquisas
- Registro de todas as pesquisas feitas por clientes:
  - Origem
  - Destino
  - Data de início e fim
  - Data e hora da pesquisa
- Utilizado para análise de destinos e períodos mais procurados

---

###  Compras
- Cada compra pode conter:
  - Passagens aéreas
  - Diárias de hotel
  - Ou ambos
- Registro de:
  - Cliente
  - Data e hora da compra
  - Quantidade de passagens e diárias
  - Forma de pagamento
  - Valor total da compra
- Atualização automática do número de compras do cliente
- Cálculo:
  - Valor pago pelo cliente
  - Valor recebido pelo Udi-Decola

---

##  Requisitos de Implementação

###  Encapsulamento
Todos os atributos são privados, com validações nos métodos `get` e `set`.

###  Validação de CPF
- Implementação do **algoritmo real de validação de CPF**.

###  Construtores
- Classe **Cliente**:
  - Construtor com nome e CPF
  - Construtor default
- Classe **Compra**:
  - Cliente
  - Voo
  - Data e hora
- Todas as classes possuem pelo menos um construtor explícito.

### Herança
- Implementação de todas as situações de herança descritas nos requisitos.

### Atributos Estáticos
- Valor fixo pago por:
  - Diária de hotel
  - Passagem aérea
- Número mínimo de compras para cliente VIP
- Valor adicional pago a funcionários que cadastram hotéis

###  Realização de Compra
- Cálculo do valor total da compra
- Conversão automática de cliente para VIP
- Cálculo do valor recebido pelo Udi-Decola

###  Classes Abstratas
- Avaliação e implementação de classes abstratas quando aplicável.

---

## Classes de Dados (Parte 2)

Foram criadas classes específicas para gerenciar os dados do sistema:
- `DadosTrechoVoo`
- `DadosHoteis`
- `DadosFuncionarios`
- `DadosClientes`
- (entre outras)

Cada classe:
- Usa `ArrayList` privado
- Possui métodos públicos para:
  - Cadastrar
  - Listar
  - Buscar
  - Excluir

---

## Interface Gráfica e Persistência

- Interface gráfica desenvolvida com **Swing/AWT**
- Para pelo menos uma classe:
  - Telas de cadastro, consulta e remoção
  - Persistência em:
    - **PostgreSQL**
    - **Arquivo**
- Para as demais classes:
  - Telas de cadastro

---

## Requisito Extra (Exemplo)

**Sistema de Avaliação de Hotéis**
- Clientes podem avaliar hotéis após a estadia
- Avaliação com nota de 1 a 5 estrelas e comentário
- Média das avaliações exibida nas buscas
- Justifica a criação da classe `AvaliacaoHotel`

---

##  Tecnologias Utilizadas
- Java
- Programação Orientada a Objetos
- Swing / AWT
- PostgreSQL
- Arquivos
- ArrayList

---

##  Observação Final
Este projeto consolida os principais conceitos estudados ao longo da disciplina, simulando um sistema real de grande porte com regras de negócio bem definidas.
