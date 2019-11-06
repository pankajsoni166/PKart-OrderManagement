FROM openjdk:8-jdk-alpine
RUN echo "PWD is: $PWD"
RUN cd ..
RUN cd ..
RUN echo "PWD is: $PWD"
ADD order-management-0.0.1-SNAPSHOT.jar order-management-0.0.1-SNAPSHOT.jar
# COPY target/pramati-kart-0.0.1-SNAPSHOT.jar app.jar
ENV JAVA_OPTS=""
ENTRYPOINT exec java -jar /app.jar
