package edu.mum.cs.cs525.labs.exercises.project.creditcard.factory;

import edu.mum.cs.cs525.labs.exercises.project.accountparty.entity.Customer;
import edu.mum.cs.cs525.labs.exercises.project.accountparty.factory.CustomerFactory;
import edu.mum.cs.cs525.labs.exercises.project.accountparty.repository.AccountRepository;
import edu.mum.cs.cs525.labs.exercises.project.accountparty.repository.CustomerRepository;

public abstract class AbstractCustomerFactory implements CustomerFactory {
    CustomerRepository customerRepository = new CustomerRepository();
}
