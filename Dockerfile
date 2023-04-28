FROM amazoncorretto:11-alpine-jdk
MAINTAINER VC
COPY target/valcommatteo-0.0.1-SNAPSHOT.jar vc-app.jar
ENTRYPOINT ["java", "-jar", "/vc-app.jar"]
EXPOSE 8080