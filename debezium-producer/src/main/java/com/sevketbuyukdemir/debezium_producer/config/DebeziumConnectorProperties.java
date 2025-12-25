package com.sevketbuyukdemir.debezium_producer.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import java.util.Map;

@ConfigurationProperties(prefix = "debezium.connector")
public class DebeziumConnectorProperties {
    @Getter
    @Setter
    private Map<String, String> config;
}