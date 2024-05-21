package edu.mum.cs.cs525.labs.exercises.project.accountparty.entity;

import java.util.ArrayList;
import java.util.List;

public abstract class Customer {

    private String name;

    private String email;

    private final List<Account> listOfAccounts;



    protected Customer(String name, String email) {
        this.name = name;
        this.email = email;
        listOfAccounts = new ArrayList<>();
    }



    public String getName() {
        return name;
    }



    public void setName(String name) {
        this.name = name;
    }



    public String getEmail() {
        return email;
    }



    public void setEmail(String email) {
        this.email = email;
    }


    public void addAccount(Account account){
        listOfAccounts.add(account);
    }


    public List<Account> getAccounts(){
        return listOfAccounts;
    }
}
