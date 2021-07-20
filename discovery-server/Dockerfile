FROM openjdk:8-jdk-alpine
WORKDIR /discovery-server
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} discovery-server.jar
ENTRYPOINT ["java", "-jar", "discovery-server.jar"]
