package com.epam.labs.calculator.operations;

public class DoubleBinaryOperation implements BinaryOperation{

    private double firstValue;
    private double secondValue;

    public void setFirstValue(double firstValue) {
        this.firstValue = firstValue;
    }

    public void setSecondValue(double secondValue) {
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
