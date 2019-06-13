package com.cyd.project.design.patterns.create.factory.easy;

import com.cyd.project.design.patterns.create.factory.BeautifulGirlFriend;
import com.cyd.project.design.patterns.create.factory.GirlFriend;
import com.cyd.project.design.patterns.create.factory.UglyGirlFriend;

import java.util.Objects;

/**
 * @Description  简单工厂
 * @Author changyandong@e6yun.com
 * @Emoji (゜ - ゜)つ干杯
 * @Created Date: 2019/6/10 11:16
 * @ClassName GirlFriendFactory
 * @Version: 1.0
 */
public class GirlFriendFactory {
    /**
     *  1.普通简单工厂
     * 工厂做的事 就是生成女朋友  生成什么样的女朋友  由传入的方法决定
     * @return
     */
    public GirlFriend buildGirlfriend(String type){
        if(Objects.equals(type,"beauiful")){
            return new BeautifulGirlFriend();
        }else if(Objects.equals(type,"ugly")){
            return new UglyGirlFriend();
        }else {
            return null;
        }
    }

    /**
     * 2.一个方法对应一种女朋友  生成漂亮女朋友
     * @return
     */
    public GirlFriend buildBeautifulGirlfriend(){
        return new BeautifulGirlFriend();
    }

    /**
     * 生成随机女朋友  不好意思不上心的代价就是生成 。。。
     * @return
     */
    public GirlFriend buildRandomGirlfriend(){
        return new UglyGirlFriend();
    }

    /**
     * 3.静态方法生成
     * @return
     */
    public static GirlFriend staticBuildBeautifulGirlfriend(){
        return new BeautifulGirlFriend();
    }
}
