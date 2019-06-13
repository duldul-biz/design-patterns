package com.cyd.project.design.patterns.create.factory.spring;

/**
 * @Description
 * @Author changyandong@e6yun.com
 * @Emoji (゜ - ゜)つ干杯
 * @Created Date: 2019/6/12 10:30
 * @ClassName LoginInterface2
 * @Version: 1.0
 */
public class LoginInterface2 implements LoginInterface {
    @Override
    public void login() {

    }

    private LinkManService linkManService;

    public LoginInterface2(LinkManService linkManService) {
        this.linkManService = linkManService;
    }


}
