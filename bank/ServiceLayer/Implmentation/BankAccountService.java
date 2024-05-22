package edu.mum.cs.cs525.labs.exercises.project.bank.ServiceLayer.Implmentation;

import edu.mum.cs.cs525.labs.exercises.project.accountparty.entity.Account;
import edu.mum.cs.cs525.labs.exercises.project.accountparty.entity.Customer;
import edu.mum.cs.cs525.labs.exercises.project.accountparty.factory.AccountTypeFactory;
import edu.mum.cs.cs525.labs.exercises.project.accountparty.repository.AccountRepository;
import edu.mum.cs.cs525.labs.exercises.project.accountparty.service.AccountService;
import edu.mum.cs.cs525.labs.exercises.project.bank.factory.BankAccountFactory;
import edu.mum.cs.cs525.labs.exercises.project.bank.factory.CheckingTypeFactory;
import edu.mum.cs.cs525.labs.exercises.project.bank.factory.SavingTypeFactory;

public class BankAccountService extends AccountService {


    public BankAccountService(AccountRepository accountRepository) {
        super(accountRepository);
    }

    public Account createAccount(Customer customer, String accountType) {

        AccountTypeFactory accountTypeFactory;
        if(accountType.equalsIgnoreCase("Ch")) {
            accountTypeFactory = new CheckingTypeFactory();
        }else{
            accountTypeFactory = new SavingTypeFactory();
        }

        BankAccountFactory bankAccountFactory = new BankAccountFactory();
        Account account= bankAccountFactory.createNewAccountForCustomer(customer,accountTypeFactory);

        this.getAccountRepository().save(account);
        return account;

    }


    @Override
    public String generateReport() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
