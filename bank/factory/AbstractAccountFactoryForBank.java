package edu.mum.cs.cs525.labs.exercises.project.bank.factory;

import edu.mum.cs.cs525.labs.exercises.project.accountparty.factory.AccountFactory;
import edu.mum.cs.cs525.labs.exercises.project.accountparty.repository.AccountRepository;

public abstract class AbstractAccountFactoryForBank implements AccountFactory {
    AccountRepository accountRepository = new AccountRepository();
}
