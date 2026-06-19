# Café Aroma & Sabor

Sistema de gerenciamento para cafeteria desenvolvido com **Spring Boot 3.2.5** e **Java 17**.

## Funcionalidades

### Autenticação
- Login com Spring Security e usuários em memória
- Dois perfis de acesso: `admin` e `user`
- Logout com sessão segura via POST

### Produtos (CRUD completo)
- **Listagem** — visualização de todos os produtos cadastrados
- **Cadastro** — formulário para registrar novos produtos (nome, preço, quantidade)
- **Alteração** — edição de dados de produtos existentes
- **Exclusão** — remoção de produtos com confirmação

### Estoque
- **Movimentação** — registro de entrada e saída de produtos
- Tipos de movimentação: entrada e saída
- Controle de data da movimentação

## Tecnologias

| Tecnologia | Versão |
|------------|--------|
| Java | 17 |
| Spring Boot | 3.2.5 |
| Spring Security | 6.x |
| Spring Data JPA | 3.x |
| Thymeleaf | 3.x |
| MySQL | 8.x |
| Maven | 3.x |

## Usuários do Sistema

| Usuário | Senha | Perfil |
|---------|-------|--------|
| `admin` | `admin123` | ADMIN |
| `user` | `user123` | USER |

## Estrutura do Projeto

```
src/main/java/sp/senai/br/cafe/
├── CafeApplication.java
├── config/
│   └── SecurityConfig.java
├── Controller/
│   ├── HomeController.java
│   ├── LoginController.java
│   ├── ProdutoController.java
│   └── EstoqueController.java
├── Model/
│   ├── Produto.java
│   ├── Usuario.java
│   └── Movimentacao.java
└── Repository/
    ├── ProdutoRepository.java
    ├── UsuarioRepository.java
    └── MovimentacaoRepository.java

src/main/resources/templates/
├── home.html
├── login.html
├── produto/
│   ├── listagem.html
│   ├── form-inserir.html
│   └── form-alterar.html
└── estoque/
    └── movimentacao.html
```

## Como executar

1. Certifique-se de ter o MySQL rodando na porta 3306
2. Crie o banco de dados `cafearoma` (ou deixe o JPA criar automaticamente)
3. Configure as credenciais do MySQL em `application.properties`
4. Execute:
   ```bash
   mvn spring-boot:run
   ```
5. Acesse: `http://localhost:8080/login`

## Alunos

- Fernando Brandão
