package com.cyd.project.design.patterns.singleton;

/**
 * @Description  内部类实现的 单例
 * @Author changyandong@e6yun.com
 * @Emoji (゜ - ゜)つ干杯
 * @Created Date: 2019/6/10 11:55
 * @ClassName Singleton3
 * @Version: 1.0
 */
public class Singleton3 {

    private Singleton3(){

    }

    private static class Singleton3Factory{
        private static Singleton3 singleton3 = new Singleton3();
    }

    public static Singleton3 getInstance(){
        return Singleton3Factory.singleton3;
    }
}
