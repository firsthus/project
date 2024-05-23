package edu.mum.cs.cs525.labs.exercises.project.accountparty.rule;

import edu.mum.cs.cs525.labs.exercises.project.accountparty.entity.Account;
import edu.mum.cs.cs525.labs.exercises.project.accountparty.entity.AccountEntry;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class RulesEngine {
    private final List<EmailRule> postTransactionRules;

    public RulesEngine() {
        this.postTransactionRules = new ArrayList<>();
    }

    public void addRule(EmailRule postTransactionRule) {
        postTransactionRules.add(postTransactionRule);
    }

    public void applyRules(Account account, BigDecimal amount) {
        for (EmailRule postTransactionRule : postTransactionRules) {
            postTransactionRule.apply(account, amount);
        }
    }
}
