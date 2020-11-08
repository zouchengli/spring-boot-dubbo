FROM openjdk:8-jre-alpine

ADD target/consumer-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar","/app.jar"]

EXPOSE 8091