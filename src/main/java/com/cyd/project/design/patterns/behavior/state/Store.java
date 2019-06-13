package com.cyd.project.design.patterns.behavior.state;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description
 * @Author changyandong@e6yun.com
 * @Emoji (゜ - ゜)つ干杯
 * @Created Date: 2019/6/13 9:42
 * @ClassName Store
 * @Version: 1.0
 */
public class Store {

    private Map<String,VIP> map = new HashMap();
    private Map<String,Integer> buyCount = new HashMap();

    public void buy(String username){
        VIP vip = map.computeIfAbsent(username, this::setVip);
        Integer byCount = buyCount.computeIfAbsent(username, this::setByCount);
        if(byCount > 3 && byCount <= 5){
            vip = new GoldVIP();
            map.put(username,vip);
        }else if(byCount > 5){
            vip = new DiamondVIP();
            map.put(username,vip);
        }
        vip.discount();
        buyCount.put(username,++byCount);
    }

    private Integer setByCount(String s) {
        return 1;
    }

    private VIP setVip(String s) {
        return new NormalVIP();
    }
}
