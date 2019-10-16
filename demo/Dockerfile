FROM openjdk:11
VOLUME /tmp
ADD ${project.build.finalName}.jar /app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
