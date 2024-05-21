package edu.mum.cs.cs525.labs.exercises.project.bank.entity;

import edu.mum.cs.cs525.labs.exercises.project.accountparty.entity.Account;
import edu.mum.cs.cs525.labs.exercises.project.accountparty.entity.AccountType;
import edu.mum.cs.cs525.labs.exercises.project.accountparty.entity.Customer;

import java.math.BigDecimal;

public class CompanyAccount extends Account {



    protected CompanyAccount(String accountNumber, Customer accountOwner, AccountType accountType) {
        super(accountNumber, accountOwner, accountType);
    }




}
