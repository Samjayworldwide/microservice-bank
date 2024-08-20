#Start with a base image containing Java Runtime
FROM openjdk:17-jdk-slim

#Information about who maintains the image
MAINTAINER samjay.com

#Add the application's jar to the image
COPY target/accounts-0.0.1-SNAPSHOT.jar accounts-0.0.1-SNAPSHOT.jar

#Execute the application
ENTRYPOINT ["java", "-jar", "accounts-0.0.1-SNAPSHOT.jar"]