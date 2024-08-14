
                        FROM openjdk:11-jre
                        COPY target/lowertoupperCase-0.0.1-SNAPSHOT.jar /app/lowertoupperCase-0.0.1-SNAPSHOT.jar
                        WORKDIR /app
                        ENTRYPOINT ["java", "-jar", "lowertoupperCase-0.0.1-SNAPSHOT.jar"]
                    