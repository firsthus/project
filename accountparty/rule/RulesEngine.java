package edu.mum.cs.cs525.labs.exercises.project.accountparty.rule;

import edu.mum.cs.cs525.labs.exercises.project.accountparty.entity.Account;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class RulesEngine {
    private final List<PostTransactionRule> postTransactionRules;

    public RulesEngine() {
        this.postTransactionRules = new ArrayList<>();
    }

    public void addRule(PostTransactionRule postTransactionRule) {
        postTransactionRules.add(postTransactionRule);
    }

    public void applyRules(Account account, BigDecimal amount) {
        for (PostTransactionRule postTransactionRule : postTransactionRules) {
            postTransactionRule.apply(account, amount);
        }
    }
}
