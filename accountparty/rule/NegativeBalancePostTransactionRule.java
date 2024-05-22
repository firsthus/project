package edu.mum.cs.cs525.labs.exercises.project.accountparty.rule;

import edu.mum.cs.cs525.labs.exercises.project.accountparty.entity.Account;

import java.math.BigDecimal;

public class NegativeBalancePostTransactionRule implements PostTransactionRule {
    private final String message;

    public NegativeBalancePostTransactionRule(String message) {
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
