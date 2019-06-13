package com.cyd.project.design.patterns.behavior.visitor;

/**
 * @Description
 * @Author changyandong@e6yun.com
 * @Emoji (゜ - ゜)つ干杯
 * @Created Date: 2019/6/13 10:56
 * @ClassName Engine
 * @Version: 1.0
 */
public class Engine {
    private String name;

    public Engine(String name) {
        this.name = name;
    }

    public void accept(Visitor visitor){
        visitor.visit(this);
    }
}
