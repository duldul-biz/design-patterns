package com.cyd.project.design.patterns.create.builder;

/**
 * @Description
 * @Author changyandong@e6yun.com
 * @Emoji (゜ - ゜)つ干杯
 * @Created Date: 2019/6/10 14:31
 * @ClassName MobikeBuilder
 * @Version: 1.0
 */
public class MoBikeBuilder implements BikeBuilder {
    private Bike bike = new Bike();
    @Override
    public void buildFrame() {
        bike.setFrame("摩拜车架");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("摩拜车座");
    }

    @Override
    public void buildTire() {
        bike.setTire("摩拜车轮");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}
