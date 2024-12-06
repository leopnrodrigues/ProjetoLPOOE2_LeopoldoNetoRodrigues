# ProjetoLPOOE1_LeopoldoNetoRodrigues

Atividade Avaliativa Etapa 1 – parte Prática (peso 2.0)

Desenvolvimento de Projeto com JDBC, JPA e Maven

### Objetivo
Desenvolver um projeto Java que utilize JDBC e JPA para gerenciar o acesso a um banco de dados PostgreSQL. O projeto deve ser gerenciado com Maven, versionado no Github e conter pelo menos três classes relacionadas com mapeamento de relacionamento e, preferencialmente, uma relação de herança.

O programa desenvolvido simula o gerenciamento de um pedágio, permitindo registrar:
- Passagens de veículos
- Motoristas (um motorista pode estar em nenhuma ou várias passagens, mas cada passagem armazena apenas um motorista)
- Motoristas (um funcionário pode estar em nenhuma ou várias passagens, mas cada passagem armazena apenas um funcionário)
- Veículo (um funcionário pode estar em nenhuma ou várias passagens, mas cada passagem armazena apenas um veículo)
- Informações como valor total, data e hora.

### Funcionalidades
- **Tela inicial**: visão geral das passagens em uma tabela, menus com opções de cadastro, botões para editar ou excluir a passagem selecionada.
- **Telas de cadastro**: exibir uma lista de funcionários, motoristas ou veículos.
- **Filtros**: é possível pesquisar por nome ou placa, e no caso dos funcionários, filtrar por turno de trabalho
- **CRUD**: É possível excluir, atualizar e criar registros.

### Modelagem
![Diagrama de classe do projeto](DiagramaClasse.drawio.png)
