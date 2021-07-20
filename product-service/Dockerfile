FROM openjdk:8-jdk-alpine
WORKDIR /product-service
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} product-service.jar
ENTRYPOINT ["java", "-jar", "product-service.jar"]
