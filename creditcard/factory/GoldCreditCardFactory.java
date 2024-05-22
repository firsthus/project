package edu.mum.cs.cs525.labs.exercises.project.creditcard.factory;

import edu.mum.cs.cs525.labs.exercises.project.accountparty.entity.Account;
import edu.mum.cs.cs525.labs.exercises.project.accountparty.entity.Customer;
import edu.mum.cs.cs525.labs.exercises.project.creditcard.entity.CreditCardAccount;
import edu.mum.cs.cs525.labs.exercises.project.creditcard.entity.GoldCreditCard;
import edu.mum.cs.cs525.labs.exercises.project.creditcard.interestStrategy.GoldCreditCardInterestCalculationStrategy;

public class GoldCreditCardFactory extends AbstractAccountFactory {
    String accountNumber;
    @Override
    public Account createNewAccountForCustomer(Customer customer) {
        Account account = new CreditCardAccount(accountNumber, customer, new GoldCreditCard(new GoldCreditCardInterestCalculationStrategy()));
        accountRepository.save(account);
        return account;
    }
}
