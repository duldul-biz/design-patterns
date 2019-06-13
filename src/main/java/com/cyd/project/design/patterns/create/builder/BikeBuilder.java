package com.cyd.project.design.patterns.create.builder;

/**
 * @Description  自行车构造器
 * @Author changyandong@e6yun.com
 * @Emoji (゜ - ゜)つ干杯
 * @Created Date: 2019/6/10 14:28
 * @InterfaceName BikeBuilder
 * @Version: 1.0
 */
public interface BikeBuilder {
    /**
     * 构建车架
     */
    void buildFrame();

    /**
     * 构建车座
     */
    void buildSeat();

    /**
     * 构建车轮
     */
    void buildTire();

    /**
     * 创建自行车
     *
     * @return
     */
    Bike createBike();

    /**
     * 将指挥者的工作交给自己   不符合单一职责原则  减少了类，但是如果产品分支众多不适用
     * @return
     */
    default Bike construct() {
        this.buildFrame();
        this.buildSeat();
        this.buildTire();
        return this.createBike();
    }
}
