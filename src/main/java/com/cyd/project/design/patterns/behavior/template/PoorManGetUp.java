package com.cyd.project.design.patterns.behavior.template;

/**
 * @Description
 * @Author changyandong@e6yun.com
 * @Emoji (゜ - ゜)つ干杯
 * @Created Date: 2019/6/12 14:14
 * @ClassName PoorManGetUp
 * @Version: 1.0
 */
public class PoorManGetUp implements GetUp {
    @Override
    public void wearClothes() {
        System.out.println("自己穿破洞衣服");
    }

    @Override
    public void wearPants() {
        System.out.println("自己穿破洞裤子");
    }

    @Override
    public void washFace() {
        System.out.println("用肥皂洗脸");
    }

    @Override
    public void brushTeeth() {
        System.out.println("用盐和手指刷牙");
    }

    @Override
    public void doSomeThing() {
        System.out.println("出门给富人打工");
    }
}
