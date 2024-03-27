FROM openjdk:18
ARG JAR_FILE=target/*.jar
COPY ./target/spring-boot-docker.jar app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]