package com.cyd.project.design.patterns.builder;

/**
 * @Description
 * @Author changyandong@e6yun.com
 * @Emoji (゜ - ゜)つ干杯
 * @Created Date: 2019/6/10 14:29
 * @ClassName OfoBikeBuilder
 * @Version: 1.0
 */
public class OfoBikeBuilder implements BikeBuilder {
    private Bike bike = new Bike();
    @Override
    public void buildFrame() {
        bike.setFrame("小黄车车架");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("小黄车车座");
    }

    @Override
    public void buildTire() {
        bike.setTire("小黄车车轮");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}
