package com.example.majumundur.service;

import com.example.majumundur.entity.Transaction;
import com.example.majumundur.repository.TransactionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TransactionService {

    private final TransactionRepository transactionRepository;

    public Transaction createTransaction(Transaction transaction) {
        return transactionRepository.save(transaction);
    }

    public List<Transaction> findTransactionsByCustomer(Long customerId) {
        return transactionRepository.findByCustomerId(customerId);
    }
}
