FROM openjdk:18
EXPOSE 8080
COPY ./target/spring-boot-docker.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]