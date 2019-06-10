package com.cyd.project.design.patterns.decorator.liqueur;

import java.math.BigDecimal;

/**
 * @Description 白兰地
 * @Author changyandong@e6yun.com
 * @Emoji (゜ - ゜)つ干杯
 * @Created Date: 2019/6/10 16:43
 * @ClassName Brandy
 * @Version: 1.0
 */
public class Brandy implements Liqueur{
    private Liqueur liqueur;

    public Brandy() {
    }

    public Brandy(Liqueur liqueur) {
        this.liqueur = liqueur;
    }

    @Override
    public BigDecimal getPrice() {
        return liqueur.getPrice().add(new BigDecimal("2"));
    }

    @Override
    public String getName() {
        return liqueur.getName() + "白兰地";
    }
}
