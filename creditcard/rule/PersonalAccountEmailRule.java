package edu.mum.cs.cs525.labs.exercises.project.creditcard.rule;

import edu.mum.cs.cs525.labs.exercises.project.accountparty.entity.Account;
import edu.mum.cs.cs525.labs.exercises.project.accountparty.entity.AccountEntry;
import edu.mum.cs.cs525.labs.exercises.project.accountparty.rule.EmailRule;

import java.math.BigDecimal;

public class PersonalAccountEmailRule implements EmailRule {
    private final BigDecimal threshold = BigDecimal.valueOf(400);
    @Override
    public void apply(Account account, String message, BigDecimal amount) {
        if (account.getAccountOwner() != null) {//todo: check PersonalAccount
            BigDecimal threshold = BigDecimal.valueOf(400);
            if (amount.compareTo(threshold) > 0 || account.getBalance().compareTo(BigDecimal.ZERO) < 0) {
                sendEmail(account, message, amount);
            }
        }
    }

    private void sendEmail(Account account, String message, BigDecimal amount) {
        System.out.println(
                String.format("Sending email: account %s - The %s amount was larger than ", account.getAccountNumber(), message) + amount + "$");

    }
}
