FROM openjdk:17-jdk-alpine
EXPOSE 8080
ADD target/spring-boot-github-actions-demo.jar spring-boot-github-actions-demo.jar
ENTRYPOINT ["java","-jar","/spring-boot-github-actions-demo.jar"]