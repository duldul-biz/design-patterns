package com.cyd.project.design.patterns.adapter;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Description
 * @Author changyandong@e6yun.com
 * @Emoji (゜ - ゜)つ干杯
 * @Created Date: 2019/6/10 16:04
 * @ClassName AdapterTest
 * @Version: 1.0
 */
@SpringBootTest
public class AdapterTest {
    @Test
    public void testVoltage(){
        Voltage5 voltage5 = new VoltageAdapter();
        voltage5.output5V();
    }
}
