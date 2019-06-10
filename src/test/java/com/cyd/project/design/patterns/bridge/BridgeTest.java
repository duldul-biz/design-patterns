package com.cyd.project.design.patterns.bridge;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Description
 * @Author changyandong@e6yun.com
 * @Emoji (゜ - ゜)つ干杯
 * @Created Date: 2019/6/10 17:43
 * @ClassName BridgeTest
 * @Version: 1.0
 */
@SpringBootTest
public class BridgeTest {

    @Test
    public void test(){
        Driver driver = new Driver();
        driver.setDriverSource(new MySqlDriverSource());
        driver.driver();
        System.out.println("--------------------------");
        driver.setDriverSource(new OracleDriverSource());
        driver.driver();
    }
}
