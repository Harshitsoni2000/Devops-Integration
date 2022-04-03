FROM openjdk:8
EXPOSE 8080
ADD target/Devops-Integration.jar Devops-Integration.jar
ENTRYPOINT ["java", "-jar", "/Devops-Integration.jar"]