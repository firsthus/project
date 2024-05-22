package edu.mum.cs.cs525.labs.exercises.project.creditcard.factory;

import edu.mum.cs.cs525.labs.exercises.project.accountparty.entity.Account;
import edu.mum.cs.cs525.labs.exercises.project.accountparty.entity.Customer;
import edu.mum.cs.cs525.labs.exercises.project.creditcard.entity.CreditCardAccount;
import edu.mum.cs.cs525.labs.exercises.project.creditcard.entity.SilverCreditCard;
import edu.mum.cs.cs525.labs.exercises.project.creditcard.interestStrategy.SilverCreditCardInterestCalculationStrategy;

public class SilverCreditCardFactory extends AbstractAccountFactory{
    String accountNumber;
    @Override
    public Account createNewAccountForCustomer(Customer customer) {
        Account account = new CreditCardAccount(accountNumber, customer, new SilverCreditCard(new SilverCreditCardInterestCalculationStrategy()));
        accountRepository.save(account);
        return account;
    }
}
