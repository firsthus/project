package edu.mum.cs.cs525.labs.exercises.project.accountparty.service;

import edu.mum.cs.cs525.labs.exercises.project.accountparty.entity.Account;
import edu.mum.cs.cs525.labs.exercises.project.accountparty.notification.Observable;
import edu.mum.cs.cs525.labs.exercises.project.accountparty.notification.Observer;
import edu.mum.cs.cs525.labs.exercises.project.accountparty.repository.AccountRepository;
import edu.mum.cs.cs525.labs.exercises.project.bank.entity.CompanyAccount;
import edu.mum.cs.cs525.labs.exercises.project.bank.entity.PersonalAccount;

import java.math.BigDecimal;
import java.util.*;

public class AccountTransactionService implements Observable {

    Map<String, List<Observer>> listeners = new HashMap<>();

    private final AccountRepository accountRepository;


    public AccountTransactionService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }


    public void deposit(String accountNumber, BigDecimal amount) {
        Account account = accountRepository.findByAccountNumber(accountNumber);
        account.deposit(amount);
        notifyObservers("email", account, "Deposit of " + amount + " was successful", amount);
    }

    public void withdraw(String accountNumber, BigDecimal amount) {
        Account account = accountRepository.findByAccountNumber(accountNumber);
        account.withdraw(amount);
        notifyObservers("email", account, "Withdrawal of " + amount + " was successful", amount);
    }

    public void transferFunds(String fromAccountNumber, String toAccountNumber, BigDecimal amount, String description) {
        Account fromAccount = accountRepository.findByAccountNumber(fromAccountNumber);
        Account toAccount = accountRepository.findByAccountNumber(toAccountNumber);
        fromAccount.transferFunds(toAccount, amount);
    }

    @Override
    public void add(String eventType, Observer o) {
        List<Observer> observers = listeners.computeIfAbsent(eventType, k -> new ArrayList<>());
        observers.add(o);
    }

    @Override
    public void remove(String eventType, Observer o) {
        List<Observer> observers = listeners.computeIfAbsent(eventType, k -> new ArrayList<>());
        observers.remove(o);
    }

    @Override
    public void notifyObservers(String notificationType, Account account, String message, BigDecimal amount) {
        List<Observer> observers = listeners.get(notificationType);
        if (account instanceof CompanyAccount) {
            for (Observer listener : observers) {
                listener.send(account.getAccountOwner().getEmail(), message);
            }
        } else if (account instanceof PersonalAccount) {
            if (amount.compareTo(BigDecimal.valueOf(400)) > 0 || account.getBalance().compareTo(BigDecimal.ZERO) < 0) {
                for (Observer listener : observers) {
                    listener.send(account.getAccountOwner().getEmail(), message);
                }
            }
        }
    }

}
