# Sistema de Gerenciamento de Biblioteca 📚

Este é um projeto desenvolvido em Java para consolidar conceitos fundamentais da Programação Orientada a Objetos (POO) e a manipulação de estruturas de dados dinâmicas.

## 🚀 Conceitos de POO Aplicados
* **Abstração e Herança:** Criação da classe abstrata `Publicacao` que serve como base para o reaproveitamento de código nas subclasses `Livro` e `Revista`.
* **Encapsulamento:** Proteção dos dados dos itens utilizando modificadores de acesso privados e métodos de validação para alterar o estado das variáveis.
* **Polimorfismo:** Manipulação genérica de diferentes tipos de publicações dentro de uma única coleção.

## 🛠️ Funcionalidades do Sistema
O sistema simula o funcionamento real de uma biblioteca através da classe `Biblioteca`:
1. **Adicionar Itens:** Permite inserir novos livros e revistas ao acervo.
2. **Emprestar Item:** Busca o item pelo nome, verifica se ele está disponível e altera seu status para emprestado (evitando empréstimos duplicados).
3. **Devolver Item:** Altera o status do item de volta para disponível.
4. **Mostrar Acervo:** Lista todas as publicações cadastradas e seus respectivos status de disponibilidade em tempo real.

## 💻 Tecnologias Utilizadas
* **Java** (JDK 17 ou superior)
* **IntelliJ IDEA** (Ambiente de Desenvolvimento)
* **Git e GitHub** (Controle de Versão)
