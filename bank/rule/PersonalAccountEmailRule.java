package edu.mum.cs.cs525.labs.exercises.project.bank.rule;

import edu.mum.cs.cs525.labs.exercises.project.accountparty.entity.Account;
import edu.mum.cs.cs525.labs.exercises.project.accountparty.entity.AccountEntry;
import edu.mum.cs.cs525.labs.exercises.project.accountparty.rule.EmailRule;

import java.math.BigDecimal;

public class PersonalAccountEmailRule implements EmailRule {
    private final BigDecimal threshold = BigDecimal.valueOf(500);
    @Override
    public void apply(Account account, BigDecimal amount) {
        if (account.getAccountOwner() != null) {//todo: check PersonalAccount
            BigDecimal threshold = BigDecimal.valueOf(400);
            if (amount.compareTo(threshold) > 0 || account.getBalance().compareTo(BigDecimal.ZERO) < 0) {
                sendEmail(account, amount);
            }
        }
    }

    private void sendEmail(Account account, BigDecimal amount) {
        System.out.println("Send email to personal: The amount was larger than " + threshold);
    }
}
