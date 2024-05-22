package edu.mum.cs.cs525.labs.exercises.project.creditcard.factory;

import edu.mum.cs.cs525.labs.exercises.project.accountparty.factory.AccountFactory;
import edu.mum.cs.cs525.labs.exercises.project.accountparty.repository.AccountRepository;

public abstract class AbstractAccountFactory implements AccountFactory {
    AccountRepository accountRepository = new AccountRepository();
}
