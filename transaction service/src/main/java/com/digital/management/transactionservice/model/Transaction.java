package com.digital.management.transactionservice.model;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Transaction {

    private Long id;
    private String userId;
    private Double amount;
    private int rating;
    private String description;
    private LocalDateTime transactionDate;
}
