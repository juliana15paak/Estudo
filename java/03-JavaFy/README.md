# 🎧 JavaFy - Plataforma de Streaming

Core de uma aplicação de áudio que gerencia Músicas e Podcasts, aplicando conceitos de abstração para generalizar comportamentos multimídia.

## 🎯 Objetivos de Aprendizagem
* **Classes Abstratas:** Uso da classe `Audio` como molde para diferentes tipos de mídia.
* **Encapsulamento:** Proteção de atributos sensíveis com Getters e Setters.
* **Enums de Conversão:** Transformação de String ("PREMIUM") para Objetos Enum (`Plano.PREMIUM`).

## 📦 Estrutura

* `Reproduzivel` (Interface): Garante que tudo pode ser "tocado".
* `Audio` (Abstract): Define que todo áudio tem título e duração.
* `Musica` & `Podcast`: Especializações com atributos únicos (Artista vs Host).