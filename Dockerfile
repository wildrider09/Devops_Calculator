FROM openjdk:8
COPY ./target/Calculator_Mini-1.0-SNAPSHOT.jar ./
WORKDIR ./
CMD ["java", "-cp", "Calculator_Mini-1.0-SNAPSHOT.jar", "Calculator"]
