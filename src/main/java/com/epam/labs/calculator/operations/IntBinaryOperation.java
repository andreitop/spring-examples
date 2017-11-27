package com.epam.labs.calculator.operations;

public class IntBinaryOperation implements BinaryOperation{

    private int firstValue;
    private int secondValue;

    public void setFirstValue(int firstValue) {
        this.firstValue = firstValue;
    }

    public void setSecondValue(int secondValue) {
        this.secondValue = secondValue;
    }

    public String sum() {
        return String.valueOf(firstValue + secondValue);
    }

    public String div() {
        return String.valueOf(firstValue / secondValue);
    }

    public String sub() {
        return String.valueOf(firstValue - secondValue);
    }
}
