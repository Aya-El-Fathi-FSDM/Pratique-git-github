# Étape 1 : construire le projet avec Maven
FROM maven:3.9.9-eclipse-temurin-17 AS build

# Définir le répertoire de travail
WORKDIR /app

# Copier les fichiers Maven (pom.xml + code source)
COPY pom.xml .
COPY src ./src

# Construire le projet et créer le .jar
RUN mvn clean package -DskipTests

# Étape 2 : exécuter le jar avec une image plus légère
FROM eclipse-temurin:17-jdk-jammy

# Créer un répertoire pour l'application
WORKDIR /app

# Copier le jar depuis l’étape précédente
COPY --from=build /app/target/pratique-1.0-SNAPSHOT.jar app.jar

# Commande pour exécuter l’application
ENTRYPOINT ["java", "-jar", "app.jar"]
