package com.cyd.project.design.patterns.singleton;

/**
 * @Description 懒汉
 * @Author changyandong@e6yun.com
 * @Emoji (゜ - ゜)つ干杯
 * @Created Date: 2019/6/10 11:38
 * @ClassName SingLeton1
 * @Version: 1.0
 */
public class Singleton1 {
    private static Singleton1 singleton1 = null;

    private Singleton1() {

    }

    /**
     * 最简单的单例模式
     *
     * @return
     */
    public static Singleton1 instance() {
        if (singleton1 == null) {
            singleton1 = new Singleton1();
        }
        return singleton1;
    }

    /**
     * 线程安全的额单例 但是每次获取对象 都加锁 性能差
     *
     * @return
     */
    public static synchronized Singleton1 instance2() {
        if (singleton1 == null) {
            singleton1 = new Singleton1();
        }
        return singleton1;
    }

    /**
     * 性能提高 但是可能在多线程环境下产生意想不到的问题
     *
     * @return
     */
    public static Singleton1 instance3() {
        if (singleton1 == null) {
            synchronized (singleton1) {
                if (singleton1 == null) {
                    singleton1 = new Singleton1();
                }
            }
        }
        return singleton1;
    }

    /**
     * 线程安全且性能高
     * @return
     */
    public static Singleton1 instance5() {
        if (singleton1 == null) {
            tryInstance();
        }
        return singleton1;
    }

    private static synchronized void tryInstance() {
        if (singleton1 == null) {
            singleton1 = new Singleton1();
        }
    }
}
