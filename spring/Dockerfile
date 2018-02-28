FROM maven:3.5.0-jdk-8 as builder

WORKDIR /usr/src/app

COPY pom.xml /usr/src/app/pom.xml

COPY src/ /usr/src/app/src

RUN mvn clean package

FROM java:8-jre

COPY --from=builder /usr/src/app/target/kickstarter-docker-0.0.1-SNAPSHOT.jar /usr/src/app/app.jar

EXPOSE 8080

CMD ["java", "-jar", "/usr/src/app/app.jar"]



