FROM openjdk:8-jdk-alpine

RUN apk update && apk upgrade

COPY ../Executables/RandomPlayer.jar /usr/app/

RUN mkdir /usr/app/logs && mkdir /usr/app/garbage

WORKDIR /usr/app/

ENTRYPOINT ["java","-jar","RandomPlayer.jar", "BLACK", "60", "server"]

EXPOSE 5801