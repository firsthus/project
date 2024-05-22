package edu.mum.cs.cs525.labs.exercises.project.creditcard.service.impl;

import edu.mum.cs.cs525.labs.exercises.project.accountparty.entity.Customer;
import edu.mum.cs.cs525.labs.exercises.project.creditcard.entity.CCCustomer;
import edu.mum.cs.cs525.labs.exercises.project.creditcard.entity.Company;
import edu.mum.cs.cs525.labs.exercises.project.creditcard.service.CustomerService;

public class CustomerServiceImpl implements CustomerService {

    @Override
    public Customer createCustomer(String name, String email, String street, String city, String state, String zip) {
        Customer customer = new CCCustomer(name, email, street, city, state, zip);
        return customer;
    }
}
