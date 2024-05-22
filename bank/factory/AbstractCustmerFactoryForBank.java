package edu.mum.cs.cs525.labs.exercises.project.bank.factory;

import edu.mum.cs.cs525.labs.exercises.project.accountparty.factory.CustomerFactory;
import edu.mum.cs.cs525.labs.exercises.project.accountparty.repository.CustomerRepository;

public abstract class AbstractCustmerFactoryForBank implements CustomerFactory {
    CustomerRepository customerRepository = new CustomerRepository();


}
