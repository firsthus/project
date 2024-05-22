package edu.mum.cs.cs525.labs.exercises.project.creditcard.entity;

import edu.mum.cs.cs525.labs.exercises.project.accountparty.entity.AccountType;
import edu.mum.cs.cs525.labs.exercises.project.accountparty.entity.InterestCalculationStrategy;

public class SilverCreditCard extends AccountType {
    public SilverCreditCard(InterestCalculationStrategy silverCreditCardInterestCalculationStrategy) {
        super(silverCreditCardInterestCalculationStrategy);
    }
}
