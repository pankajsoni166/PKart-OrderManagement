FROM openjdk:8-jdk-alpine
#COPY order-management-0.0.1-SNAPSHOT.jar /var/lib/jenkins/workspace/simple-java-maven-app/target
# COPY target/pramati-kart-0.0.1-SNAPSHOT.jar app.jar
ENV JAVA_OPTS=""
ENTRYPOINT exec java -jar /app.jar
