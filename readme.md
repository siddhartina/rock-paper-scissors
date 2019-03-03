# Rock Paper Scissors

A rock, paper scissors game as web app.

## Run as Spring Boot server

```
git clone https://github.com/siddhartina/rock-paper-scissors.git
cd rock-paper-scissors
mvn install
java -jar target\rock-paper-scirrors-0.0.1-SNAPSHOT.jar
```

Open a Browser and open localhost:8080

## Run as Docker image

### Clone and build docker image
```
git clone https://github.com/siddhartina/rock-paper-scissors.git
cd rock-paper-scissors
mvn compile jib:build
```
### Run docker container
```
docker run -d -p8080:8080 siddhartino/sandbox:rock-paper-scissors-20190303
```

Open a Browser and open localhost:8080


### Prerequisites

JDK 1.8

## Authors

* **Thomas Arand**

