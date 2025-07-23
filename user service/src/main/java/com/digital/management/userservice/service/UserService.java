package com.digital.management.userservice.service;

import com.digital.management.userservice.client.TransactionClient;
import com.digital.management.userservice.model.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private TransactionClient transactionClient;

    public List<Transaction> getTransactions() {
        return transactionClient.getTransactions();
    }
}
