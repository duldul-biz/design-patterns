package com.cyd.project.design.patterns.create.singleton;

/**
 * @Description  饿汉模式
 * @Author changyandong@e6yun.com
 * @Emoji (゜ - ゜)つ干杯
 * @Created Date: 2019/6/10 11:54
 * @ClassName Singleton2
 * @Version: 1.0
 */
public class Singleton2 {

    private static Singleton2 singleton2 = new Singleton2();

    private Singleton2(){

    }

    public static Singleton2 getInstance(){
        return Singleton2.singleton2;
    }
}
