package com.jp.kakfa.controller;


import com.jp.kakfa.service.KafkaProducerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class MessageController {

    private final KafkaProducerService producer;

    @PostMapping("/send/{msg}")
    public String send(@PathVariable String msg) {
        producer.sendMessage(msg);
        return "Message sent: " + msg;
    }
}
