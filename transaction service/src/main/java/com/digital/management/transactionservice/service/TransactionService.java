package com.digital.management.transactionservice.service;

import com.digital.management.transactionservice.model.Transaction;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TransactionService {

    public List<Transaction> getTransactions() {
        List<Transaction> transactions=new ArrayList<>();
        Transaction transaction = new Transaction();
        transaction.setId(1L); // using the passed id
        transaction.setAmount(5000.0);
        transaction.setUserId("SUCCESS");
        transaction.setTransactionDate(LocalDateTime.now());
        transaction.setDescription("Dummy transaction for testing");
        transactions.add(transaction);
        return transactions;

    }
}
