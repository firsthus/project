package edu.mum.cs.cs525.labs.exercises.project.bank.InteresetStrategy;

import edu.mum.cs.cs525.labs.exercises.project.accountparty.entity.Account;
import edu.mum.cs.cs525.labs.exercises.project.accountparty.entity.InterestCalculationStrategy;

import java.math.BigDecimal;

public class SavingInterestStrategy implements InterestCalculationStrategy {

    private static SavingInterestStrategy instance;

    private SavingInterestStrategy() {

    }

    @Override
    public BigDecimal calculateInterest(Account account) {
        return account.getBalance().multiply(BigDecimal.valueOf(0.01));
    }

    public static SavingInterestStrategy getInstance() {
        if (instance == null) {
            instance = new SavingInterestStrategy();
        }
        return instance;
    }

}
