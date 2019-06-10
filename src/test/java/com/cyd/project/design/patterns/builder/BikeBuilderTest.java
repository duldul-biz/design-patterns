package com.cyd.project.design.patterns.builder;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Description
 * @Author changyandong@e6yun.com
 * @Emoji (゜ - ゜)つ干杯
 * @Created Date: 2019/6/10 14:35
 * @ClassName BikeBuilderTest
 * @Version: 1.0
 */
@SpringBootTest
public class BikeBuilderTest {

    @Test
    public void testBikeDirector(){
        BikeDirector bikeDirector = new BikeDirector(new MoBikeBuilder());
        Bike bike = bikeDirector.construct();
        System.out.println(bike);
    }

    @Test
    public void testBikeBuilderConstruct(){
        BikeBuilder bikeBuilder = new OfoBikeBuilder();
        Bike bike = bikeBuilder.construct();
        System.out.println(bike);
    }

    @Test
    public void testApiResultBeanBuilder(){
        ApiResultBean build = ApiResultBean.from().code(1).message("333").build();
        System.out.println(build);
    }
}


