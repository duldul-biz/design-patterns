package com.cyd.project.design.patterns.behavior.visitor;

/**
 * @Description
 * @Author changyandong@e6yun.com
 * @Emoji (゜ - ゜)つ干杯
 * @Created Date: 2019/6/12 14:14
 * @ClassName Visitor
 * @Version: 1.0
 */
interface Visitor {
     void visit(Wheel wheel);
     void visit(Engine engine);
     void visit(Body body);
     void visit(Car car);
 }
