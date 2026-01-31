package com.iuh.consumer;

import com.iuh.consumer.config.RabbitMQConfig;
import com.iuh.consumer.model.OrderMessage;
import com.rabbitmq.client.Channel;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.support.AmqpHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.stereotype.Component;

@Component
public class OrderConsumer {

    @RabbitListener(queues = RabbitMQConfig.QUEUE)
    public void receiveMessage(OrderMessage orderMessage,
                               Channel channel,
                               @Header(AmqpHeaders.DELIVERY_TAG) long tag) {
        try {
            System.out.println("========================================");
            System.out.println("Processing: " + orderMessage);

            if (orderMessage.getOrderId() == null || orderMessage.getOrderId().isEmpty()) {
                throw new IllegalArgumentException("Missing orderId");
            }

            Thread.sleep(3000);

            System.out.println("Process success: " + orderMessage.getOrderId());
            System.out.println("========================================\n");

            // Manual ACK
            channel.basicAck(tag, false);

        } catch (Exception e) {
            System.out.println("========================================");
            System.out.println("Error processing message: " + e.getMessage());
            System.out.println("Sending to DLQ...");
            System.out.println("========================================\n");
            try {
                channel.basicNack(tag, false, false);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
}