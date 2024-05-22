package edu.mum.cs.cs525.labs.exercises.project.creditcard.entity;

import edu.mum.cs.cs525.labs.exercises.project.accountparty.entity.AccountType;
import edu.mum.cs.cs525.labs.exercises.project.accountparty.entity.InterestCalculationStrategy;
import edu.mum.cs.cs525.labs.exercises.project.creditcard.interestStrategy.BronzeCreditCardInterestCalculationStrategy;
import edu.mum.cs.cs525.labs.exercises.project.creditcard.minimumPaymentStrategy.BronzeMinimumPaymentStrategy;
import edu.mum.cs.cs525.labs.exercises.project.creditcard.minimumPaymentStrategy.MinimumPaymentStrategy;

public class BronzeCreditCard extends AccountType {
    private final MinimumPaymentStrategy minimumPaymentStrategy;
    public BronzeCreditCard() {
        super(new BronzeCreditCardInterestCalculationStrategy());
        minimumPaymentStrategy = new BronzeMinimumPaymentStrategy();
    }
}
