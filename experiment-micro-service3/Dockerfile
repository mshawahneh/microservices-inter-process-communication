FROM openjdk:13-jdk-alpine
ADD target/*.jar exp-ms.jar
MAINTAINER Mohammad Shawahneh <mohd.shawahneh@gmail.com>
EXPOSE 8003
ENTRYPOINT ["java","-jar","exp-ms.jar"]