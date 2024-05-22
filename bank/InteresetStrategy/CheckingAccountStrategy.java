package edu.mum.cs.cs525.labs.exercises.project.bank.InteresetStrategy;

import edu.mum.cs.cs525.labs.exercises.project.accountparty.entity.Account;
import edu.mum.cs.cs525.labs.exercises.project.accountparty.entity.InterestCalculationStrategy;

import java.math.BigDecimal;

public class CheckingAccountStrategy implements InterestCalculationStrategy {
    private static CheckingAccountStrategy checkingStrategy;

    private CheckingAccountStrategy(){

    }

    @Override
    public BigDecimal calculateInterest(Account account) {
           return account.getBalance().multiply(BigDecimal.valueOf(0.02));
    }

    public static CheckingAccountStrategy getInstance(){
        if(checkingStrategy == null){
            checkingStrategy = new CheckingAccountStrategy();
        }
        return checkingStrategy;

    }

}


