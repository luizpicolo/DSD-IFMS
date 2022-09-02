FROM openjdk:8

WORKDIR /app

COPY /src /app/src

RUN cd /app/src/ && javac UDPServer.java

EXPOSE 8888/udp