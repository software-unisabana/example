FROM amazoncorretto:21.0.1
COPY build/libs/example-*.jar /app/example.jar
CMD ["java", "-jar", "/app/example.jar"]