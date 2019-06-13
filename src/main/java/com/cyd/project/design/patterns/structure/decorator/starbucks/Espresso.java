package com.cyd.project.design.patterns.structure.decorator.starbucks;

public class Espresso extends Beverage{

    /**
     * 为了设置饮料的描述
     */
    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
