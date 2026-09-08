# Projeto FiapRide

## Descrição
Sistema de gerenciamento de mobilidade urbana desenvolvido como atividade prática da disciplina de Programação Orientada a Objetos (POO) da FIAP. Este repositório marca a reestruturação e consolidação inicial do projeto, unindo a modelagem de classes, o encapsulamento, os construtores e as validações de regras de negócio em um único histórico limpo sob um único contribuidor.

## Funcionalidades
- **Cadastro de Passageiros**: Criação de perfis exigindo nome e CPF, com saldo inicial zerado.
- **Recarga de Saldo (Passageiro)**: Adição de valores à carteira digital, com validação estrita para impedir valores negativos ou zerados.
- **Pagamento de Viagem (Passageiro)**: Processamento de débitos, verificando a validade do custo e a suficiência de saldo.
- **Cadastro de Motoristas**: Criação de perfis para condutores associando nome, CPF e saldo de ganhos.
- **Recebimento de Pagamentos (Motorista)**: Adição de valores ao saldo do motorista com validações de montante.
- **Saque de Saldo (Motorista)**: Retirada de fundos acumulados com validação de saldo disponível.

## Como Executar
1. Importe o projeto no Eclipse ou em sua IDE de desenvolvimento Java preferida.
2. Certifique-se de que o arquivo de diagrama `.asta` esteja salvo na raiz do projeto para versionamento do modelo UML.
3. Execute o arquivo `SistemaPrincipal.java` localizado no pacote `br.com.fiapride.main` para rodar os testes consolidados.