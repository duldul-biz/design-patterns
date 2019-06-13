package com.cyd.project.design.patterns.structure.decorator.liqueur;

import java.math.BigDecimal;

/**
 * @Description 威士忌
 * @Author changyandong@e6yun.com
 * @Emoji (゜ - ゜)つ干杯
 * @Created Date: 2019/6/10 16:44
 * @ClassName Whisky
 * @Version: 1.0
 */
public class Whisky implements Liqueur{
    private Liqueur liqueur;

    public Whisky() {
    }

    public Whisky(Liqueur liqueur) {
        this.liqueur = liqueur;
    }

    @Override
    public BigDecimal getPrice() {
        return liqueur.getPrice().add(new BigDecimal("2.1"));
    }

    @Override
    public String getName() {
        return liqueur.getName() + "威士忌";
    }
}
