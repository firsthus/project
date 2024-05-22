package edu.mum.cs.cs525.labs.exercises.project.accountparty.service;

import java.math.BigDecimal;

public interface AccountTransactionService {
    void deposit(String accountNumber, BigDecimal amount);
    void withdraw(String accountNumber, BigDecimal amount);
    void transferFunds(String fromAccountNumber, String toAccountNumber, BigDecimal amount, String description);
    String generateReport();
}
