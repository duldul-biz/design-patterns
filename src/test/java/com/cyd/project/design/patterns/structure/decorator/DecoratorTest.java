package com.cyd.project.design.patterns.structure.decorator;

import com.cyd.project.design.patterns.structure.decorator.liqueur.*;
import com.cyd.project.design.patterns.structure.decorator.starbucks.*;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Description
 * @Author changyandong@e6yun.com
 * @Emoji (゜ - ゜)つ干杯
 * @Created Date: 2019/6/10 16:45
 * @ClassName DecoratorTest
 * @Version: 1.0
 */
@SpringBootTest
public class DecoratorTest {

    @Test
    public void test(){
        Liqueur liqueur = new Vodka(new Primer());
        liqueur = new Brandy(liqueur);
        liqueur = new Whisky(liqueur);
        System.out.println(liqueur.getName()+"---"+liqueur.getPrice().toString());
    }

    @Test
    public void test2(){
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription()
                + " $"+beverage.cost());

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Soy(beverage2);
        System.out.println(beverage2.getDescription()
                + " $" + beverage2.cost());

        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        System.out.println(beverage3.getDescription()
                + " $" + beverage3.cost());
    }
}
