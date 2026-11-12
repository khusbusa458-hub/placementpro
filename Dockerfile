# Multi-stage Docker build for PlacementPro Spring Boot Backend
# Stage 1: Build JAR using Maven
FROM maven:3.9.6-eclipse-temurin-17 AS builder
WORKDIR /app
COPY pom.xml .
RUN mvn dependency:go-offline -B || true
COPY src ./src
RUN mvn clean package -DskipTests

# Stage 2: Minimal Production JRE Runtime
FROM eclipse-temurin:17-jre-jammy
WORKDIR /app
COPY --from=builder /app/target/*.jar app.jar

ENV PORT=8080
EXPOSE 8080

# Handle dynamic cloud PORT (Render / Railway / Heroku)
ENTRYPOINT ["sh", "-c", "java -Dserver.port=${PORT} -jar app.jar"]
