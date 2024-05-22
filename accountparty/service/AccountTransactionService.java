package edu.mum.cs.cs525.labs.exercises.project.accountparty.service;

import edu.mum.cs.cs525.labs.exercises.project.accountparty.entity.Account;
import edu.mum.cs.cs525.labs.exercises.project.accountparty.repository.AccountRepository;
import edu.mum.cs.cs525.labs.exercises.project.accountparty.rule.RulesEngine;

import java.math.BigDecimal;
import java.util.ArrayDeque;
import java.util.Deque;

public class AccountTransactionService {

    private final AccountRepository accountRepository;
    private final RulesEngine rulesEngine;

    public AccountTransactionService(AccountRepository accountRepository, RulesEngine rulesEngine) {
        this.accountRepository = accountRepository;
        this.rulesEngine = rulesEngine;
    }


    public void deposit(String accountNumber, BigDecimal amount) {
        Account account = accountRepository.findByAccountNumber(accountNumber);
        account.deposit(amount);
        rulesEngine.applyRules(account, amount);
    }

    public void withdraw(String accountNumber, BigDecimal amount) {
        Account account = accountRepository.findByAccountNumber(accountNumber);
        account.withdraw(amount);
        rulesEngine.applyRules(account, amount);
    }

    public void transferFunds(String fromAccountNumber, String toAccountNumber, BigDecimal amount, String description) {
        Account fromAccount = accountRepository.findByAccountNumber(fromAccountNumber);
        Account toAccount = accountRepository.findByAccountNumber(toAccountNumber);
        fromAccount.transferFunds(toAccount, amount);
    }

}
