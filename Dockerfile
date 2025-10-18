FROM openjdk:25
ARG JAR_FILE=target/*.jar
WORKDIR /app
COPY ${JAR_FILE} app.jar
EXPOSE 8080
CMD ["java", "-jar", "store-0.0.1-SNAPSHOT.jar"]
LABEL authors="bilal.sahli"