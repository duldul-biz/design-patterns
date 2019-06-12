package com.cyd.project.design.patterns.strategy;

/**
 * @Description
 * @Author changyandong@e6yun.com
 * @Emoji (゜ - ゜)つ干杯
 * @Created Date: 2019/6/12 13:50
 * @ClassName DiamondCardPackage
 * @Version: 1.0
 */
public class DiamondCardPackage implements CardPackage {
    @Override
    public void openCardPackage() {
        System.out.println("开启钻石卡包");
    }
}
