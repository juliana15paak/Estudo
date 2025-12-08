# ☕ Fundamentos de POO com Java

Coleção de exercícios práticos focados na sintaxe base e nos pilares da Programação Orientada a Objetos.

## 📚 Conceitos Praticados

| Exercício | Conceitos Chave |
| :--- | :--- |
| **Eletrônicos** | Herança (`extends`), Modificadores (`protected`, `private`), Casting. |
| **Pedágio** | Polimorfismo, Sobrescrita (`@Override`), Uso do `super` em construtores. |
| **Cofre** | Interfaces, Contratos, Conversão de Tipos (`Integer.parseInt`). |
| **Pedido** | Enums simples, Máquina de Estados (Status). |

## 💻 Destaques de Código

### Polimorfismo com `super`
No exercício do Pedágio, aprendemos a chamar a implementação da classe pai antes de adicionar o comportamento específico da filha:

```java
@Override
public void exibirDados(){
    super.exibirDados(); // Reaproveita o código da classe Veiculo
    System.out.println("Fator Desconto: " + fatorDesconto);
}