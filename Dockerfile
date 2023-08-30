FROM openjdk:17
EXPOSE 8082
COPY target/account-service-main.jar account-service-main.jar
ENTRYPOINT ["java","-jar","account-service-main.jar"]