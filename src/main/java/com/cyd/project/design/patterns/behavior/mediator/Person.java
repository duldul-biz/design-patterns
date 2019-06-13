package com.cyd.project.design.patterns.behavior.mediator;

/**
 * @Description
 * @Author changyandong@e6yun.com
 * @Emoji (゜ - ゜)つ干杯
 * @Created Date: 2019/6/13 11:34
 * @ClassName Person
 * @Version: 1.0
 */
public abstract class Person {
    protected String name;
    protected Mediator mediator;

    public Person(String name, Mediator mediator) {
    }
}
