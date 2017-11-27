package com.epam.labs.calculator;

import com.epam.labs.calculator.operations.BinaryOperation;

public class BinaryCalculator implements Calculator {

    private BinaryOperation binaryOperation;

    public BinaryCalculator(BinaryOperation binaryOperation) {
        this.binaryOperation = binaryOperation;
    }

    public String calculate() {
        return binaryOperation.div() + " " +
                binaryOperation.sum()+ " " +
                binaryOperation.sub();
    }
}
