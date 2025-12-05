#                                                                                            Projeto MindMove

<img src="https://ik.imagekit.io/kv6tr431r/Projeto%20mindmove/LongoMindMoveSemfundo.png?updatedAt=1761756153500" alt="LogoMindMove" style="zoom: 25%;" />

------------------------------------------------------------------------

##  1. Descrição

Este projeto é uma aplicação desenvolvida em **Java com Spring Boot**.

O objetivo é fornecer uma **API REST** voltada ao bem-estar de pessoas **neurodivergentes**, como aquelas com **TDAH, autismo, ansiedade ou altas habilidades**. A aplicação busca **estimular o equilíbrio entre corpo e mente** por meio de atividades físicas leves e acessíveis, que ajudam a **melhorar o foco, reduzir a sobrecarga mental e promover a autoconfiança**.

Ela permite **organizar, cadastrar e relacionar categorias com múltiplos exercícios**, tornando possível criar **rotinas personalizadas** de acordo com as necessidades e preferências de cada usuário.

------------------------------------------------------------------------

## 2. Funcionalidades

-  **Gerenciamento de usuários:** cadastro, autenticação e atualização de perfis.
-  **Rotinas de atividade:** criação, listagem e personalização de treinos e práticas de movimento.
-  **Integração flexível:** pode ser utilizada em ambientes domésticos, escolares ou clínicos.
-  **Segurança JWT:** autenticação e autorização protegidas por **JSON Web Token**.

------------------------------------------------------------------------

## 3.​​ Diagrama de classes

 <img src="https://ik.imagekit.io/kv6tr431r/Projeto%20mindmove/Tabelas%20relacionais/Design%20sem%20nome%20(3).png?updatedAt=1761756778852" alt="Digrama de classes" style="zoom: 40%;">

## 

------------------------------------------------------------------------

## 4. Diagrama Entidade-Relacionamento (DER)

​    <img src="https://ik.imagekit.io/kv6tr431r/Projeto%20mindmove/Tabelas%20relacionais/DERMindMove.png?updatedAt=1761754821968" alt="DER" style="zoom: 40%;" />

------------------------------------------------------------------------

##  5. Instruções de Uso

###  Pré-requisitos

-   Java 17+
-   Maven ou Gradle
-   Docker (opcional para banco de dados)
-   Git

------------------------------------------------------------------------

##  6. Configuração e Execução

- O projeto é baseado em Maven e utiliza o Spring Boot.

  1. **Clone o repositório:**

     ```
     git clone https://github.com/TechBloom-GrupoE/MindMove_backend.git
     ```

     

  2. **Configurar o Banco de Dados (MySQL):**

     - Crie um banco de dados vazio chamado `MindMove` no seu MySQL.

     - Edite o arquivo

        

       ```
       src/main/resources/application.properties
       ```

        

       com as suas credenciais de conexão:

       ```
       spring.datasource.url=jdbc:mysql://localhost:3306/db_MindMove?createDatabaseIfNotExist=true&useSSL=false&serverTimezone=UTC
       spring.datasource.username=seu_usuario_mysql
       spring.datasource.password=sua_senha_mysql
       # O JPA criará as tabelas e relacionamentos automaticamente:
       spring.jpa.hibernate.ddl-auto=update
       ```

       

  3. **Execute a aplicação:**

     - Via Maven:

       ```
       ./mvnw spring-boot:run
       ```

       

     - **Via IDE:** Execute a classe principal do Spring Boot (`MindMoveApplication.java`).

  A API estará rodando em **`http://localhost:8080`**. Use o **Insomnia** ou Postman para testar os *endpoints*.

  | Endpoint             | Descrição                 | Exemplo de Teste                                         |
  | -------------------- | ------------------------- | -------------------------------------------------------- |
  | **CRUD Completo**    | Exercicios                | `POST http://localhost:8080/exercicios`                  |
  | **Cadastro**         | `Usuários` (cadastro)     | `POST http://localhost:8080/usuarios/cadastrar`          |
  | **Cadastro**         | `Usuários` (Login/Acesso) | `POST http://localhost:8080/usuarios/logar`              |
  | **Busca Específica** | Nome exercicio            | `GET http://localhost:8080/exercicios/nome/{nome}`       |
  | **Func. Especial**   | Cálculo de IMC            | `POST http://localhost:8080/usuarios/calcularIMC/{id}`** |



------------------------------------------------------------------------

##  7. Tecnologias 

<img src="https://ik.imagekit.io/kv6tr431r/Projeto%20mindmove/Logo%20tecnologias/Java.png?updatedAt=1761675033758" alt="Java" style="zoom: 30%;" /><img src="https://ik.imagekit.io/kv6tr431r/Projeto%20mindmove/Logo%20tecnologias/Swagger.png?updatedAt=1761675033706" alt="Swegger" style="zoom:33%;" /><img src="https://ik.imagekit.io/kv6tr431r/Projeto%20mindmove/Logo%20tecnologias/Tomcat.png?updatedAt=1761675033867" alt="Tomcat" style="zoom:30%;" /><img src="https://ik.imagekit.io/kv6tr431r/Projeto%20mindmove/Logo%20tecnologias/Spring.png?updatedAt=1761675033777" alt="Spring" style="zoom:30%;" /><img src="https://ik.imagekit.io/kv6tr431r/Projeto%20mindmove/Logo%20tecnologias/Insomnia.png?updatedAt=1761675033935" alt="Insominia" style="zoom:30%;" /><img src="https://ik.imagekit.io/kv6tr431r/Projeto%20mindmove/Logo%20tecnologias/JPA.png?updatedAt=1761675033771" alt="JPA" style="zoom:30%;" /><img src="https://ik.imagekit.io/kv6tr431r/Projeto%20mindmove/Logo%20tecnologias/Neon.png?updatedAt=1761675033858" alt="Neon.tech" style="zoom:30%;" /><img src="https://ik.imagekit.io/kv6tr431r/Projeto%20mindmove/Logo%20tecnologias/Render.png?updatedAt=1761675033701" alt="Render" style="zoom:30%;" /><img src="https://ik.imagekit.io/kv6tr431r/Projeto%20mindmove/Logo%20tecnologias/MySQL.png?updatedAt=1761675033438" alt="MySQL" style="zoom:30%;" />

------------------------------------------------------------------------

##  8. Contribuições

Este repositório é parte de um projeto educacional, mas contribuições são sempre bem-vindas! Caso tenha sugestões, correções ou melhorias, fique à vontade para:

- Criar uma **issue**
- Enviar um **pull request**
- Compartilhar com colegas que estejam aprendendo Java!

------------------------------------------------------------------------

## 9. Documentação do projeto

- [**Documentação do Projeto**](https://drive.google.com/drive/folders/1DSTZ3G2qPNffPlfkFCbt88tUvsa1rdXe?usp=sharing) 

------------------------------------------------------------------------

## 10. Contatos

- Desenvolvido por [**Equipe Techblom**](https://github.com/TechBloom-GrupoE) Para dúvidas, sugestões ou colaborações, entre em contato via GitHub ou abra uma issue!

- Integrantes da equipe: 

   [**Andressa**](https://github.com/andressafunes)                  [**Bianca**](https://github.com/bianca-msilva)                  [**Geovana**](https://github.com/sgeo21)                  [**Priscila**](https://github.com/PriscilaMrozinski)       

   ​                  [**Rayssa**](https://github.com/Rayssa-Ferraz)                  [**Sofia**](https://github.com/sofia-araujo)                            [**Thuany**](https://github.com/ThuanyAline)