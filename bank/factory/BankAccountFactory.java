package edu.mum.cs.cs525.labs.exercises.project.bank.factory;

import edu.mum.cs.cs525.labs.exercises.project.accountparty.entity.Account;
import edu.mum.cs.cs525.labs.exercises.project.accountparty.entity.AccountType;
import edu.mum.cs.cs525.labs.exercises.project.accountparty.entity.Customer;
import edu.mum.cs.cs525.labs.exercises.project.accountparty.factory.AccountFactory;
import edu.mum.cs.cs525.labs.exercises.project.accountparty.factory.AccountTypeFactory;
import edu.mum.cs.cs525.labs.exercises.project.accountparty.repository.AccountRepository;
import edu.mum.cs.cs525.labs.exercises.project.bank.entity.BankingAccount;

import java.util.Random;

public class BankAccountFactory implements AccountFactory {
    String accountNumber ;

    public BankAccountFactory() {
        this.accountNumber = new Random().toString();
    }
    @Override
    public Account createNewAccountForCustomer(Customer customer, AccountTypeFactory accountTypeFactory) {

        Account account= new BankingAccount(accountNumber,customer, accountTypeFactory.provide());
        return account;
    }
}
