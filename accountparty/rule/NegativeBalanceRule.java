package edu.mum.cs.cs525.labs.exercises.project.accountparty.rule;

import edu.mum.cs.cs525.labs.exercises.project.accountparty.entity.Account;
import edu.mum.cs.cs525.labs.exercises.project.accountparty.entity.AccountEntry;

import java.math.BigDecimal;

public class NegativeBalanceRule implements Rule {
    private final String message;

    public NegativeBalanceRule(String message) {
        this.message = message;
    }

    @Override
    public void apply(Account account, BigDecimal amount) {
        if (account.getBalance().compareTo(BigDecimal.ZERO) < 0) {
            // Send email??
            System.out.println("Notification: " + message + " for account " + account.getAccountNumber());
        }
    }
}
