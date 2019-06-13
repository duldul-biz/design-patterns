package com.cyd.project.design.patterns.behavior.visitor;

/**
 * @Description
 * @Author changyandong@e6yun.com
 * @Emoji (゜ - ゜)つ干杯
 * @Created Date: 2019/6/13 11:02
 * @ClassName PrintVisitor
 * @Version: 1.0
 */
public class PrintVisitor implements Visitor {
    @Override
    public void visit(Wheel wheel) {
        System.out.println(wheel);
    }

    @Override
    public void visit(Engine engine) {
        System.out.println(engine);
    }

    @Override
    public void visit(Body body) {
        System.out.println(body);
    }

    @Override
    public void visit(Car car) {
        System.out.println(car);
    }
}
