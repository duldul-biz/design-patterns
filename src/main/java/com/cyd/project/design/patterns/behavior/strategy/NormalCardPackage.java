package com.cyd.project.design.patterns.behavior.strategy;

/**
 * @Description
 * @Author changyandong@e6yun.com
 * @Emoji (゜ - ゜)つ干杯
 * @Created Date: 2019/6/12 13:49
 * @ClassName NormalCardPackage
 * @Version: 1.0
 */
public class NormalCardPackage implements CardPackage {
    @Override
    public void openCardPackage() {
        System.out.println("开启正常卡包");
    }
}
