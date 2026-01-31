package com.iuh.consumer.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderMessage {
    private String orderId;
    private String message;
    private LocalDateTime timestamp;
}
