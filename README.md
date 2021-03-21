# Playground: GraphQL in Kotlin

Welcome to a simple playground project using [Expedia's Kotlin GraphQL](https://github.com/ExpediaGroup/graphql-kotlin) which is meant to be used with [Springs Webflux](https://docs.spring.io/spring-framework/docs/current/reference/html/web-reactive.html). 

## ⌨️ Usage

Spin up a local mariadb instance via

```
docker run --name mariadb -e "MYSQL_ROOT_PASSWORD=secret" -e MYSQL_DATABASE=db -p 3306:3306 -d mariadb
```

Start the Spring Boot server providing the credentials as arguments on start. Afterwards, navigate to ``localhost:8080/playground`` in your browser. 
You can now start querying the server. 
For example, you can ask for a list of employees and their respective company:

```
{
  employees {
    name
    company {
      name
    }
  }
}
```

## 🔗 Useful Resources

- https://github.com/ExpediaGroup/graphql-kotlin
- https://www.youtube.com/watch?v=7YJyPXjLdug
- https://medium.com/swlh/graphql-kotlin-tutorial-344f5fe0c71a
