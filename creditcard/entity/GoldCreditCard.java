package edu.mum.cs.cs525.labs.exercises.project.creditcard.entity;

import edu.mum.cs.cs525.labs.exercises.project.accountparty.entity.AccountType;
import edu.mum.cs.cs525.labs.exercises.project.accountparty.entity.InterestCalculationStrategy;
import edu.mum.cs.cs525.labs.exercises.project.creditcard.interestStrategy.GoldCreditCardInterestCalculationStrategy;
import edu.mum.cs.cs525.labs.exercises.project.creditcard.minimumPaymentStrategy.GoldMinimumPaymentStrategy;
import edu.mum.cs.cs525.labs.exercises.project.creditcard.minimumPaymentStrategy.MinimumPaymentStrategy;

public class GoldCreditCard extends AccountType {

    private final MinimumPaymentStrategy minimumPaymentStrategy;


    public GoldCreditCard() {
        super(new GoldCreditCardInterestCalculationStrategy());
        minimumPaymentStrategy = new GoldMinimumPaymentStrategy();
    }
}
