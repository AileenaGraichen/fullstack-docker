FROM openjdk:17-jdk-slim-bullseye
WORKDIR /app
COPY .mvn/ .mvn
COPY mvnw pom.xml ./
RUN chmod +x mvnw && ./mvnw dependency:resolve
COPY src ./src
CMD ["./mvnw", "spring-boot:run"]
