FROM openjdk:11
VOLUME /root/.jenkins/workspace/test/demo/target
ADD demo-0.0.1-SNAPSHOT.jar /app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
