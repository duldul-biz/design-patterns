package com.cyd.project.design.patterns.behavior.interpreter;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Description
 * @Author changyandong@e6yun.com
 * @Emoji (゜ - ゜)つ干杯
 * @Created Date: 2019/6/13 11:58
 * @ClassName InterpreterTest
 * @Version: 1.0
 */
@SpringBootTest
public class InterpreterTest {

    @Test
    public void test(){
        TwoNumber twoNumber = new TwoNumber(1,2);
        Expression expression = new Plus();
        int interpret = expression.interpret(twoNumber);
        System.out.println(interpret);
        Expression expression2 = new Minus();
        int interpret1 = expression2.interpret(twoNumber);
        System.out.println(interpret1);
    }
}
