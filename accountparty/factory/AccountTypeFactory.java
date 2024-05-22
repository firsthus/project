package edu.mum.cs.cs525.labs.exercises.project.accountparty.factory;

import edu.mum.cs.cs525.labs.exercises.project.accountparty.entity.AccountType;
import edu.mum.cs.cs525.labs.exercises.project.accountparty.entity.InterestCalculationStrategy;

public interface AccountTypeFactory {

    AccountType provide();
}
