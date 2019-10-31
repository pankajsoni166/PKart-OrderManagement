FROM openjdk:8-jdk-alpine
RUN $PWD
RUN cd /var/lib/jenkins/workspace/git_test_1/target/
ADD order-management-0.0.1-SNAPSHOT.jar order-management-0.0.1-SNAPSHOT.jar
# COPY target/pramati-kart-0.0.1-SNAPSHOT.jar app.jar
ENV JAVA_OPTS=""
ENTRYPOINT exec java -jar /app.jar
