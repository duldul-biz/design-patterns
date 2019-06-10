package com.cyd.project.design.patterns.decorator.liqueur;

import java.math.BigDecimal;

/**
 * @Description 鸡尾酒 产品类
 * @Author changyandong@e6yun.com
 * @Emoji (゜ - ゜)つ干杯
 * @Created Date: 2019/6/10 16:34
 * @ClassName Liqueur
 * @Version: 1.0
 */
public interface Liqueur {
    BigDecimal getPrice();
    String getName();
}