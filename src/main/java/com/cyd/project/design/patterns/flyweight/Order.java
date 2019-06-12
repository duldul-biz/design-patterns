package com.cyd.project.design.patterns.flyweight;

/**
 * @Description
 * @Author changyandong@e6yun.com
 * @Emoji (゜ - ゜)つ干杯
 * @Created Date: 2019/6/11 17:59
 * @ClassName Order
 * @Version: 1.0
 */
@FunctionalInterface
public interface Order {

    void serve();

    /**
     * @param flavourName
     * @param tableNumber
     * @return
     */
    static Order of(String flavourName, int tableNumber) {
        CoffeeFlavour flavour = CoffeeFlavour.intern(flavourName);
        return () -> System.out.println("Serving " + flavour + " to table " + tableNumber);
    }
}
