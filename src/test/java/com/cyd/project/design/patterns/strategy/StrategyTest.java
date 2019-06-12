package com.cyd.project.design.patterns.strategy;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Description
 * @Author changyandong@e6yun.com
 * @Emoji (゜ - ゜)つ干杯
 * @Created Date: 2019/6/12 13:51
 * @ClassName StrategyTest
 * @Version: 1.0
 */
@SpringBootTest
public class StrategyTest {

    @Test
    public void test(){
        CardPackage cardPackage = new NormalCardPackage();
        CardPackage cardPackage1 = new DiamondCardPackage();

        CardMachine cardMachine = new CardMachine(cardPackage);
        cardMachine.openCardPackage();
        cardMachine = new CardMachine(cardPackage1);
        cardMachine.openCardPackage();
    }
}
