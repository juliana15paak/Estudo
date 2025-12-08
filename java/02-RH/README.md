# 💼 Sistema de Gestão de Funcionários

Simulação de um sistema de Recursos Humanos focada em controle de acesso e bonificações, utilizando hierarquia de classes.

## 🚀 Funcionalidades
* **Controle de Acesso:** Implementação da interface `AcessoRestrito` para cargos de confiança (Gerente).
* **Bonificação Estática:** Uso de constantes `static final` para definir regras de negócio globais.
* **Conversão de Dados:** Tratamento de entrada de senha (String para int).

## 🛠️ Tecnologias
* Java
* Interfaces e Implementação
* Modificadores `static` e `final`

## 🧩 Snippet: Validação de Acesso
A classe `Gerente` herda características de `Funcionario` mas implementa um contrato de segurança específico.