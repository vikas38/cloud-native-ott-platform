FROM adoptopenjdk/openjdk11:alpine-jre
MAINTAINER vikas
COPY target/user-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]