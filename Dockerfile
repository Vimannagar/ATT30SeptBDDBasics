FROM maven:3.9.6-eclipse-temurin-11-alpine
RUN apk add jq
RUN apk add curl
COPY src /home/seleniumtestframework/src
COPY pom.xml /home/seleniumtestframework
COPY testng.xml /home/seleniumtestframework
COPY runner.sh runner.sh
RUN dos2unix runner.sh
RUN mvn -f /home/seleniumtestframework/pom.xml clean test -DskipTests=true
ENTRYPOINT sh runner.sh