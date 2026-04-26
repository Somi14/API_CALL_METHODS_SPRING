# Step 1: use a machine that has Java 17 installed
FROM eclipse-temurin:17-jdk-alpine

# Step 2: set a working directory inside the container
WORKDIR /app

# Step 3: copy the JAR that Maven builds into the container
# the * is because Maven adds the version number to the filename
COPY target/*.jar app.jar

# Step 4: run it (same as `java -jar yourapp.jar`)
ENTRYPOINT ["java", "-jar", "app.jar"]