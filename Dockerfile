FROM maven:3.8.6-openjdk-18 AS build
COPY . .
RUN mvn clean package -DskipTests

FROM openjdk:18-alpine
COPY --from=build /target/spring-boot-docker.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","app.jar"]