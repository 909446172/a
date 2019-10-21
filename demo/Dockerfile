FROM openjdk:11
VOLUME /tmp
ADD target/demo-0.0.1-SNAPSHOT.jar /app.jar
ADD start-dev.sh /tmp/leve/config/start-dev.sh
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
