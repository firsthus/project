package edu.mum.cs.cs525.labs.exercises.project.bank.factory;

import edu.mum.cs.cs525.labs.exercises.project.accountparty.entity.Customer;
import edu.mum.cs.cs525.labs.exercises.project.accountparty.factory.AccountFactory;
import edu.mum.cs.cs525.labs.exercises.project.bank.entity.Custmers.Company;
import edu.mum.cs.cs525.labs.exercises.project.bank.entity.Custmers.Person;

import java.time.LocalDate;

public class CompanyFactoryForBank extends AbstractCustmerFactoryForBank{
    private int numberOfEmployee;

//    public CompanyFactoryForBank(int numberOfEmployee) {
//
//        this.numberOfEmployee = numberOfEmployee;
//    }
public CompanyFactoryForBank() {

}

    @Override
    public Customer createCustomer(String name, String email, String street, String city, String state, String zip) {

        Customer Company=  new Company(name,email,street,city,state,zip,numberOfEmployee);
        customerRepository.save(Company);

        return Company;
    }
}
