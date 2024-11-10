package com.aslbank.calculadora.controller;

import com.aslbank.calculadora.model.Calculator;

public class ControlCalculator {

    private Calculator calculator;

    public ControlCalculator() {
        this.calculator = new Calculator();
    }

    public Calculator getCalculator() {
        return calculator;
    }
}
