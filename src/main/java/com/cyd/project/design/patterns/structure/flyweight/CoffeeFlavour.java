package com.cyd.project.design.patterns.structure.flyweight;

import java.util.HashMap;

/**
 * @Description
 * @Author changyandong@e6yun.com
 * @Emoji (゜ - ゜)つ干杯
 * @Created Date: 2019/6/11 17:52
 * @ClassName CoffeeFlavour
 * @Version: 1.0
 */
public class CoffeeFlavour {
    private String name;
    // 享元对象
    private static final HashMap<String,CoffeeFlavour> cache = new HashMap<>();

    private CoffeeFlavour(String name) {
        this.name = name;
    }

    public static CoffeeFlavour intern(String name){
        synchronized (cache) {
            return cache.computeIfAbsent(name, CoffeeFlavour::new);
        }
    }

    public static int flavoursInCache() {
        synchronized (cache) {
            return cache.size();
        }
    }

    @Override
    public String toString() {
        return name;
    }

}
