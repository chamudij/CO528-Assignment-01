# Use a base image with JDK installed
FROM openjdk:17-jdk-alpine

# Add a label to the image (optional)
LABEL maintainer="chamudi@backend.com"

# Set the working directory inside the container
WORKDIR /app

# Copy the JAR file from the target directory into the container
COPY target/backend-0.0.1-SNAPSHOT.jar /app/app.jar

# Expose the port that your Spring Boot app listens on (default is 8080)
EXPOSE 8080

# Define the command to run your Spring Boot application
CMD ["java", "-jar", "/app/app.jar"]
