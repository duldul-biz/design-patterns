package com.cyd.project.design.patterns.strategy;

/**
 * @Description 开卡包机器
 * @Author changyandong@e6yun.com
 * @Emoji (゜ - ゜)つ干杯
 * @Created Date: 2019/6/12 13:57
 * @ClassName CardMachine
 * @Version: 1.0
 */
public class CardMachine {

    private CardPackage cardPackage;

    public CardMachine(CardPackage cardPackage) {
        this.cardPackage = cardPackage;
    }

    public void openCardPackage(){
        cardPackage.openCardPackage();
    }
}
