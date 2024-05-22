package edu.mum.cs.cs525.labs.exercises.project.accountparty.service;

import edu.mum.cs.cs525.labs.exercises.project.accountparty.entity.Account;
import edu.mum.cs.cs525.labs.exercises.project.accountparty.repository.AccountRepository;

import java.time.LocalDate;
import java.util.List;

public class AccountService {

    private final AccountRepository accountRepository;



    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    protected AccountRepository getAccountRepository() {
        return accountRepository;
    }

    public String generateReport() {
        List<Account> accounts = getAccountRepository().getAllAccounts();
        StringBuilder report = new StringBuilder("Banking Accounts Report:\n");
        for (Account account : accounts) {
            report.append(account.generateAccountReport(LocalDate.MIN, LocalDate.MAX)).append("\n");
        }
        return report.toString();
    }
}
