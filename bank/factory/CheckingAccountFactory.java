package edu.mum.cs.cs525.labs.exercises.project.bank.factory;

import edu.mum.cs.cs525.labs.exercises.project.accountparty.entity.Account;
import edu.mum.cs.cs525.labs.exercises.project.accountparty.entity.AccountType;
import edu.mum.cs.cs525.labs.exercises.project.accountparty.entity.Customer;
import edu.mum.cs.cs525.labs.exercises.project.accountparty.entity.InterestCalculationStrategy;
import edu.mum.cs.cs525.labs.exercises.project.bank.InteresetStrategy.CheckingAccountStrategy;
import edu.mum.cs.cs525.labs.exercises.project.bank.entity.PersonalAccount;
import edu.mum.cs.cs525.labs.exercises.project.bank.entity.SavingsAccount;

public class CheckingAccountFactory extends AbstractAccountFactoryForBank {


    String CheckingsAccountNumber;

    public CheckingAccountFactory(String CheckingsAccountNumber) {
        this.CheckingsAccountNumber = CheckingsAccountNumber;
    }


    @Override
    public Account createNewAccountForCustomer(Customer customer) {
        InterestCalculationStrategy CheckingInterestStrategy = new CheckingAccountStrategy();
        AccountType CheckingAccountType = new SavingsAccount(CheckingInterestStrategy);

        Account personalSavingAccount = new PersonalAccount(CheckingsAccountNumber,customer,CheckingAccountType);
        accountRepository.save(personalSavingAccount);
        return  personalSavingAccount;
    }

}
