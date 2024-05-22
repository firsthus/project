package edu.mum.cs.cs525.labs.exercises.project.creditcard.factory;

import edu.mum.cs.cs525.labs.exercises.project.accountparty.entity.Customer;
import edu.mum.cs.cs525.labs.exercises.project.creditcard.entity.Company;

public class CompanyFactory extends AbstractCustomerFactory{
    private int numberOfEmployees;

    @Override
    public Customer createCustomer(String name, String email, String street, String city, String state, String zip) {
        Customer company = new Company(name, email, street, city, state, zip, numberOfEmployees);
        return company;
    }
}
