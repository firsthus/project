package edu.mum.cs.cs525.labs.exercises.project.accountparty.service;

import edu.mum.cs.cs525.labs.exercises.project.accountparty.entity.Account;
import edu.mum.cs.cs525.labs.exercises.project.accountparty.repository.AccountRepository;

import java.math.BigDecimal;

public abstract class AccountService implements AccountTransactionServiceInterface{

    private final AccountRepository accountRepository;


    protected AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }


    public void deposit(String accountNumber, BigDecimal amount) {
        Account account = accountRepository.findByAccountNumber(accountNumber);
        account.deposit(amount);
    }

    public void withdraw(String accountNumber, BigDecimal amount) {
        Account account = accountRepository.findByAccountNumber(accountNumber);
        account.withdraw(amount);
    }

    public void transferFunds(String fromAccountNumber, String toAccountNumber, BigDecimal amount, String description) {
        Account fromAccount = accountRepository.findByAccountNumber(fromAccountNumber);
        Account toAccount = accountRepository.findByAccountNumber(toAccountNumber);
        fromAccount.transferFunds(toAccount, amount);
    }

    public AccountRepository getAccountRepository() {
        return accountRepository;
    }
}
