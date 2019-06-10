package com.cyd.project.design.patterns.decorator.liqueur;

import java.math.BigDecimal;

/**
 * @Description 伏特加
 * @Author changyandong@e6yun.com
 * @Emoji (゜ - ゜)つ干杯
 * @Created Date: 2019/6/10 16:41
 * @ClassName Vodka
 * @Version: 1.0
 */
public class Vodka implements Liqueur {
    private Liqueur liqueur;

    public Vodka() {
    }

    public Vodka(Liqueur liqueur) {
        this.liqueur = liqueur;
    }

    @Override
    public BigDecimal getPrice() {
        return liqueur.getPrice().add(new BigDecimal("1"));
    }

    @Override
    public String getName() {
        return liqueur.getName() + "伏特加";
    }
}
