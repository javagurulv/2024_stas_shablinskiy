package org.javaguru.banktransactions.expensesanalyser;

import org.javaguru.banktransactions.domain.ExpenseCategory;

class GamblingExpensesCalculator extends ExpensesCalculator {
    @Override
    protected ExpenseCategory getExpenseCategory() {
        return ExpenseCategory.GAMBLING;
    }
}

