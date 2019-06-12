package com.cyd.project.design.patterns.factory.spring;



/**
 * @Description
 * @Author changyandong@e6yun.com
 * @Emoji (゜ - ゜)つ干杯
 * @Created Date: 2019/6/12 10:29
 * @ClassName LoginInterface1
 * @Version: 1.0
 */
public class LoginInterface1 implements LoginInterface {

    private LinkManService linkManService;

    public LoginInterface1(LinkManService linkManService) {
        this.linkManService = linkManService;
    }

    @Override
    public void login() {
    }
}
