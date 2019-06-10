package com.cyd.project.design.patterns.facade;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Description
 * @Author changyandong@e6yun.com
 * @Emoji (゜ - ゜)つ干杯
 * @Created Date: 2019/6/10 17:19
 * @ClassName FacadeTest
 * @Version: 1.0
 */
@SpringBootTest
public class FacadeTest {

    @Test
    public void test(){
        Computer computer = new Computer();
        computer.startup();
        try {
            Thread.sleep(1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        computer.shutdown();
    }
}
