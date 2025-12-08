# 🍕 JavaFoods - Sistema de Pedidos e Precificação

Este projeto simula o núcleo de um sistema de delivery, focado na precificação dinâmica de produtos baseada em regras de negócio (tamanho, temperatura, impostos) utilizando conceitos avançados de Orientação a Objetos.

## 🚀 Tecnologias e Conceitos
* **Java (JDK 17+)**
* **POO:** Herança, Polimorfismo, Encapsulamento e Abstração.
* **Interface (`Imprimivel`):** Contratos para saída de dados.
* **Classes Abstratas:** Molde genérico para produtos.
* **Enums (`Tamanho`):** Constantes com atributos e métodos próprios.
* **Static Members:** Controle global de instâncias.

## 📋 Estrutura do Projeto

### Arquitetura
* `Produto` (Abstract): Classe base que mantém o contador estático de produtos e define o contrato de preço.
* `Pizza`: Implementa regra de preço baseada em multiplicadores do Enum `Tamanho`.
* `Refrigerante`: Implementa regra de preço condicional (taxa de refrigeração) e formatação com operador ternário.
* `Imprimivel` (Interface): Garante que todo item vendável tenha uma etiqueta padronizada.

### Regras de Negócio Implementadas
1.  **Pizzas:** O preço varia conforme o fator do tamanho (Pequeno 0.8x, Médio 1.0x, Gigante 1.5x).
2.  **Refrigerantes:** Acréscimo de taxa se o produto for entregue gelado.
3.  **Contador Global:** O sistema rastreia quantos produtos foram instanciados durante a execução.

## 📦 Como executar
1.  Clone este repositório.
2.  Abra o projeto em sua IDE favorita (VS Code, Eclipse, IntelliJ).
3.  Execute a classe `App.java`.

---
Desenvolvido durante estudos de POO para fixação de conceitos de Polimorfismo e Interfaces.
