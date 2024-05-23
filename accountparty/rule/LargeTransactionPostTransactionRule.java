package edu.mum.cs.cs525.labs.exercises.project.accountparty.rule;

import edu.mum.cs.cs525.labs.exercises.project.accountparty.entity.Account;
import edu.mum.cs.cs525.labs.exercises.project.accountparty.entity.AccountEntry;

import java.math.BigDecimal;

public class LargeTransactionPostTransactionRule implements EmailRule {
    private final BigDecimal threshold;
    private final String message;

    public LargeTransactionPostTransactionRule(BigDecimal threshold, String message) {
        this.threshold = threshold;
        this.message = message;
    }

    @Override
    public void apply(Account account, BigDecimal amount) {
        if (amount.compareTo(threshold) > 0) {
            // Send notification
            System.out.println("Notification: " + message + " for account " + account.getAccountNumber());
        }
    }

}
