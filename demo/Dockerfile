FROM openjdk:11-jre
VOLUME /root/app
ENV PROFILE default
ADD target/demo-0.0.1-SNAPSHOT.jar /app.jar
ENTRYPOINT ["java","-Dspring.profiles.active=${PROFILE}","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
