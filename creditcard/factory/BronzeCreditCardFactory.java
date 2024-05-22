package edu.mum.cs.cs525.labs.exercises.project.creditcard.factory;

import edu.mum.cs.cs525.labs.exercises.project.accountparty.entity.Account;
import edu.mum.cs.cs525.labs.exercises.project.accountparty.entity.Customer;
import edu.mum.cs.cs525.labs.exercises.project.creditcard.entity.BronzeCreditCard;
import edu.mum.cs.cs525.labs.exercises.project.creditcard.entity.CreditCardAccount;
import edu.mum.cs.cs525.labs.exercises.project.creditcard.interestStrategy.BronzeCreditCardInterestCalculationStrategy;

public class BronzeCreditCardFactory extends AbstractAccountFactory{

    String accountNumber;
    @Override
    public Account createNewAccountForCustomer(Customer customer) {
        Account account = new CreditCardAccount(accountNumber,customer,new BronzeCreditCard(new BronzeCreditCardInterestCalculationStrategy()));
        accountRepository.save(account);
        return account;
    }
}
