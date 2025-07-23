package com.digital.management.transactionservice.controller;

import com.digital.management.transactionservice.model.Transaction;
import com.digital.management.transactionservice.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/transaction")
public class TransactionController {

    @Autowired
    private TransactionService transactionService;

    @GetMapping
    public List<Transaction> getTransactions(){
        return transactionService.getTransactions();
    }
}
