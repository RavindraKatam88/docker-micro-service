FROM openjdk:8-jdk-alpine
WORKDIR /api-gateway
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} api-gateway.jar
EXPOSE 8485
ENTRYPOINT ["java", "-jar", "api-gateway.jar"]
