FROM openjdk:17

COPY . .
WORKDIR /SubsidieRadar
RUN ./mvnw -DskipTests

WORKDIR /SubsidieRadar/target
ENTRYPOINT ["java", "-jar", "SubsidieRadar-0.0.1-SNAPSHOT.jar"]

EXPOSE 8081
