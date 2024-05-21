package edu.mum.cs.cs525.labs.exercises.project.creditcard.entity;

import edu.mum.cs.cs525.labs.exercises.project.accountparty.entity.Account;
import edu.mum.cs.cs525.labs.exercises.project.accountparty.entity.AccountType;
import edu.mum.cs.cs525.labs.exercises.project.accountparty.entity.Customer;
import edu.mum.cs.cs525.labs.exercises.project.accountparty.entity.InterestCalculationStrategy;

import java.math.BigDecimal;

public class CreditCardAccount extends Account {
    private double monthlyInterestRate;
    private double minimumPaymentRate;
    public CreditCardAccount(String accountNumber, BigDecimal initialBalance, Customer accountOwner, AccountType accountType, double MI, double MP) {
        super(accountNumber, initialBalance, accountOwner, accountType);
        this.monthlyInterestRate = MI;
        this.minimumPaymentRate = MP;
    }
    @Override
    public void addInterest() {
        deposit(calculateInterest());
        //todo: notify observer
    }

    @Override
    public BigDecimal calculateInterest() {
        return getBalance().multiply(BigDecimal.valueOf(monthlyInterestRate));
    }

    public void charge(BigDecimal amount) {
        deposit(amount.negate());
        if (amount.compareTo(new BigDecimal("400")) > 0) {
            //todo: notify alert
        }
    }
}
