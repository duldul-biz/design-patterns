package com.cyd.project.design.patterns.observer;

/**
 * @Description
 * @Author changyandong@e6yun.com
 * @Emoji (゜ - ゜)つ干杯
 * @Created Date: 2019/6/12 14:50
 * @ClassName MyObserver1
 * @Version: 1.0
 */
public class MyObserver1 implements Observer {
    @Override
    public void update(String message) {
        System.out.println("执行观察者1"+message);
    }
}
