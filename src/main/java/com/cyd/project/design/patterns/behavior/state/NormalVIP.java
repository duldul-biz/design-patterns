package com.cyd.project.design.patterns.behavior.state;

/**
 * @Description
 * @Author changyandong@e6yun.com
 * @Emoji (゜ - ゜)つ干杯
 * @Created Date: 2019/6/13 9:40
 * @ClassName NormalVIP
 * @Version: 1.0
 */
public class NormalVIP implements VIP {
    @Override
    public void discount() {
        System.out.println("普通会员不打折");
    }
}
