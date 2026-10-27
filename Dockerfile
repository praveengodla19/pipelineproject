FROM openjdk:28-ea-20-slim
RUN mkdir /project
COPY target/pipelinedemo-0.0.1-SNAPSHOT.jar  /project
EXPOSE 8081
CMD ["java","-jar","/project/pipelinedemo-0.0.1-SNAPSHOT.jar"]