package edu.mum.cs.cs525.labs.exercises.project.creditcard.service.impl;

import edu.mum.cs.cs525.labs.exercises.project.accountparty.entity.Account;
import edu.mum.cs.cs525.labs.exercises.project.accountparty.factory.AccountTypeFactory;
import edu.mum.cs.cs525.labs.exercises.project.accountparty.repository.AccountRepository;
import edu.mum.cs.cs525.labs.exercises.project.accountparty.service.AccountService;
import edu.mum.cs.cs525.labs.exercises.project.creditcard.entity.CCCustomer;
import edu.mum.cs.cs525.labs.exercises.project.creditcard.entity.SilverCreditCard;
import edu.mum.cs.cs525.labs.exercises.project.creditcard.factory.BronzeCreditCardTypeFactory;
import edu.mum.cs.cs525.labs.exercises.project.creditcard.factory.CreditCardAccountFactory;
import edu.mum.cs.cs525.labs.exercises.project.creditcard.factory.GoldCreditCardTypeFactory;
import edu.mum.cs.cs525.labs.exercises.project.creditcard.factory.SilverCreditCardTypeFactory;

import java.time.LocalDate;

public class CreditCardAccountServiceImpl extends AccountService {
    private LocalDate expireDate;
    private String CCNumber;
    public CreditCardAccountServiceImpl(AccountRepository accountRepository) {
        super(accountRepository);
    }

    public Account createCreditCardAccountForCustomer(CCCustomer customer, String creditCardType) {
        AccountTypeFactory creditCard;
        switch (creditCardType) {
            case "Gold":
                creditCard = new GoldCreditCardTypeFactory();
                break;
            case "Silver":
                creditCard = new SilverCreditCardTypeFactory();
                break;
            case "Bronze":
                creditCard = new BronzeCreditCardTypeFactory();
                break;
            default:
                throw new IllegalArgumentException("Unknown credit card type!");
        }
        Account customerWithCreditCard = new CreditCardAccountFactory().createNewAccountForCustomer(customer, creditCard);
        this.getAccountRepository().save(customerWithCreditCard);
        return customerWithCreditCard;
    }
}
