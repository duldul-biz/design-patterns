package com.cyd.project.design.patterns.create.factory.method;

import com.cyd.project.design.patterns.create.factory.BeautifulGirlFriend;
import com.cyd.project.design.patterns.create.factory.GirlFriend;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.stereotype.Service;

/**
 * @Description  这个工厂实例 生产漂亮女友
 * @Author changyandong@e6yun.com
 * @Emoji (゜ - ゜)つ干杯
 * @Created Date: 2019/6/10 11:37
 * @ClassName BeautifulGirlFriendFactory
 * @Version: 1.0
 */
@Service
@ConditionalOnMissingBean(name = "xxxx")
public class BeautifulGirlFriendFactory implements GirlFriendFactory {
    @Override
    public GirlFriend buildGirlFriend() {
        return new BeautifulGirlFriend();
    }
}
