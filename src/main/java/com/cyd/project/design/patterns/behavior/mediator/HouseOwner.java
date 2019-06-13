package com.cyd.project.design.patterns.behavior.mediator;

/**
 * @Description
 * @Author changyandong@e6yun.com
 * @Emoji (゜ - ゜)つ干杯
 * @Created Date: 2019/6/13 11:35
 * @ClassName HouseOwner
 * @Version: 1.0
 */
public class HouseOwner extends Person {

    public HouseOwner(String name, Mediator mediator) {
        super(name,mediator);
    }

    public void doSomeThing(String message){
        System.out.println("我是房东"+message);
    }
}
