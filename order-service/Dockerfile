FROM openjdk:8-jdk-alpine
WORKDIR /order-service
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} order-service.jar
EXPOSE 8283
ENTRYPOINT ["java", "-jar", "order-service.jar"]
