package edu.mum.cs.cs525.labs.exercises.project.creditcard.factory;

import edu.mum.cs.cs525.labs.exercises.project.accountparty.entity.Account;
import edu.mum.cs.cs525.labs.exercises.project.accountparty.entity.AccountType;
import edu.mum.cs.cs525.labs.exercises.project.accountparty.entity.Customer;
import edu.mum.cs.cs525.labs.exercises.project.accountparty.factory.AccountFactory;
import edu.mum.cs.cs525.labs.exercises.project.accountparty.factory.AccountTypeFactory;
import edu.mum.cs.cs525.labs.exercises.project.creditcard.entity.CreditCardAccount;

public class CreditCardAccountFactory implements AccountFactory {

    @Override
    public Account createNewAccountForCustomer(Customer customer, AccountTypeFactory accountTypeFactory) {
        return new CreditCardAccount(String.valueOf(System.currentTimeMillis()), customer, accountTypeFactory.provide());
    }

}
