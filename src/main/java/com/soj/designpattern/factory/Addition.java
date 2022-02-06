package com.soj.designpattern.factory;

public class Addition implements Operator {
    public double calculate(double a, double b) {
        return a + b;
    }
}
