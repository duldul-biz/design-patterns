package com.cyd.project.design.patterns.adapter;

/**
 * @Description
 * @Author changyandong@e6yun.com
 * @Emoji (゜ - ゜)つ干杯
 * @Created Date: 2019/6/10 16:18
 * @ClassName Adapter2
 * @Version: 1.0
 */
public interface Adapter2 extends Adapter1{
    @Override
    default int adapter(){
        return 0;
    }
}
