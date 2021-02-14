FROM openjdk:8-jdk-alpine

RUN apk update && apk upgrade

COPY ../Executables/Server.jar /usr/app/

RUN mkdir /usr/app/logs && mkdir /usr/app/garbage

WORKDIR /usr/app/

ENTRYPOINT ["java","-jar","Server.jar"]

EXPOSE 5800 5801