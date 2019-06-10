package com.cyd.project.design.patterns.builder;

/**
 * @Description 指挥者  构建各种类型的产品
 * @Author changyandong@e6yun.com
 * @Emoji (゜ - ゜)つ干杯
 * @Created Date: 2019/6/10 14:32
 * @ClassName BikeDirector
 * @Version: 1.0
 */
public class BikeDirector {
    private BikeBuilder bikeBuilder;

    public BikeDirector(BikeBuilder bikeBuilder) {
        this.bikeBuilder = bikeBuilder;
    }

    public Bike construct(){
        bikeBuilder.buildFrame();
        bikeBuilder.buildSeat();
        bikeBuilder.buildTire();
        return bikeBuilder.createBike();
    }
}
