FROM openjdk:11
VOLUME /tmp
ADD target/demo-0.0.1-SNAPSHOT /app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
