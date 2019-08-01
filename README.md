# age-api

This is an API which perform CRUD operations on a Exam resource.
Some technologies used in this application:

- JSE 8
- Struts 2
- JAX-RS
- JDBC
- H2 Database Engine
- Jetty
- Maven
- Log4j
- FlywayDb
- JSP

# Building

Just execute the command: 

```bash
mvn clean install
```

# Running the application

You can run/deploy this application with the maven command:

```bash
mvn jetty:run
```

The application is deployed by default at : http://localhost:8080/basic-struts/index.jsp

###### Database:

The H2 database is automatically deployed by default at: http://localhost:8082/login.do

- Driver Class: org.h2.Driver
- JDBC URL: jdbc:h2:mem:products
- Login: sa
- Password:






