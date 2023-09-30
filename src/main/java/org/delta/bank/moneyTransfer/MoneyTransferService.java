package org.delta.bank.moneyTransfer;

import org.delta.bank.account.BaseBankAccount;
import org.delta.bank.validate.ValidateMoneyService;

public class MoneyTransferService {
    private final ValidateMoneyService validateMoneyService = new ValidateMoneyService();
    private final FeeCalculationService feeCalculationService = new FeeCalculationService();

    public void transferMoney(BaseBankAccount sourceAccount, BaseBankAccount destinationAccount, double amount) throws Exception {
        double amountWithFee = amount + feeCalculationService.calculateFee(sourceAccount, amount);

        validateMoneyService.ValidateMoney(sourceAccount, amountWithFee);

        sourceAccount.SetBalance(sourceAccount.getBalance() - amountWithFee);
        destinationAccount.SetBalance(destinationAccount.getBalance() + amount);
    }

    public void withdrawMoneyFromATM(BaseBankAccount sourceAccount, double amount) throws Exception {
        double amountWithFee = amount + feeCalculationService.calculateFee(sourceAccount, amount);

        validateMoneyService.ValidateMoney(sourceAccount, amountWithFee);

        sourceAccount.SetBalance(sourceAccount.getBalance() - amountWithFee);
    }
}