package com.iuh.producer.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderMessage implements Serializable {
    private String orderId;
    private String message;
    private LocalDateTime timestamp;
}