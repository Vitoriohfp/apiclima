# Projeto A3 Erico - API
# Sistema de Monitoramento de Clima em Tempo Real

# Sobre o projeto

# Este projeto é uma API em Java para monitoramento de clima em tempo real, que coleta dados climáticos de várias fontes e fornece atualizações assíncronas para os usuários.

# Funcionalidades
- Coleta de Dados Climáticos
- Atualizações em Tempo Real
- Suporte a Múltiplas Localizações
- Histórico de Dados Climáticos

# Tecnologias utilizadas
## Back end
- Java
- Spring Boot
- RabbitMQ
- PostgreSQL
- Maven
- APIs de Clima
 # Front end
- Reactjs

Estrutura do codigo

├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── com/projeto/clima/           # Pacote principal
│   │   │   ├── controller/                  # Controladores da API
│   │   │   ├── service/                     # Serviços para integração com APIs externas
│   │   │   ├── model/                       # Modelos de dados
│   │   │   ├── config/                      # Configurações e propriedades
│   │   └── resources/
│   │       ├── application.properties       # Configurações do Spring Boot
├── README.md                                # Documentação do projeto
├── pom.xml                                  # Dependências Maven

# Como executar o projeto

## Back end
pré-requisitos: Java

```bash
# clonar repositório
git clone https://github.com/seu-usuario/sistema-monitoramento-clima-java.git

cd sistema-monitoramento-clima-java
Configure as variáveis de ambiente ou edite o arquivo em application.properties com suas credenciais de API e configurações do banco de dados.

Compile e execute o projeto:
-/mvnw spring-boot:run
```

## Como usar

Execute o comando:
```bash
npm start
```
Acesse em: http://application.properties/

Rotas de Clima:
- GET /api/clima/localizacao
- POST /api/clima/inscricao
- 
 Contribuição







