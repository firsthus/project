package edu.mum.cs.cs525.labs.exercises.project.creditcard.factory;

import edu.mum.cs.cs525.labs.exercises.project.accountparty.entity.Account;
import edu.mum.cs.cs525.labs.exercises.project.accountparty.entity.AccountType;
import edu.mum.cs.cs525.labs.exercises.project.accountparty.entity.Customer;
import edu.mum.cs.cs525.labs.exercises.project.accountparty.entity.InterestCalculationStrategy;
import edu.mum.cs.cs525.labs.exercises.project.accountparty.factory.AccountTypeFactory;
import edu.mum.cs.cs525.labs.exercises.project.creditcard.entity.CreditCardAccount;
import edu.mum.cs.cs525.labs.exercises.project.creditcard.entity.GoldCreditCard;
import edu.mum.cs.cs525.labs.exercises.project.creditcard.interestStrategy.GoldCreditCardInterestCalculationStrategy;

public class GoldCreditCardTypeFactory implements AccountTypeFactory {

    @Override
    public AccountType provide() {
        return new GoldCreditCard();
    }
}
