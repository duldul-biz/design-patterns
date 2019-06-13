package com.cyd.project.design.patterns.structure.bridge;

/**
 * @Description
 * @Author changyandong@e6yun.com
 * @Emoji (゜ - ゜)つ干杯
 * @Created Date: 2019/6/10 17:42
 * @ClassName OracleDriverSource
 * @Version: 1.0
 */
public class OracleDriverSource implements DriverSource {
    @Override
    public void driver() {
        System.out.println("加载oracle");
    }
}
