package edu.mum.cs.cs525.labs.exercises.project.creditcard.entity;

import edu.mum.cs.cs525.labs.exercises.project.accountparty.entity.AccountType;
import edu.mum.cs.cs525.labs.exercises.project.creditcard.strategy.interestStrategy.GoldCreditCardInterestCalculationStrategy;
import edu.mum.cs.cs525.labs.exercises.project.creditcard.strategy.minimumPaymentStrategy.GoldMinimumPaymentStrategy;
import edu.mum.cs.cs525.labs.exercises.project.creditcard.strategy.minimumPaymentStrategy.MinimumPaymentStrategy;

public class GoldCreditCard extends AccountType {

    private final MinimumPaymentStrategy minimumPaymentStrategy;


    public GoldCreditCard() {
        super(new GoldCreditCardInterestCalculationStrategy());
        minimumPaymentStrategy = new GoldMinimumPaymentStrategy();
    }

    public MinimumPaymentStrategy getMinimumPaymentStrategy() {
        return minimumPaymentStrategy;
    }
}
