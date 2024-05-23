package edu.mum.cs.cs525.labs.exercises.project.creditcard.factory;

import edu.mum.cs.cs525.labs.exercises.project.creditcard.entity.CreditCardAccountType;
import edu.mum.cs.cs525.labs.exercises.project.creditcard.entity.SilverCreditCard;

public class SilverCreditCardTypeFactory implements CreditCardAccountTypeFactory {

    @Override
    public CreditCardAccountType provide() {
        return new SilverCreditCard();
    }
}
