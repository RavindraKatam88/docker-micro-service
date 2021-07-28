FROM openjdk:8-jdk-alpine
WORKDIR /order-service
COPY target/order-service-0.0.1-SNAPSHOT.jar order-service.jar
ENTRYPOINT ["java", "-jar", "order-service.jar"]
