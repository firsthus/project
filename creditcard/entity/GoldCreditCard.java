package edu.mum.cs.cs525.labs.exercises.project.creditcard.entity;

import edu.mum.cs.cs525.labs.exercises.project.accountparty.entity.AccountType;
import edu.mum.cs.cs525.labs.exercises.project.accountparty.entity.Customer;

import java.math.BigDecimal;

public class GoldCreditCard extends CreditCardAccount{
    public GoldCreditCard(String accountNumber, BigDecimal initialBalance, Customer accountOwner, AccountType accountType) {
        super(accountNumber, initialBalance, accountOwner, accountType, 0.06, 0.10);
    }
}
