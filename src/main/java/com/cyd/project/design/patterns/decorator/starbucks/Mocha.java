package com.cyd.project.design.patterns.decorator.starbucks;

public class Mocha extends CondimentDecorator{

    Beverage beverage;
    /**
     * 想办法让被装饰者（饮料）被记录到实例变量中，这里把饮料当做构造器，
     * 再由构造器将此饮料记录在变量中。
     * @param beverage
     */
    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }
    /**
     * 描述的不仅仅是饮料，而是完整的饮料名。
     */
    @Override
    public String getDescription() {
        return beverage.getDescription() + ",Mocha";
    }

    /**
     * 计算带Mocha饮料的价钱，首先要把调用委托给装饰对象，以计算价钱，
     * 然后再加上Mocha的价钱。
     */
    @Override
    public double cost() {
        return 0.20 + beverage.cost();
    }
}
