package edu.mum.cs.cs525.labs.exercises.project.creditcard.strategy.minimumPaymentStrategy;

import edu.mum.cs.cs525.labs.exercises.project.accountparty.entity.Account;

import java.math.BigDecimal;

public class GoldMinimumPaymentStrategy implements MinimumPaymentStrategy{

    @Override
    public BigDecimal minimumPayment(Account account) {
        BigDecimal mp = new BigDecimal("0.1");
        return account.getBalance().add(account.getBalance().multiply(mp));
    }
}
