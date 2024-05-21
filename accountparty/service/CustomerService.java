package edu.mum.cs.cs525.labs.exercises.project.accountparty.service;

import edu.mum.cs.cs525.labs.exercises.project.accountparty.entity.Customer;
import edu.mum.cs.cs525.labs.exercises.project.accountparty.repository.CustomerRepository;

public class CustomerService {

    private final CustomerRepository customerRepository;



    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }


}
