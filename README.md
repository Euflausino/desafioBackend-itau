<h1 align="center">
  TODO List
</h1>

API para gerenciar transações que faz parte [desse desafio](https://github.com/feltex/desafio-itau-backend) para pessoas desenvolvedoras backend júnior.

## Tecnologias

- [Spring Boot](https://spring.io/projects/spring-boot)
- [Spring MVC](https://docs.spring.io/spring-framework/reference/web/webmvc.html)
- [Spring Validation](https://spring.io/guides/gs/validating-form-input)

## Práticas adotadas

- SOLID
- API REST
- Injeção de Dependências
- Tratamento de respostas de erro

## Como Executar

- Clonar repositório git
- Construir o projeto:
```
$ ./mvnw clean package
```
- Executar a aplicação:
```
$ java -jar target/desafio-backend-it-0.0.1-SNAPSHOT.jar
```

A API poderá ser acessada em [localhost:8080](http://localhost:8080).

## API Endpoints

Para fazer as requisições HTTP abaixo, foi utilizada a ferramenta [httpie](https://httpie.io):

- Criar Transação
```
$ http POST :8080/transacao valor=123.45 dataHora="2020-08-07T12:34:56.789-03:00"

[
  {
    "valor": 123.45,
    "dataHora": "2020-08-07T12:34:56.789-03:00"
  }
]
```

- Mostrar Estatísticas
```
$ http GET :8080/estatistica

[
  {
    "count": 10,
    "sum": 1234.56,
    "avg": 123.456,
    "min": 12.34,
    "max": 123.56
  }
]
```



- Remover Tarefa
```
http DELETE :8080/transacao

[ ]
```
