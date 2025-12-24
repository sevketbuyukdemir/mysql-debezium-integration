# MySQL - Debezium Integration

Debezium integration implementation with MySQL, Apache Kafka and Spring Boot

## Technologies
- Java 17
- Maven
- Spring Boot
- MySQL
- [Debezium](https://debezium.io/)
- [Apache Kafka](https://kafka.apache.org/)
- [Spring for Apache Kafka](https://spring.io/projects/spring-kafka)
- [Kafka UI](https://github.com/provectus/kafka-ui)

## Running the Application

1. Clone repository
```
git clone https://github.com/sevketbuyukdemir/mysql-debezium-integration.git
```
2. Run containers via Docker Desktop
- Create and start container for the first time:
```
docker-compose up -d
```
- Start an existing container:
```
docker-compose start
```
- Stop the running container:
```
docker-compose stop
```
- Perform a clean restart (stops containers and removes volumes):
```
docker-compose down -v
```
3. Run Spring Boot applications

> [!NOTE]
> [Kafka UI](http://localhost:8080)
