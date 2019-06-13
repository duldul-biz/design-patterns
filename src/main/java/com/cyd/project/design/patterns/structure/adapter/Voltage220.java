package com.cyd.project.design.patterns.structure.adapter;

/**
 * @Description src类: 我们有的220V电压
 * @Author changyandong@e6yun.com
 * @Emoji (゜ - ゜)つ干杯
 * @Created Date: 2019/6/10 16:01
 * @ClassName Voltage220
 * @Version: 1.0
 */
public class Voltage220 {
    public int output220V() {
        int src = 220;
        System.out.println("我是" + src + "V");
        return src;
    }
}
