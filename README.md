# Appflix Database Connection

## Descrição

O projeto **Appflix** é uma aplicação Java que estabelece uma conexão com um banco de dados MySQL. Ele foi desenvolvido utilizando o Maven para gerenciar suas dependências e o `mysql-connector-java` para conectar-se ao banco de dados.

## Estrutura do Projeto

A classe `ModelConnection` é responsável por gerenciar a conexão com o banco de dados MySQL. Ela fornece métodos para obter e fechar a conexão de maneira segura.

## Arquivo POM

O arquivo `pom.xml` é utilizado pelo Maven para gerenciar as dependências e configurar plugins para o projeto.

## Instruções de Uso

### Requisitos

- JDK 8 ou superior
- Maven 3.6.3 ou superior
- MySQL 5.7 ou superior

### Configuração do Banco de Dados

1. Instale e configure o MySQL.
2. Crie um banco de dados chamado `appflix_db`.
3. Configure as credenciais do banco de dados (usuário e senha) no arquivo `ModelConnection.java`:
    ```java
    private static final String USER = "root";
    private static final String PASSWORD = "senha";
    ```

### Compilação e Execução

1. Navegue até o diretório do projeto.
2. Compile o projeto utilizando o Maven:
    ```sh
    mvn clean package
    ```
3. Execute o projeto:
    ```sh
    java -jar target/prg-appflix-database-0.0.1-SNAPSHOT.jar
    ```

## Contribuição

Sinta-se à vontade para contribuir com este projeto. Faça um fork do repositório, crie uma branch para sua feature ou correção e envie um pull request.

## Licença

Este projeto está licenciado sob a Licença MIT. Consulte o arquivo `LICENSE` para mais informações.
