FROM openjdk:11-jre-stretch

RUN apt update
RUN apt install wget
RUN apt install ca-certificates
RUN update-ca-certificates

RUN wget https://download-keycdn.ej-technologies.com/jprofiler/jprofiler_linux_10_1_5.tar.gz -P /tmp/ &&\
 tar -xzf /tmp/jprofiler_linux_10_1_5.tar.gz -C /usr/local &&\
 rm /tmp/jprofiler_linux_10_1_5.tar.gz

COPY app.jar app.jar

CMD ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
