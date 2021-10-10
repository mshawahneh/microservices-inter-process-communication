FROM openjdk:13-jdk-alpine
ADD target/*.jar exp-ms.jar
MAINTAINER Mohammad Shawahneh <mshawahn@cisco.com>
EXPOSE 8005
ENTRYPOINT ["java","-jar","exp-ms.jar"]