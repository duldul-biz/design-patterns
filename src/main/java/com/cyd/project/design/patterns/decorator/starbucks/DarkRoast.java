package com.cyd.project.design.patterns.decorator.starbucks;

public class DarkRoast extends Beverage{

    public DarkRoast() {
        description = "DarkRost Coffer";
    }

    @Override
    public double cost() {
        return 99;
    }
}