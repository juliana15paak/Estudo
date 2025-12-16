# 🧠 Algorithms & CS Fundamentals

![Python](https://img.shields.io/badge/Python-3776AB?style=for-the-badge&logo=python&logoColor=white) ![Logic](https://img.shields.io/badge/Computer_Science-Study-blue?style=for-the-badge)

Este repositório documenta minha jornada de estudos em **Ciência da Computação** e **Lógica de Programação**. O objetivo é fortalecer minha base algorítmica utilizando **Python** como ferramenta de aprendizado, focando em otimização, complexidade e performance matemática.

> "Programação não é sobre a linguagem, é sobre resolver problemas."

---

## 📚 Tópicos Estudados

### 🔢 1. Conversão de Bases (Decimal & Binário)
<details>
  <summary><strong>Ver Teoria e Lógica</strong></summary>
  
  <br>

  Entender bases numéricas é fundamental para compreender como dados são processados em baixo nível.
  
  #### O Conceito
  * **Decimal (Base 10):** Utiliza dígitos de 0 a 9 e potências de 10.
      * Ex: $125 = 1 \times 10^2 + 2 \times 10^1 + 5 \times 10^0$
  * **Binário (Base 2):** Utiliza apenas 0 e 1 e potências de 2.
      * Ex: $1111101_2 = 125_{10}$ (Somando $1 \times 2^6 + 1 \times 2^5...$)

  #### Algoritmo de Conversão (Decimal para Binário)
  Utilizamos o método das divisões sucessivas. Para converter, dividimos o número pela base alvo (2) repetidamente e coletamos os restos.
  
  **Exemplo: Convertendo 125 para Binário**
  | N (Divisão) | Quociente | Resto |
  | :--- | :--- | :--- |
  | 125 / 2 | 62 | **1** |
  | 62 / 2 | 31 | **0** |
  | 31 / 2 | 15 | **1** |
  | 15 / 2 | 7 | **1** |
  | 7 / 2 | 3 | **1** |
  | 3 / 2 | 1 | **1** |
  | 1 / 2 | 0 | **1** |

  > **Resultado:** Lemos os restos de baixo para cima (ou na ordem inversa da coleta): `1111101`.

  [📄 Ver Implementação (baseconversion.py)](./baseconversion.py)
</details>

---

### ⚡ 2. Números Primos: Otimização Matemática
<details>
  <summary><strong>Ver Teoria: De O(n) para O(√n)</strong></summary>
  
  <br>

  Um dos conceitos mais importantes de algoritmos é evitar processamento desnecessário. O teste de primalidade é um exemplo clássico disso.

  #### O Problema
  Um número primo é aquele divisível apenas por 1 e por ele mesmo. Como verificar isso via código de forma performática?

  #### Evolução da Solução
  1.  **Força Bruta (Lento):** Verificar se `n` é divisível por qualquer número entre 2 e `n-1`.
  2.  **Otimização Básica:** Verificar apenas até a metade (`n/2`).
      * *Lógica:* Nenhum número é divisível por algo maior que sua própria metade (exceto ele mesmo).
  3.  **Solução Ótima (Raiz Quadrada):** Verificar apenas até `√n`. 🚀

  #### Por que a Raiz Quadrada funciona?
  Os divisores de um número sempre vêm em pares.
  * Exemplo: Divisores de 36
      * `{1, 36}`, `{2, 18}`, `{3, 12}`, `{4, 9}`, `{6, 6}`.
  
  Note que o "ponto de virada" é o par `{6, 6}`, que é exatamente a raiz quadrada de 36.
  * Se não encontrarmos nenhum divisor até a raiz quadrada, matematicamente é **impossível** existir um divisor depois dela (pois ele precisaria formar par com alguém menor que a raiz, que já teríamos encontrado).

  > **Conclusão:** Para n=1.000.000, em vez de 500.000 verificações, fazemos apenas 1.000.

  [📄 Ver Implementação (primos.py)](./primos.py)
</details>

---

### 🕸️ 3. Crivo de Eratóstenes (Sieve of Eratosthenes)
<details>
  <summary><strong>Ver Teoria: Encontrando múltiplos Primos</strong></summary>
  
  <br>

  Quando precisamos encontrar **todos** os primos até um limite `n`, testar um por um é ineficiente. O Crivo é um algoritmo antigo e brilhante para isso.

  #### O Algoritmo
  A ideia é trabalhar por eliminação, não por verificação.

  1.  Criamos uma lista de booleanos assumindo que todos são primos (`True`).
  2.  Começamos pelo primeiro primo: **2**.
  3.  Marcamos todos os **múltiplos de 2** como `False` (4, 6, 8, 10...). Eles não são primos.
  4.  Vamos para o próximo número que ainda é `True` (**3**) e eliminamos seus múltiplos.
  5.  Repetimos o processo até a raiz quadrada de `n`.

  Os números que permanecerem `True` no final são os primos.

  [📄 Ver Implementação (sieveerastothenes.py)](./sieveerastothenes.py)
</details>

---

### 📐 4. Fatores e Decomposição
<details>
  <summary><strong>Ver Teoria: Fatoração</strong></summary>
  
  <br>

  #### Encontrando Fatores (Divisores)
  Assim como no teste de primalidade, usamos a lógica dos **Co-fatores** para otimizar a busca.
  Ao encontrar um divisor `i`, automaticamente encontramos seu par (`n / i`).
  * Se dividimos 12 por 2 e o resto é 0, sabemos que 2 é fator.
  * O resultado (12 / 2 = 6) também é fator.
  * Adicionamos ambos à lista e economizamos iterações.

  [📄 Ver Implementação (findingfactors.py)](./findingfactors.py)

  #### Fatoração em Primos (Decomposição)
  Qualquer número inteiro pode ser representado como uma multiplicação de números primos (Teorema Fundamental da Aritmética).
  
  * Exemplo: Fatorando 12
      1.  12 / 2 = 6 (Fator: 2)
      2.  6 / 2 = 3 (Fator: 2)
      3.  3 / 3 = 1 (Fator: 3)
      * **Resultado:** $2^2 \times 3^1$
  
  O algoritmo consiste em dividir o número sucessivamente pelos menores primos possíveis até chegar a 1.

  [📄 Ver Implementação (primefactorization.py)](./primefactorization.py)
</details>

---

## 🚀 Como rodar os códigos

Certifique-se de ter o **Python 3+** instalado.

```bash
# 1. Clone o repositório completo
git clone https://github.com/juliana15paak/Estudo.git

# 2. Entre na pasta do repositório
cd Estudo

# 3. Entre na pasta específica de python 
cd python

# 4. Execute um arquivo específico
python3 primos.py
```

Feito com 💜 por Juliana Alves
