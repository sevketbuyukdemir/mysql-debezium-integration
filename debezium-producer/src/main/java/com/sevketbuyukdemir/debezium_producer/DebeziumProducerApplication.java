package com.sevketbuyukdemir.debezium_producer;

import com.sevketbuyukdemir.debezium_producer.config.DebeziumConnectorProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@EnableConfigurationProperties(DebeziumConnectorProperties.class)
public class DebeziumProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DebeziumProducerApplication.class, args);
	}

}
