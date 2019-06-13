package com.cyd.project.design.patterns.behavior.template;

/**
 * @Description
 * @Author changyandong@e6yun.com
 * @Emoji (゜ - ゜)つ干杯
 * @Created Date: 2019/6/12 14:13
 * @ClassName RichManGetUp
 * @Version: 1.0
 */
public class RichManGetUp implements GetUp {
    @Override
    public void wearClothes() {
        System.out.println("佣人给穿衣");
    }

    @Override
    public void wearPants() {
        System.out.println("佣人给穿裤子");
    }

    @Override
    public void washFace() {
        System.out.println("使用名牌洗面奶");
    }

    @Override
    public void brushTeeth() {
        System.out.println("使用电动牙刷");
    }

    @Override
    public void doSomeThing() {
        System.out.println("出门搞事");
    }
}
