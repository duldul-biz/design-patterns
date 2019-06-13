package com.cyd.project.design.patterns.structure.decorator.starbucks;

public abstract class CondimentDecorator extends Beverage{

    /**
     * 所有调料装饰者都必须重新实现getDescription()方法
     */
    public abstract String getDescription();
}