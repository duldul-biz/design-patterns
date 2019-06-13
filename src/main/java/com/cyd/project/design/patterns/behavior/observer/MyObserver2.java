package com.cyd.project.design.patterns.behavior.observer;

/**
 * @Description
 * @Author changyandong@e6yun.com
 * @Emoji (゜ - ゜)つ干杯
 * @Created Date: 2019/6/12 14:50
 * @ClassName MyObserver2
 * @Version: 1.0
 */
public class MyObserver2 implements Observer {
    @Override
    public void update(String message) {
        System.out.println("执行观察者2"+message);
    }
}
