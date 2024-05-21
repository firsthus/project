package edu.mum.cs.cs525.labs.exercises.project.accountparty.repository;

import edu.mum.cs.cs525.labs.exercises.project.accountparty.entity.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepository {


    private static final List<Customer> CUSTOMER_DB = new ArrayList<>();


    public Customer findByEmail(String email) {
        return CUSTOMER_DB.stream().filter(customer -> customer.getEmail().equals(email))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Customer not found"));
    }


    public void save(Customer customer) {
        CUSTOMER_DB.add(customer);
    }

}
