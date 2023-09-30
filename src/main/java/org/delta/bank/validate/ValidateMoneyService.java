package org.delta.bank.validate;

import org.delta.bank.account.BaseBankAccount;

public class ValidateMoneyService {
    public void ValidateMoney(BaseBankAccount Source, double balance) throws Exception {
        if (Source.getBalance() < balance) {
            throw new Exception("Amount cannot be negative silly >_<!");
        }
    }
}
