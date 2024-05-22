package edu.mum.cs.cs525.labs.exercises.project.creditcard.entity;

import edu.mum.cs.cs525.labs.exercises.project.accountparty.entity.AccountType;
import edu.mum.cs.cs525.labs.exercises.project.creditcard.strategy.interestStrategy.BronzeCreditCardInterestCalculationStrategy;
import edu.mum.cs.cs525.labs.exercises.project.creditcard.strategy.minimumPaymentStrategy.BronzeMinimumPaymentStrategy;
import edu.mum.cs.cs525.labs.exercises.project.creditcard.strategy.minimumPaymentStrategy.MinimumPaymentStrategy;

public class BronzeCreditCard extends AccountType {
    private final MinimumPaymentStrategy minimumPaymentStrategy;
    public BronzeCreditCard() {
        super(new BronzeCreditCardInterestCalculationStrategy());
        minimumPaymentStrategy = new BronzeMinimumPaymentStrategy();
    }
}
