package edu.mum.cs.cs525.labs.exercises.project.accountparty.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract class Customer {

    private String name;
    private String Street;
    private String City;
    private String State;
    private String Zip;
    private String email;

    private final List<Account> listOfAccounts;



    protected Customer(String name, String email,String Street, String City, String State, String Zip) {
        this.name = name;
        this.email = email;
        this.Street = Street;
        this.City = City;
        this.State = State;
        this.Zip = Zip;
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

    public String getStreet() {
        return Street;
    }

    public String getCity() {
        return City;
    }

    public String getState() {
        return State;
    }

    public String getZip() {
        return Zip;
    }


}
