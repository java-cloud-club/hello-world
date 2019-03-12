FROM openjdk:8-jre-alpine

COPY app.jar app.jar

CMD ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
