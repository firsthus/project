package edu.mum.cs.cs525.labs.exercises.project.bank.entity;

import edu.mum.cs.cs525.labs.exercises.project.accountparty.entity.AccountType;
import edu.mum.cs.cs525.labs.exercises.project.accountparty.entity.InterestCalculationStrategy;

public class SavingsAccount extends AccountType {

    protected SavingsAccount(InterestCalculationStrategy interestCalculationStrategy) {
        super(interestCalculationStrategy);
    }


}
