package com.cyd.project.design.patterns.decorator.starbucks;

public abstract class Beverage {

    protected String description = "Unknown Beverage";

    /**
     * @description: 商品描述
     * @date: 2018年9月3日上午10:39:51
     * @param:@return
     */
    public String getDescription(){
        return description;
    }
    /**
     * @description: 计算价格1
     * @date: 2018年9月3日上午10:39:35
     * @param:@return
     */
    public abstract double cost();
}
