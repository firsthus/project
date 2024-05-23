package edu.mum.cs.cs525.labs.exercises.project.creditcard.rule;

import edu.mum.cs.cs525.labs.exercises.project.accountparty.entity.Account;
import edu.mum.cs.cs525.labs.exercises.project.accountparty.entity.AccountEntry;
import edu.mum.cs.cs525.labs.exercises.project.accountparty.rule.EmailRule;

import java.math.BigDecimal;

public class CompanyAccountEmailRule implements EmailRule {
    @Override
    public void apply(Account account, BigDecimal amount) {
        if (account.getAccountOwner() != null) {//todo: check CompanyAccount
            sendEmail(account, amount);
        }
    }

    private void sendEmail(Account account, BigDecimal amount) {
        System.out.println("Sending email to company");
    }
}
