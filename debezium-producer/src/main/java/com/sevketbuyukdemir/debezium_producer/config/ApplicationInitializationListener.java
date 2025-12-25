package com.sevketbuyukdemir.debezium_producer.config;

import com.sevketbuyukdemir.debezium_producer.service.DebeziumService;
import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ApplicationInitializationListener implements ApplicationListener<ContextRefreshedEvent> {
    private final DebeziumService debeziumService;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        debeziumService.registerDebeziumConnector();
    }
}
