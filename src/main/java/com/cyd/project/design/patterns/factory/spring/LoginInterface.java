package com.cyd.project.design.patterns.factory.spring;


/**
 * @Description
 * @Author changyandong@e6yun.com
 * @Emoji (゜ - ゜)つ干杯
 * @Created Date: 2019/6/12 10:29
 * @InterfaceName LoginInterface
 * @Version: 1.0
 */
public interface LoginInterface {
    void login();

    default void lll() throws NoSuchFieldException {
        throw new NoSuchFieldException();
    }
}
