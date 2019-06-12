package com.cyd.project.design.patterns.chain;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Description
 * @Author changyandong@e6yun.com
 * @Emoji (゜ - ゜)つ干杯
 * @Created Date: 2019/6/12 16:34
 * @ClassName ChainTest
 * @Version: 1.0
 */
@SpringBootTest
public class ChainTest {

    @Test
    public void test(){
        Drink drink = new Cola().setNextDrink(new Fanta().setNextDrink(new Sprite()));
        Drink drink1 = drink.whatDrink("芬达");
        System.out.println(drink1.getDrinkName());
    }
}
