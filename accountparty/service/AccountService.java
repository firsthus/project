package edu.mum.cs.cs525.labs.exercises.project.accountparty.service;

import edu.mum.cs.cs525.labs.exercises.project.accountparty.repository.AccountRepository;

public class AccountService {

    private final AccountRepository accountRepository;



    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }



}
