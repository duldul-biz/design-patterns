package com.cyd.project.design.patterns.decorator.starbucks;

public class Decaf extends Beverage{

    @Override
    public double cost() {
        return 88;
    }

    public Decaf() {
        description = "Decaf Coffee";
    }
}
