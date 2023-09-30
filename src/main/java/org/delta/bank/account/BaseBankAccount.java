package org.delta.bank.account;

import org.delta.bank.persons.Owner;
public class BaseBankAccount {
     private Owner owner ;
     private double balance;
     private String accountNumber;

    public BaseBankAccount(Owner owner, double balance, String accountNumber) {
         this.balance = balance;
         this.accountNumber = accountNumber;
         this.owner = owner;
    }

    public void SetBalance (double balance) {
        this.balance = balance;
    }
    public Owner getOwner() {
        return owner;
    }
    public double getBalance() {
            return balance;
    }
    public String getAccountNumber() {
            return accountNumber;
    }
}
