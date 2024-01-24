
# Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
# Click nbfs://nbhost/SystemFileSystem/Templates/Other/Dockerfile to edit this template

FROM amazoncorretto:17-alpine-jdk
MAINTAINER martin
COPY target/portoflio-0.0.1-SNAPSHOT.jar portfolio-app.jar
ENTRYPOINT ["JAVA","-jar","/portfolio-app.jar"]