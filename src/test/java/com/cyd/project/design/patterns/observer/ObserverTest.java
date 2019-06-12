package com.cyd.project.design.patterns.observer;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Description
 * @Author changyandong@e6yun.com
 * @Emoji (゜ - ゜)つ干杯
 * @Created Date: 2019/6/12 14:51
 * @ClassName ObserverTest
 * @Version: 1.0
 */
@SpringBootTest
public class ObserverTest {

    @Test
    public void test(){
        Subject subject = new Subject();
        subject.add(new MyObserver1());
        subject.add(new MyObserver2());
        subject.add(message -> System.out.println("自实现 observer3"+message));
        subject.iNotify(" 开始执行");
    }
}
