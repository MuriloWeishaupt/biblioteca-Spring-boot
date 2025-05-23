# 📚 Sistema de Gerenciamento de Biblioteca - Back-end

Este é o back-end do **Sistema de Biblioteca**, desenvolvido com **Spring Boot** e **MySQL**. A API RESTful permite o gerenciamento de livros, incluindo cadastro, listagem, edição e remoção, sendo consumida por uma aplicação front-end em React.

---

## 🧰 Tecnologias Utilizadas

- Java 17
- Spring Boot 3.x
- Spring Web
- Spring Data JPA
- MySQL
- Lombok
- Maven

---

## 🗂️ Estrutura do Projeto

     src/
        ├── controller/ # Controladores REST
        ├── model/ # Entidades JPA (Livro, Editora e Autor)
        ├── repository/ # Interfaces de acesso ao banco
        ├── service/ # Regras de negócio
        └── resources/
        ├── application.properties # Configurações de banco e SnakeCase




---

## ⚙️ Configuração

### 1. Banco de Dados

Crie um banco de dados MySQL chamado `biblioteca` (ou outro nome, mas atualize no `application.properties`):

```sql
CREATE DATABASE biblioteca;
```

### 2. Application.properties

Configure com suas credenciais do banco:

    spring.datasource.url=jdbc:mysql://localhost:3306/biblioteca
    spring.datasource.username=SEU_USUARIO
    spring.datasource.password=SUA_SENHA
    spring.jpa.hibernate.ddl-auto=update
    spring.jpa.show-sql=true
    spring.jpa.properties.hibernate.format_sql=true
    spring.jpa.database-platform=org.hibernate.dialect.MySQL8Dialect
    server.port=8080


### 🚀 Como Executar

    Pré-requisitos
    JDK 17 instalado
    
    MySQL em execução
    
    Maven configurado

    # Clonar o repositório
    git clone https://github.com/seu-usuario/sistema-biblioteca.git
    cd sistema-biblioteca/backend
    
    # Rodar o projeto (IDE ou terminal)
    ./mvnw spring-boot:run

    A aplicação estará disponível em:
    👉 http://localhost:8080


### 📚 Documentação da API - Swagger
    Esta aplicação possui uma documentação interativa gerada automaticamente com Swagger via SpringDoc OpenAPI.

    🔗 Acesse aqui:
    📄 http://localhost:8080/swagger-ui/index.html

    (Certifique-se de que a aplicação está rodando localmente para acessar esse link.)

    ✅ O que é possível com a documentação:
    Visualizar todos os endpoints disponíveis
    
    Ver detalhes das requisições e respostas
    
    Testar os endpoints diretamente pelo navegador (sem Postman ou Insomnia)

    📦 Dependência usada:
    
        <dependency>
          <groupId>org.springdoc</groupId>
          <artifactId>springdoc-openapi-starter-webmvc-ui</artifactId>
          <version>2.5.0</version> 
        </dependency>

