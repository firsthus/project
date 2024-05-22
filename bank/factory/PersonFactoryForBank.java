package edu.mum.cs.cs525.labs.exercises.project.bank.factory;

import edu.mum.cs.cs525.labs.exercises.project.accountparty.entity.Customer;
import edu.mum.cs.cs525.labs.exercises.project.accountparty.factory.AccountFactory;
import edu.mum.cs.cs525.labs.exercises.project.bank.entity.Custmers.Person;

import java.time.LocalDate;

public class PersonFactoryForBank extends AbstractCustmerFactoryForBank {

    LocalDate dateOfBirth;

    public PersonFactoryForBank(LocalDate dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
    }

    @Override
    public Customer createCustomer(String name, String email, String street, String city, String state, String zip) {

        Customer person=  new Person(name, email,street,city, state,zip,dateOfBirth);
        customerRepository.save(person);
        return person;
    }
}
