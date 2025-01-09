FROM openjdk:21
COPY build/libs/*.jar service.jar
RUN ls -l
ENTRYPOINT  java ${JAVA_OPTS} -jar service.jar
