package com.cyd.project.design.patterns.behavior.visitor;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Description
 * @Author changyandong@e6yun.com
 * @Emoji (゜ - ゜)つ干杯
 * @Created Date: 2019/6/13 11:03
 * @ClassName VisitorTest
 * @Version: 1.0
 */
@SpringBootTest
public class VisitorTest {

    @Test
    public void test(){
        Car car = new Car("新车");
        Visitor visitor = new PrintVisitor();
        car.accept(visitor);
    }
}
