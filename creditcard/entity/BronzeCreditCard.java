package edu.mum.cs.cs525.labs.exercises.project.creditcard.entity;

import edu.mum.cs.cs525.labs.exercises.project.accountparty.entity.AccountType;
import edu.mum.cs.cs525.labs.exercises.project.accountparty.entity.InterestCalculationStrategy;
import edu.mum.cs.cs525.labs.exercises.project.creditcard.interestStrategy.BronzeCreditCardInterestCalculationStrategy;

public class BronzeCreditCard extends AccountType {
    public BronzeCreditCard(InterestCalculationStrategy bronzeCreditCardInterestCalculationStrategy) {
        super(bronzeCreditCardInterestCalculationStrategy);
    }
}
