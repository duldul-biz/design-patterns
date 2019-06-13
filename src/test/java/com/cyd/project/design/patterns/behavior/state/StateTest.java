package com.cyd.project.design.patterns.behavior.state;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Description
 * @Author changyandong@e6yun.com
 * @Emoji (゜ - ゜)つ干杯
 * @Created Date: 2019/6/13 9:51
 * @ClassName State
 * @Version: 1.0
 */
@SpringBootTest
public class StateTest {

    @Test
    public void test(){
        Store store = new Store();
        store.buy("张三");
        store.buy("张三");
        store.buy("张三");
        store.buy("张三");
        store.buy("张三");
        store.buy("张三");
    }
}
