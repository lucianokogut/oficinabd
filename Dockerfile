FROM openjdk:12-alpine
LABEL maintainer = "github.com/lucianokogut"
COPY ./target/oficinabd-0.0.1-SNAPSHOT.jar /app/oficinabd-0.0.1-SNAPSHOT.jar
WORKDIR /app
ENTRYPOINT [ "java", "-jar", "oficinabd-0.0.1-SNAPSHOT.jar"]
EXPOSE 8080