FROM ubuntu:latest
LABEL authors="nathanturner"

FROM openjdk:17-jdk-slim

COPY target/D387_sample_code-0.0.2-SNAPSHOT.jar /app/D387_sample_code-0.0.2-SNAPSHOT.jar

WORKDIR /app

EXPOSE 8080

CMD ["java", "-jar", "D387_sample_code-0.0.2-SNAPSHOT.jar"]