FROM openjdk:17

RUN mkdir -p /webapp

WORKDIR /webapp

COPY SubsidieRadar.jar ./app.jar
COPY fill-Database-Citydeals.sql .
COPY application.properties .

EXPOSE 8081

CMD ["java", "-jar", "./app.jar"] 
