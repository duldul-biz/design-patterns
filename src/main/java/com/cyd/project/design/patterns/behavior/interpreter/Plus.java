package com.cyd.project.design.patterns.behavior.interpreter;

/**
 * @Description
 * @Author changyandong@e6yun.com
 * @Emoji (゜ - ゜)つ干杯
 * @Created Date: 2019/6/13 11:56
 * @ClassName Plus
 * @Version: 1.0
 */
public class Plus implements Expression {
    @Override
    public int interpret(TwoNumber context) {
        return context.getNum1() + context.getNum2();
    }
}
