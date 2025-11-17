package com.jp.kakfa;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@SpringBootApplication
public class KakfaApplication {

    public static void main(String[] args) {
        SpringApplication.run(KakfaApplication.class, args);
    }

    @Service
    @RequiredArgsConstructor
    public static class KafkaProducerService {

        private final KafkaTemplate<String, String> kafkaTemplate;

        public void sendMessage(String message) {
            kafkaTemplate.send("demo-topic", message);
            System.out.println("Sent: " + message);
        }
    }
}
