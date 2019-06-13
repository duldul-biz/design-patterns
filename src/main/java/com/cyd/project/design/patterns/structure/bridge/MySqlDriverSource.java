package com.cyd.project.design.patterns.structure.bridge;

/**
 * @Description
 * @Author changyandong@e6yun.com
 * @Emoji (゜ - ゜)つ干杯
 * @Created Date: 2019/6/10 17:41
 * @ClassName MySqlDriverSource
 * @Version: 1.0
 */
public class MySqlDriverSource implements DriverSource {
    @Override
    public void driver() {
        System.out.println("加载mysql");
    }
}
