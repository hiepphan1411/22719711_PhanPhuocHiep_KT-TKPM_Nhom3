package com.iuh.producer.controller;

import com.iuh.producer.config.RabbitMQConfig;
import com.iuh.producer.model.OrderMessage;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class ProducerController {

    private final RabbitTemplate rabbitTemplate;

    public ProducerController(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    @PostMapping("/send")
    public Map<String, Object> sendMessage(@RequestBody OrderMessage orderMessage) {
        orderMessage.setTimestamp(LocalDateTime.now());

        rabbitTemplate.convertAndSend(RabbitMQConfig.QUEUE, orderMessage);

        System.out.println(orderMessage);
        Map<String, Object> response = new HashMap<>();
        response.put("status", "Message sent");
        response.put("data", orderMessage);

        return response;
    }
}