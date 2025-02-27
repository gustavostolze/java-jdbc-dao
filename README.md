## JDBC Api com Padrão de projeto DAO (Data Access Object)
### Referências:
- https://www.devmedia.com.br/dao-pattern-persistencia-de-dados-utilizando-o-padrao-dao/30999
- https://www.oracle.com/technetwork/java/dataaccessobject-138824.html
### Ideia geral do padrão DAO:
- Para cada entidade, haverá um objeto responsável por fazer acesso a dados relacionado a esta
entidade. Por exemplo:
  - Cliente: ClienteDao
  - Produto: ProdutoDao
  - Pedido: PedidoDao
- Cada DAO será definido por uma interface.
- A injeção de dependência pode ser feita por meio do padrão de projeto Factory

![image](https://github.com/user-attachments/assets/aebd53ec-eafa-4772-9e7c-c2786d4fe838)

Créditos ao conteúdo e imagens: https://devsuperior.com.br/ / Prof. Dr. Nelio Alves - Curso Udemy
