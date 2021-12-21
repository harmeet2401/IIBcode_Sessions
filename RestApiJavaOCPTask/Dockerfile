FROM maven AS build
WORKDIR /app
copy src /tmp/src
copy pom.xml /tmp/pom.xml
RUN mvn clean install

#clean compile install -f pom.xml

FROM java:8
ENV MESSAGE "Welcome to my ne api deployed to open shift 4.0"
EXPOSE 8080
ADD /target/Myapi-0.0.1-SNAPSHOT.jar Myapi-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","Myapi-0.0.1-SNAPSHOT.jar"]
