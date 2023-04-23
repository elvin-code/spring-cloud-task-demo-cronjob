# springboot- Spring Cloud Task Demo CronJob

Minimal [Spring Cloud Task](https://docs.spring.io/spring-cloud-task/docs/current/reference/html/#getting-started) sample app.

## Requirements

For building and running the application you need:

- [JDK 17](https://www.oracle.com/java/technologies/downloads/#java17)
- [Maven 3](https://maven.apache.org)

To manually initialize the project:

Navigate to https://start.spring.io. This service pulls in all the dependencies you need for an application and does most of the setup for you.

Choose Maven and the language you want to use. This guide assumes that you chose Java.

Click Dependencies and select Task, MySQL Driver, Spring Data JPA, Lombok and Spring Configuration Processor.

Click Generate.

Download the resulting ZIP file, which is an archive of a task application that is configured with your choices.


## Running the application locally

There are several ways to run a Spring Boot application on your local machine. One way is to execute the `main` method in the `com.example.demotask.DemotaskApplication` class from your IDE.

Alternatively you can use the [Spring Boot Maven plugin](https://docs.spring.io/spring-boot/docs/current/reference/html/build-tool-plugins-maven-plugin.html) like so:

```shell
mvn spring-boot:run
```
