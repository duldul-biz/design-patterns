package com.cyd.project.design.patterns.structure.decorator.liqueur;

import java.math.BigDecimal;

/**
 * @Description 基类 每种酒的底料
 * @Author changyandong@e6yun.com
 * @Emoji (゜ - ゜)つ干杯
 * @Created Date: 2019/6/10 16:48
 * @ClassName Primer
 * @Version: 1.0
 */
public class Primer implements Liqueur {
    @Override
    public BigDecimal getPrice() {
        return new BigDecimal(1);
    }

    @Override
    public String getName() {
        return "";
    }
}
