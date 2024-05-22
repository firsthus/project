package edu.mum.cs.cs525.labs.exercises.project.creditcard.factory;

import edu.mum.cs.cs525.labs.exercises.project.accountparty.entity.Customer;
import edu.mum.cs.cs525.labs.exercises.project.creditcard.entity.Personal;

import java.time.LocalDate;

public class PersonalFactory extends AbstractCustomerFactory{
    LocalDate birthOfDate;
    @Override
    public Customer createCustomer(String name, String email, String street, String city, String state, String zip) {
        Customer customer = new Personal(name, email, street, city, state, zip, birthOfDate);
        return customer;
    }
}
