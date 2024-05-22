package edu.mum.cs.cs525.labs.exercises.project.accountparty.service;

import edu.mum.cs.cs525.labs.exercises.project.accountparty.entity.Account;
import edu.mum.cs.cs525.labs.exercises.project.accountparty.repository.AccountRepository;
import edu.mum.cs.cs525.labs.exercises.project.accountparty.rule.RulesEngine;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

public class AccountTransactionService implements AccountTransactionServiceInterface {

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

    public String generateReport() {
        List<Account> accounts = getAccountRepository().getAllAccounts();
        StringBuilder report = new StringBuilder("Banking Accounts Report:\n");
        for (Account account : accounts) {
            report.append(account.generateAccountReport(LocalDate.MIN, LocalDate.MAX)).append("\n");
        }
        return report.toString();
    }

    protected AccountRepository getAccountRepository() {
        return accountRepository;
    }

}
