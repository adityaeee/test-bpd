package com.example.majumundur.controller;

import com.example.majumundur.entity.Transaction;
import com.example.majumundur.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/customer")
public class PurchaseController {

    @Autowired
    private TransactionService transactionService;

    @PostMapping("/purchase")
    public ResponseEntity<?> purchaseProduct(@RequestBody Transaction transaction) {
        return ResponseEntity.ok(transactionService.createTransaction(transaction));
    }

    @GetMapping("/rewards")
    public ResponseEntity<?> getCustomerRewards() {
        // Logic untuk mengambil poin reward customer
        return ResponseEntity.ok("Customer rewards");
    }
}
