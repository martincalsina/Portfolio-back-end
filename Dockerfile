FROM amazoncorretto:17-alpine-jdk
MAINTAINER martin
COPY target/portoflio-0.0.1-SNAPSHOT.jar portfolio-app.jar
ENTRYPOINT ["java","-jar","/portfolio-app.jar"]