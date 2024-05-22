package edu.mum.cs.cs525.labs.exercises.project.creditcard.factory;

import edu.mum.cs.cs525.labs.exercises.project.accountparty.entity.AccountType;
import edu.mum.cs.cs525.labs.exercises.project.accountparty.factory.AccountTypeFactory;
import edu.mum.cs.cs525.labs.exercises.project.creditcard.entity.SilverCreditCard;

public class SilverCreditCardTypeFactory implements AccountTypeFactory {

    @Override
    public AccountType provide() {
        return new SilverCreditCard();
    }
}
