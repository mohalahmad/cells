FROM openjdk:8-jdk-alpine
ADD /target/cells-1.jar cell.jar
ENV JAVA_OPTS=""
ENTRYPOINT ["java","-jar","cell.jar"]