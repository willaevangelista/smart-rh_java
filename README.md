# 📌 Projeto SmartRH - Sistema de Cadastro de Colaboradores

O projeto **SmartRH** é uma aplicação backend desenvolvida com o **Spring Framework**. O principal objetivo desse sistema é criar uma **API CRUD** para gerenciar colaboradores de uma empresa, utilizando boas práticas de desenvolvimento e **arquitetura em camadas** (*Model, Repository, Controller*).

******

<div align='center'/>

  ![Java](https://a11ybadges.com/badge?logo=java)
  ![Spring](https://a11ybadges.com/badge?logo=spring)
  ![MySQL](https://a11ybadges.com/badge?logo=mysql)
  ![Insomnia](https://a11ybadges.com/badge?logo=insomnia)
</div>


******

## 📖 Tabela de Conteúdo
- [💡 Conhecimentos Mobilizados](#conhecimentosMobilizados)
- [🏗️ Estrutura do Projeto](#estruturaDoProjeto)
- [📂 Código Desenvolvido](#codigoDesenvolvido)
- [🛠️ Tecnologias Utilizadas](#tecnologiasUtilizadas)

---

<div id='conhecimentosMobilizados'/> 

## 💡 Conhecimentos Mobilizados

- **Spring Framework**: Utilização do **Spring Boot** para a construção de **APIs RESTful**, garantindo boas práticas de desenvolvimento.
- **JPA e Hibernate**: Mapeamento **objeto-relacional** para interação com o banco de dados **MySQL**.
- **Padrões de Projeto**: Implementação da **arquitetura em camadas** (*Model, Repository, Controller*) para melhor organização do código.
- **Banco de Dados**: Criação e configuração do banco de dados **MySQL**, utilizando **Spring Data JPA** para a persistência dos dados.
- **RESTful API**: Desenvolvimento de endpoints para manipulação dos colaboradores, permitindo operações **CRUD**.

---

<div id='estruturaDoProjeto'/> 

## 🏗️ Estrutura do Projeto

```
smartrh/
├── controller/
│   └── ColaboradorController.java
├── model/
│   └── Colaborador.java
├── repository/
│   └── ColaboradorRepository.java
├── resources/
│   └── application.properties
└── SmartRHApplication.java
```

<div id='codigoDesenvolvido'/> 

## 📂 Código Desenvolvido

Para melhor visualização, aqui estão os códigos principais:

- **`ColaboradorController`**: Controlador responsável pela manipulação dos colaboradores. Implementa métodos como `getAll()`, `getById()`, `create()`, `update()` e `delete()`.  
- **`Colaborador`**: Modelo que representa a entidade de um colaborador no banco de dados. Inclui atributos como `id`, `nome`, `cargo`, `salario`, entre outros.  
- **`ColaboradorRepository`**: Interface que estende `JpaRepository`, permitindo a comunicação com o banco de dados **MySQL**.  
- **`application.properties`**: Arquivo de configuração que define a conexão com o banco de dados **MySQL**, incluindo o nome do banco (`db_colaboradores`) e outras propriedades do **Spring**.  
- **`SmartRHApplication`**: Classe principal que inicializa a aplicação **Spring Boot**.  

---

<div id='tecnologiasUtilizadas'/> 

## 🛠️ Tecnologias Utilizadas

- **Linguagem**: Java  
- **Framework**: Spring Boot  
- **Banco de Dados**: MySQL  
- **JPA/Hibernate**: Para persistência de dados  
- **IDE utilizada**: Spring Tools Suite (STS) ou IntelliJ IDEA  
- **Ferramenta de Testes**: Insomnia ou Postman  
