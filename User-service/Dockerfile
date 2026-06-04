FROM eclipse-temurin:18-jre-alpine
WORKDIR /app
COPY target/User-service-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8081
ENTRYPOINT ["java","-jar","app.jar"]

