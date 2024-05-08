package org.javaguru.banktransactions.expensesanalyser;

import org.javaguru.banktransactions.domain.Transaction;

import java.util.ArrayList;
import java.util.List;

abstract class ExpensesCalculator {

    protected List<Transaction> filterWithdrawalTransactions(Transaction[] transactions) {
        List<Transaction> withdrawalTransactions = new ArrayList<>();
        for (Transaction transaction : transactions) {
            if (transaction.isWithdrawal()) {
                withdrawalTransactions.add(transaction);
            }
        }
        return withdrawalTransactions;
    }

    protected int sumTransactionAmount(List<Transaction> transactions) {
        int foodExpensesAmount = 0;
        for (Transaction transaction : transactions) {
            foodExpensesAmount = foodExpensesAmount + transaction.amount();
        }
        return foodExpensesAmount;
    }

}
