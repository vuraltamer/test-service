FROM openjdk:17-jdk-slim
WORKDIR test-service-api
COPY ./build/libs/*.jar test-service-api-1.0.0-plain.jar
CMD ["java", "-jar", "test-service-api-1.0.0-plain.jar"]