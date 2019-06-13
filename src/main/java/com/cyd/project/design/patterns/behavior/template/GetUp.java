package com.cyd.project.design.patterns.behavior.template;

/**
 * @Description 起床接口
 * @Author changyandong@e6yun.com
 * @Emoji (゜ - ゜)つ干杯
 * @Created Date: 2019/6/12 14:08
 * @InterfaceName GetUp
 * @Version: 1.0
 */
public interface GetUp {
    /**
     * 穿衣服
     */
    void wearClothes();
    /**
     * 穿裤子
     */
    void wearPants();
    /**
     * 洗脸
     */
    void washFace();
    /**
     * 刷牙
     */
    void brushTeeth();

    /**
     * 做事
     */
    void doSomeThing();

    /**
     * 起床的过程
     */
    default void getUp(){
        wearClothes();
        wearPants();
        washFace();
        brushTeeth();
        doSomeThing();
    }
}
