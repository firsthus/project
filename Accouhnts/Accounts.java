package edu.mum.cs.cs525.labs.exercises.project.Accouhnts;

public abstract class Accounts {
    String AccountNumber;
    String AccountType;


    public abstract void deposite();

    public abstract void withdraw();

    public abstract void addInterest();

    public abstract void GenerateReport();
}
