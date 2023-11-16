FROM openjdk:12-alpine
LABEL maintainer_1 = "adriano.melo@prof.sc.senac.br"
LABEL maintainer_2 = "github.com/lucianokogut"
LABEL repository = "https://github.com/lucianokogut/oficinabd"
COPY ./target/oficinabd-0.0.1-SNAPSHOT.jar /app/oficinabd-0.0.1-SNAPSHOT.jar
WORKDIR /app
ENTRYPOINT [ "java", "-jar", "oficinabd-0.0.1-SNAPSHOT.jar"]
EXPOSE 8080