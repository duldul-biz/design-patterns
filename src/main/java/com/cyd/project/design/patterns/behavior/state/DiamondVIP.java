package com.cyd.project.design.patterns.behavior.state;

/**
 * @Description
 * @Author changyandong@e6yun.com
 * @Emoji (゜ - ゜)つ干杯
 * @Created Date: 2019/6/13 9:41
 * @ClassName DiamondVIP
 * @Version: 1.0
 */
public class DiamondVIP implements VIP{
    @Override
    public void discount() {
        System.out.println("钻石会员打6折");
    }
}
