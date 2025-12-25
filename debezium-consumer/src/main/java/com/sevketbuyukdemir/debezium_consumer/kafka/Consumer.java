package com.sevketbuyukdemir.debezium_consumer.kafka;


import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sevketbuyukdemir.debezium_consumer.dto.UserDTO;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {
    private final Logger logger = LogManager.getLogger(Consumer.class);

    @KafkaListener(topics = "${debezium.topic.name:mysql.debezium.users}")
    public void consume(JsonNode payload) {
        JsonNode after = payload.get("payload").get("after");
        if (after != null) {
            try {
                ObjectMapper mapper = new ObjectMapper();
                UserDTO user = mapper.treeToValue(after, UserDTO.class);
                logger.info(user);
            } catch (Exception e) {
                logger.error(e.getMessage());
            }
        }
    }

}
