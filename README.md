# SpringBoot_GreetAPI
A simple GreetAPI exposed as Rest API, built with Java 8 using Spring Boot.

# Requirement
Java 8 and IDE for SpringBoot project

# Build / Execute the project
All Spring Boot applications can be runned in the terminal using the following command ./mvnw spring-boot:run

After that the application can be accessed using the below urls 
http://localhost:8080/greetapi/v1/hello
http://localhost:8080/greetapi/v1/hello?name=Geetha

# Sample request and response
Request : GET http://localhost:8080/greetapi/v1/hello
Response : Hello World !!

Request : GET http://localhost:8080/greetapi/v1/hello?name=Geetha
Response : Hello Geetha !!

# API Documentation
After starting the application the API Documentation with Swagger can be seen here: http://localhost:8080/swagger-ui.html
