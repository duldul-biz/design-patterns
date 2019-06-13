package com.cyd.project.design.patterns.behavior.chain;

import java.util.Objects;

/**
 * @Description  抽象类 饮料  定义了whatDrink 和 setNextDrink
 * @Author changyandong@e6yun.com
 * @Emoji (゜ - ゜)つ干杯
 * @Created Date: 2019/6/12 16:27
 * @InterfaceName Drink
 * @Version: 1.0
 */
public abstract class Drink {
    private Drink next;

    public Drink setNextDrink(Drink next){
        this.next = next;
        return this;
    }

    public Drink whatDrink(String drinkName){
        if(Objects.equals(drinkName,getDrinkName())){
            return this;
        }
        return next.whatDrink(drinkName);
    }

    /**
     * 获取当前饮料的名字
     * @return
     */
    abstract String getDrinkName();
}
