package com.digital.management.userservice.client;

import com.digital.management.userservice.config.FeignClientConfig;
import com.digital.management.userservice.model.Transaction;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "transactionservice", url = "${application.services.transaction.url}"
                ,configuration = FeignClientConfig.class)
public interface TransactionClient {

    @GetMapping
    List<Transaction> getTransactions();
}
