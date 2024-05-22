package edu.mum.cs.cs525.labs.exercises.project.bank.service;

import edu.mum.cs.cs525.labs.exercises.project.accountparty.repository.AccountRepository;
import edu.mum.cs.cs525.labs.exercises.project.accountparty.rule.RulesEngine;
import edu.mum.cs.cs525.labs.exercises.project.accountparty.service.AccountTransactionService;

public class BankAccountServiceImpl extends AccountTransactionService {
    public BankAccountServiceImpl(AccountRepository accountRepository, RulesEngine rulesEngine) {

        super(accountRepository, rulesEngine);
    }

}
