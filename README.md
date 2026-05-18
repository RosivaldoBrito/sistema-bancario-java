# sistema-bancario-java
Sistema bancário no console desenvolvido em Java para aplicar conceitos de Encapsulamento, Sobrecarga e Regras de Negócio.
# 🏦 Sistema Bancário Simples em Java

Este é um mini-projeto desenvolvido em Java focado em aplicar os conceitos fundamentais da **Programação Orientada a Objetos (POO)**. 

O sistema simula a criação e movimentação de uma conta bancária através do console (terminal).

## 🚀 Tecnologias e Conceitos Aplicados
- **Java Puro (Console)**
- **Encapsulamento:** Proteção do saldo e número da conta (impedindo alterações indevidas usando getters controlados e ausência de setters).
- **Sobrecarga de Construtores (Overloading):** Opção de instanciar uma conta com ou sem depósito inicial.
- **Regras de Negócio:** 
  - O saldo só pode ser modificado através de operações de saque e depósito.
  - O sistema aplica uma taxa fixa de $5.00 a cada saque realizado.
  - A conta aceita saldo negativo (limite/cheque especial).

## 💻 Como o sistema funciona
1. O usuário informa o número da conta e o nome do titular.
2. O sistema pergunta se haverá um depósito inicial.
3. Após a criação, o usuário pode realizar simulações de depósitos e saques, onde o sistema recalcula e exibe o saldo atualizado respeitando as taxas bancárias.
