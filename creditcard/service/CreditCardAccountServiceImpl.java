package edu.mum.cs.cs525.labs.exercises.project.creditcard.service;

import edu.mum.cs.cs525.labs.exercises.project.accountparty.entity.Account;
import edu.mum.cs.cs525.labs.exercises.project.accountparty.entity.AccountEntry;
import edu.mum.cs.cs525.labs.exercises.project.accountparty.entity.Customer;
import edu.mum.cs.cs525.labs.exercises.project.accountparty.entity.TransactionType;
import edu.mum.cs.cs525.labs.exercises.project.accountparty.repository.AccountRepository;
import edu.mum.cs.cs525.labs.exercises.project.accountparty.rule.RulesEngine;
import edu.mum.cs.cs525.labs.exercises.project.accountparty.service.AccountTransactionService;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.YearMonth;
import java.util.List;

public class CreditCardAccountServiceImpl extends AccountTransactionService {
    public CreditCardAccountServiceImpl(AccountRepository accountRepository, RulesEngine rulesEngine) {
        super(accountRepository, rulesEngine);
    }

    public String generateReport() {
        List<Account> accounts = getAccountRepository().getAllAccounts();
        StringBuilder report = new StringBuilder("Credit Card Monthly Reports:\n");

        YearMonth lastMonth = YearMonth.now().minusMonths(0);
        LocalDate from = lastMonth.atDay(1);
        LocalDate to = lastMonth.atEndOfMonth();

        for (Account account : accounts) {

            BigDecimal previousBalance = account.getPreviousBalance();
            BigDecimal totalCharges = BigDecimal.ZERO;
            BigDecimal totalCredits = BigDecimal.ZERO;

            for (AccountEntry entry : account.getEntryList()) {
                System.out.println(entry.generateEntryReport());
                if (entry.getTransactionDate().toLocalDate().isAfter(from) && entry.getTransactionDate().toLocalDate().isBefore(to)) {
                    if (entry.getTransactionType() == TransactionType.CREDIT) {
                        totalCredits = totalCredits.add(entry.getAmount());
                        System.out.println("   totalCredits = " + totalCredits);
                    } else if (entry.getTransactionType() == TransactionType.DEBIT) {
                        totalCharges = totalCharges.add(entry.getAmount());
                        System.out.println("   totalCharges = " + totalCharges);
                    }
                }
            }

            BigDecimal newBalance = previousBalance.subtract(totalCredits).add(totalCharges).add(
                    (previousBalance.subtract(totalCredits)).multiply(new BigDecimal("0.01")));
            BigDecimal totalDue = newBalance.multiply(new BigDecimal("0.10")); // Assuming minimum payment percentage is 10%
            if (totalDue.compareTo(BigDecimal.ZERO) < 0) {
                totalDue = BigDecimal.ZERO;
            }

            Customer owner = account.getAccountOwner();
            String address = owner.getStreet() + ", " + owner.getCity() + ", " + owner.getState() + ", " + owner.getZip();

            report.append("Name= ").append(owner.getName()).append("\r\n");
            report.append("Address= ").append(address).append("\r\n");
            report.append("CC number= ").append(account.getAccountNumber()).append("\r\n");
            //report.append("CC type= ").append(account.getAccountType().getClass().getSimpleName().toUpperCase()).append("\r\n");
            report.append("Previous balance = $ ").append(previousBalance.setScale(2, RoundingMode.HALF_UP)).append("\r\n");
            report.append("Total Credits = $ ").append(totalCredits.setScale(2, RoundingMode.HALF_UP)).append("\r\n");
            report.append("Total Charges = $ ").append(totalCharges.setScale(2, RoundingMode.HALF_UP)).append("\r\n");
            report.append("New balance = $ ").append(newBalance.setScale(2, RoundingMode.HALF_UP)).append("\r\n");
            report.append("Total amount due = $ ").append(totalDue.setScale(2, RoundingMode.HALF_UP)).append("\r\n");
            report.append("\r\n");

            account.setPreviousBalance(newBalance);
            getAccountRepository().update(account);
            report.append("\n\n");
        }
        return report.toString();
    }

}