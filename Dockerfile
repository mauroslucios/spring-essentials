FROM adoptopenjdk/openjdk11:alpine-jre
WORKDIR /var/www/html/app
ARG JAR_FILE=target/essentials-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","app.jar"]