# 🔥🍃💧 Pokémon Battle Engine

Motor de batalha simples que calcula danos baseados em vantagens elementais, demonstrando os **Enums Parametrizados**.

## 🧠 Lógica do Projeto
Ao invés de usar `if/else` espalhados pelo código principal, a lógica de vantagem e desvantagem foi encapsulada dentro do próprio Enum `Tipo`.

* **FOGO:** Vantagem contra Planta.
* **ÁGUA:** Vantagem contra Fogo.
* **PLANTA:** Vantagem contra Água.
* **ELÉTRICO:** Vantagem contra Água.

## ⚔️ Cálculo de Dano
O método `atacar` verifica dinamicamente a relação entre os tipos:

```java
public double atacar(Pokemon inimigo){
    // Verifica se o tipo do inimigo é igual à vantagem do meu tipo
    if (inimigo.tipo.name().equalsIgnoreCase(this.tipo.getVantagem())){
        return poderAtaque * 2; // Dano Crítico!
    }
    // ... lógica de desvantagem
}