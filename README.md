<div align='center', id='topo'/>

# Projeto SmartRH
## Sistema de Cadastro de Colaboradores

</div>

![Descrição da imagem](https://raw.githubusercontent.com/willaevangelista/smart-rh_java/main/src/main/resources/img/SmartRH.png)

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
- [🤝 Desenvolvedoras do Projeto](#devas)

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
- **IDE utilizada**: Spring Tools Suite (STS)
- **Ferramenta de Testes**: Insomnia

---

<div id='devas'/> 
  
## 🤝 Desenvolvedoras do Projeto

Este projeto foi possível graças às contribuições das seguintes desenvolvedoras:

<div align="center">
  <table>
    <tr>
      <td align="center">
        <a href="https://www.linkedin.com/in/larissa-mata-a32a5a104/" title="Linkedin da Larissa Mata">
          <img src="https://media.licdn.com/dms/image/v2/D4D03AQH8ZGW05SThzA/profile-displayphoto-shrink_400_400/profile-displayphoto-shrink_400_400/0/1698075416577?e=1747267200&v=beta&t=MZQra9MZhtWWZqrZx6Re7loE6-KZIhHj9kj5Rbxe_Ds" width="100px;" alt="Foto da Larissa Mata"/><br>
          <sub>
            <b>Larissa Mata</b>
          </sub>
        </a>
      </td>
      <td align="center">
        <a href="https://www.linkedin.com/in/elianempontes/" title="Linkedin da Eliane Medeiros">
          <img src="https://media.licdn.com/dms/image/v2/D4D03AQGppzwuto4Skw/profile-displayphoto-shrink_400_400/B4DZOzMU5sHUAg-/0/1733878173890?e=1747267200&v=beta&t=dYk2XBvZ6Be-J99J4sp9kljf2TF3ZZ5YZ8lEu72U7oA" width="100px;" alt="Foto da Eliane Medeiros"/><br>
          <sub>
            <b>Eliane Medeiros</b>
          </sub>
        </a>
      </td>
      <td align="center">
        <a href="https://github.com/willaevangelista" title="GitHub da Willa Evangelista">
          <img src="https://avatars.githubusercontent.com/u/84138876?v=4" width="100px;" alt="Foto da Willa Evangelista"/><br>
          <sub>
            <b>Willa Evangelista</b>
          </sub>
        </a>
      </td>
    </tr>
    <tr>
      <td align="center">
        <a href="https://www.linkedin.com/in/larissa-alves-s/" title="Linkedin da Larissa Alves">
          <img src="https://media.licdn.com/dms/image/v2/D4D03AQFZaBaC-aUVow/profile-displayphoto-shrink_400_400/B4DZSqh72uHYAg-/0/1738027811288?e=1747267200&v=beta&t=6DM_y3QMq47Kb_qSkOcxjFlPsaBcqwZ_0JxLYxL1Bm8" width="100px;" alt="Foto da Larissa Alves"/><br>
          <sub>
            <b>Larissa Alves</b>
          </sub>
        </a>
      </td>
      <td align="center">
        <a href="https://github.com/MariPimentelCarmo" title="GitHub da Mariana Carmo">
          <img src="https://avatars.githubusercontent.com/u/99743029?v=4" width="100px;" alt="Foto da Mariana Carmo"/><br>
          <sub>
            <b>Mariana Carmo</b>
          </sub>
        </a>
      </td>
      <td align="center">
        <a href="https://github.com/fernandafclg" title="GitHub da Fernanda Pereira">
          <img src="https://avatars.githubusercontent.com/u/180988235?v=4" width="100px;" alt="Foto da Fernanda Pereira"/><br>
          <sub>
            <b>Fernanda Pereira</b>
          </sub>
        </a>
      </td>
    </tr>
  </table>
</div>

<div align='right'>
  
  [Voltar ao topo ⬆️](#topo)

</div>
