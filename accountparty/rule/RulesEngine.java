package edu.mum.cs.cs525.labs.exercises.project.accountparty.rule;

import edu.mum.cs.cs525.labs.exercises.project.accountparty.entity.Account;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class RulesEngine {
    private final List<Rule> rules;

    public RulesEngine() {
        this.rules = new ArrayList<>();
    }

    public void addRule(Rule rule) {
        rules.add(rule);
    }

    public void applyRules(Account account, BigDecimal amount) {
        for (Rule rule : rules) {
            rule.apply(account, amount);
        }
    }
}
