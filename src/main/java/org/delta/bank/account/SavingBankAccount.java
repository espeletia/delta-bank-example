package org.delta.bank.account;

import org.delta.bank.persons.Owner;

public class SavingBankAccount extends BaseBankAccount {
    public SavingBankAccount(Owner owner, String accountNumber, double balance) {
        super(owner, balance, accountNumber);
    }
}