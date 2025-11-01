# playstation-vendas
## Este projeto trata-se de um treinamento prático de desenvolvimento utilizando Java Spring Boot + MySql

Tecnologias utilizadas: Java 21 | Spring Boot | MySql WorkBench

### Construção do Banco de dados [100 linhas]
1. Por meio do website https://www.kaggle.com/, fiz o download do dataset de vendas de jogos dos consoles Playstation 3 e Playstation 4.
2. Fiz o tratamento de dados utilizando o PowerQuery reduzindo de 17 para 11 colunas a fim de otimizar a conclusão do projeto.
3. Importação do arquivo .csv para a tabela criada no Mysql Workbench

### Configuração Spring Boot:
Dependências adicionadas: Spring Data JPA | MySQL Driver | Spring Web | Lombock (para otimização dos getters e setters)

Após baixar o arquivo, já com o banco de dados criado, no arquivo application.properties adicione o seguinte texto:
   spring.application.name=PlaystationSales
   spring.jpa.hibernate.ddl-auto=update
   spring.datasource.url=jdbc:mysql://localhost:3306/"O NOME DO SEU BANCO DE DADOS - SEM ASPAS"
   spring.datasource.username="NOME DE USUÁRIO"
   spring.datasource.password="SENHA"
   spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
   spring.jpa.show-sql: true

### Criação da Classe/Entidade:

Crie uma pasta a nomeie como "model" ou "entity" e crie a classe que ira representar uma entidade/usuáro/dado do banco de dados que você criou

Importante que todos os atributos da classe correspondam às colunas criadas na tabela do seu banco de dados.


   

