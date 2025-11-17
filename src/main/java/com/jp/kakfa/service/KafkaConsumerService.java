package com.jp.kakfa.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {

    @KafkaListener(topics = "demo-topic", groupId = "test-group")
    public void consume(String message) {
        System.out.println("Consumed: " + message);
    }
}
