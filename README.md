# Parking-Control
API de controle de estacionamento
Esta é uma API de controle de estacionamento que fornece as operações básicas de CRUD (Create, Read, Update, Delete), incluindo os métodos FindAll, FindById, Post, Delete e Put.



#Tecnologias Utilizadas
- Spring Framework, incluindo Inversão de Controle e Injeção de Dependências
- Spring Data JPA
- Spring Validation
- DevTools
- H2 Database
 
# Padrões de projeto utilizados
  Esta API utiliza os seguintes padrões de projeto:

   - Strategy: para definir diferentes estratégias de cálculo de taxas de estacionamento, tornando-os intercambiáveis para utilização.
   - Singleton: para garantir que apenas uma única instância da classe "ParkingFeeCalculator" seja criada e gerenciada em toda a aplicação.

 A implementação desses padrões torna o código mais modular, flexível e fácil de manter.
 
 
# Como executar a aplicação
1 - Clone este repositório para a sua máquina local
2 - Certifique-se de ter o Java 11 ou superior instalado em seu sistema
3 - Abra um terminal e navegue até o diretório raiz do projeto
4 - Execute o seguinte comando para compilar e executar a aplicação:

./mvnw spring-boot:run

5 - Acesse a API através do seguinte endpoint:

http://localhost:8081/





 
  

