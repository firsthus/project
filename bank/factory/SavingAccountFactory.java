package edu.mum.cs.cs525.labs.exercises.project.bank.factory;

import edu.mum.cs.cs525.labs.exercises.project.accountparty.entity.Account;
import edu.mum.cs.cs525.labs.exercises.project.accountparty.entity.AccountType;
import edu.mum.cs.cs525.labs.exercises.project.accountparty.entity.Customer;
import edu.mum.cs.cs525.labs.exercises.project.accountparty.entity.InterestCalculationStrategy;
import edu.mum.cs.cs525.labs.exercises.project.bank.InteresetStrategy.SavingInterestStrategy;
import edu.mum.cs.cs525.labs.exercises.project.bank.entity.PersonalAccount;
import edu.mum.cs.cs525.labs.exercises.project.bank.entity.SavingsAccount;

public class SavingAccountFactory extends AbstractAccountFactoryForBank {


    String SavingsAccountNumber;
    public SavingAccountFactory(String SavingsAccountNumber) {

        this.SavingsAccountNumber = SavingsAccountNumber;

    }



    @Override
    public Account createNewAccountForCustomer(Customer customer) {
        InterestCalculationStrategy SavingInterestStrategy = new SavingInterestStrategy();
        AccountType SavingsAccountType = new SavingsAccount(SavingInterestStrategy);

        Account personalSavingAccount = new PersonalAccount(SavingsAccountNumber,customer,SavingsAccountType);
        accountRepository.save(personalSavingAccount);
        return  personalSavingAccount;
    }
}
