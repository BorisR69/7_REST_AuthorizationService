FROM openjdk:8-jdk-alpine

EXPOSE EXPOSE 8080

COPY target/AuthorizationService-0.0.1-SNAPSHOT.jar authorization.jar

CMD ["java", "-jar", "authorization.jar"]