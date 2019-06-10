package com.cyd.project.design.patterns.factory;

/**
 * @Description
 * @Author changyandong@e6yun.com
 * @Emoji (゜ - ゜)つ干杯
 * @Created Date: 2019/6/10 11:21
 * @ClassName UglyGirlFriend
 * @Version: 1.0
 */
public class UglyGirlFriend implements GirlFriend {
    @Override
    public void kiss() {
        System.out.println("难过");
    }
}
