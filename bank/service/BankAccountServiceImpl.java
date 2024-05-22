package edu.mum.cs.cs525.labs.exercises.project.bank.service;

import edu.mum.cs.cs525.labs.exercises.project.accountparty.entity.Account;
import edu.mum.cs.cs525.labs.exercises.project.accountparty.repository.AccountRepository;
import edu.mum.cs.cs525.labs.exercises.project.accountparty.service.AccountService;

import java.time.LocalDate;
import java.util.List;

public class BankAccountServiceImpl extends AccountService {
    public BankAccountServiceImpl(AccountRepository accountRepository) {
        super(accountRepository);
    }

}
