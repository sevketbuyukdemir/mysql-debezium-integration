package com.sevketbuyukdemir.debezium_producer.jobs;

import com.sevketbuyukdemir.debezium_producer.entity.User;
import com.sevketbuyukdemir.debezium_producer.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CreateUserTask {
    private final Logger logger = LogManager.getLogger(CreateUserTask.class);
    private final UserRepository userRepository;

    @Scheduled(fixedRate = 1000)
    public void saveDummyUsers() {
        User user = new User();
        user.setEmail(String.format("email%d@gmail.com", System.currentTimeMillis()));
        user.setFirstname("Firstname");
        user.setSurname("Surname");
        user.setPhone("123456789");
        user.setPassword("password");
        userRepository.save(user);
        logger.info("User created");
    }
}
