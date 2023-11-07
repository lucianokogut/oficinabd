# Projeto da Oficina de Banco de Dados

O objetivo deste projeto é apresentar a forma de desenvolvimento de uma estrutura hierárquica de camadas, tendo por base a arquitetura MVC.

## 🎯 Índice

- [Visão Geral](#-índice)
- [Tecnologias Utilizadas](#-tecnologias-utilizadas)
- [Hierarquia de Pacotes](#hierarquia-de-pacotes)
- [Contribuição](#🤝-contribuição)

---

## 🌐 Visão Geral

Este projeto foi desenvolvido com base na Oficina de BD do professor Adriano de Melo que leciona na instituição. Com a evolução projeto o intuito é demonstrar na prática para nossos alunos, o que, como e com quais ferramentas podemos implementar projetos Java.

- [Visão Geral](#-índice)
---

## 🛠 Tecnologias Utilizadas

* Java 17
* Maven
* Hierarquia de Pacotes
* Arquitetura MVC

|LOGO           |STACK                              |FUNÇÃO                       |
|---------------|-----------------------------------|-----------------------------|
| ![Java 17](assets/java-logo-icon.png) | `Java 17` | Linguagem de programação escolhida para o desenvolvimento do Back-end da aplicação |
| ![Maven](assets/apache-maven-icon.png) | `Maven 4.0` | Ferramenta de gerenciamento para o build de código-fonte (construção dos artefatos para sua execução), pois padroniza o gerenciamento de dependências, execução dos testes, build e deploy da aplicação |
| ![Package Hierarchy](assets/img-hierarquia.png)  | `Hierarquia de Pacotes` | Organização dos diretórios (pastas do projeto) dentro de responsabilidades específicas para cada uma das entidades implementadas |

- [Visão Geral](#-índice)
---

## Hierarquia de Pacotes

Conceito relacionado ao conjunto de classes localizadas na mesma estrutura hierárquica de diretórios, geralmente agrupadas em pacotes comuns entre si, com o propósito de facilitar a reutilização de código.

```shell
.
└── OFICINABD/
    ├── src/
    │   ├── main/
    │   │   └── java/br/com/lucianokogut/
    │   │       ├── controller
    │   │       ├── model
    │   │       │   ├── bo
    │   │       │   ├── dao
    │   │       │   └── vo
    │   │       ├── view
    │   │       ├── Main.java
    │   │       └── TodolistApplication.java
    │   └── test
    ├── Dockerfile
    ├── pom.xml
    └── README.md
```

Fonte: https://tree.nathanfriend.io/

- [Visão Geral](#-índice)
---

## 🤝 Contribuição

Estamos dispostos a ouvir suas sugestões para o andamento das aulas e a interdisciplinariedade do curso.

Tendo alguma outra demanda, entre em contato com os professores Adriano ou Luciano.

[Adriano](adriano.melo@prof.sc.senac.br)
[Luciano](luciano.kogut@prof.sc.senac.br)

- [Visão Geral](#-índice)
---