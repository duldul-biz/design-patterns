package com.cyd.project.design.patterns.behavior.mediator;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Description
 * @Author changyandong@e6yun.com
 * @Emoji (゜ - ゜)つ干杯
 * @Created Date: 2019/6/13 11:41
 * @ClassName MediatorTest
 * @Version: 1.0
 */
@SpringBootTest
public class MediatorTest {

    @Test
    public void test(){
        MediatorStructure mediator = new MediatorStructure();

        HouseOwner houseOwner = new HouseOwner("房东",mediator);
        Tenant tenant = new Tenant("房客",mediator);
        mediator.setHouseOwner(houseOwner);
        mediator.setTenant(tenant);
        mediator.doSomeThing("租房",houseOwner);
        mediator.doSomeThing("租房",tenant);
    }
}
