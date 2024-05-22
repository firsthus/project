package edu.mum.cs.cs525.labs.exercises.project.creditcard.entity;

import edu.mum.cs.cs525.labs.exercises.project.accountparty.entity.AccountType;
import edu.mum.cs.cs525.labs.exercises.project.creditcard.strategy.interestStrategy.SilverCreditCardInterestCalculationStrategy;
import edu.mum.cs.cs525.labs.exercises.project.creditcard.strategy.minimumPaymentStrategy.MinimumPaymentStrategy;
import edu.mum.cs.cs525.labs.exercises.project.creditcard.strategy.minimumPaymentStrategy.SilverMinimumPaymentStrategy;

public class SilverCreditCard extends AccountType {
    private final MinimumPaymentStrategy minimumPaymentStrategy;
    public SilverCreditCard() {
        super(new SilverCreditCardInterestCalculationStrategy());
        minimumPaymentStrategy = new SilverMinimumPaymentStrategy();
    }
}
