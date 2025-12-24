CREATE DATABASE IF NOT EXISTS debezium;
USE debezium;
CREATE USER IF NOT EXISTS 'debezium'@'%' IDENTIFIED BY 'debezium123!';
GRANT SELECT, RELOAD, SHOW DATABASES, REPLICATION SLAVE, REPLICATION CLIENT ON *.* TO 'debezium'@'%';
GRANT ALL PRIVILEGES ON inventory.* TO 'debezium'@'%';
FLUSH PRIVILEGES;

CREATE TABLE IF NOT EXISTS `users` (
    `id` bigint NOT NULL AUTO_INCREMENT,
    `email` varchar(255) NOT NULL,
    `firstname` varchar(45) NOT NULL,
    `password` varchar(255) NOT NULL,
    `phone` varchar(15) NOT NULL,
    `surname` varchar(45) NOT NULL,
    PRIMARY KEY (`id`),
    UNIQUE KEY `UK6dotkott2kjsp8vw4d0m25fb7` (`email`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;