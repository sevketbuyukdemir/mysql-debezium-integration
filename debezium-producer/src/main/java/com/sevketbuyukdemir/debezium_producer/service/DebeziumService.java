package com.sevketbuyukdemir.debezium_producer.service;

import com.sevketbuyukdemir.debezium_producer.config.DebeziumConnectorProperties;
import lombok.RequiredArgsConstructor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@Service
@RequiredArgsConstructor
public class DebeziumService {
    private static final String CONNECT_URL = "http://localhost:8083/connectors";
    private final Logger logger = LogManager.getLogger(DebeziumService.class);
    private final RestTemplate restTemplate;
    private final DebeziumConnectorProperties connectorProperties;

    public void registerDebeziumConnector() {
        Map<String, String> config = connectorProperties.getConfig();
        Map<String, Object> requestBody = Map.of(
                "name", "mysql-debezium-connector",
                "config", config
        );

        try {
            restTemplate.postForObject(CONNECT_URL, requestBody, String.class);
            logger.info("Debezium connector registered successfully!");
        } catch (Exception e) {
            logger.info("Connector registration failed: {}", e.getMessage());
        }
    }
}
