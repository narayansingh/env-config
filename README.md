# env-config
This is a Spring Boot based web application, which uses Spring MVC with Thymeleaf for view.

## Setup the database

* Login to MYSQL as root user
> mysql -h localhost -u root -p

* Create Database and user
> env-config/src/main/resources/database/create-db.sql

* Create tables
> env-config/src/main/resources/database/ddl.sql

## Run the app
Application can be started in multiple ways-

* To Build and run together using Gradle 
> $ *./gradlew bootRun*

* To Build and launch as an standalone java app
> $ *./gradlew build*
> $ *java -jar build/libs/env-config-0.0.1.jar*

## References
* http://www.thymeleaf.org/doc/tutorials/2.1/thymeleafspring.html
* https://springframework.guru/spring-boot-web-application-part-2-using-thymeleaf/


# Stories

## Capture Project details


# TODO
- [x] Integrate with MySQL using Spring JPA
- [ ] Move database scripts to Liquibase
- [ ] Add tests
- [ ] Document stories

