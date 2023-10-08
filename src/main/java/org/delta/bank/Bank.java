package org.delta.bank;

import org.delta.bank.account.BaseBankAccount;
import org.delta.bank.account.SavingBankAccount;
import org.delta.bank.account.StudentBankAccount;
import org.delta.bank.interest.InterestApplicator;
import org.delta.bank.persons.Owner;
import org.delta.bank.print.LogService;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    public void run() throws Exception {
        LogService logService = new LogService();

        Owner owner1 = new Owner("John", "Doe");

        List<BaseBankAccount> accounts = new ArrayList<>();

        accounts.add(new BaseBankAccount(owner1, 10000, "1"));
        accounts.add(new SavingBankAccount(owner1, "2", 10000));
        accounts.add(new StudentBankAccount(owner1, "3", 10000));

        logService.log("Before:");
        for (BaseBankAccount account : accounts) {
            logService.logAccountInfo(account);
        }

        InterestApplicator interestApplicator = new InterestApplicator();

        for (BaseBankAccount account : accounts) {
            if (account == null) {
                continue;
            }

            interestApplicator.applyInterest(account);
        }

        logService.log("After:");
        for (BaseBankAccount account : accounts) {
            logService.logAccountInfo(account);
        }
    }
}