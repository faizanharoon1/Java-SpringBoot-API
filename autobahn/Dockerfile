FROM openjdk:17

COPY target/autobahn_api.jar /usr/app/

WORKDIR /usr/app

ENTRYPOINT ["java", "-jar", "autobahn_api.jar"]
