package edu.mum.cs.cs525.labs.exercises.project.creditcard.entity;

import edu.mum.cs.cs525.labs.exercises.project.accountparty.entity.Customer;

public class Company extends Customer {
    private int numberOfEmployees;

    public Company(String name, String email, String street, String city, String state, String zip, int numberOfEmployees) {
        super(name, email, street, city, state, zip);
        this.numberOfEmployees = numberOfEmployees;
    }
}
