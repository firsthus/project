package edu.mum.cs.cs525.labs.exercises.project.accountparty.rule;

import edu.mum.cs.cs525.labs.exercises.project.accountparty.entity.Account;

import java.math.BigDecimal;

public interface PostTransactionRule {
	void apply(Account account, BigDecimal amount);
}
