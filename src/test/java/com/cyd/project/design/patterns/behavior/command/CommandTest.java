package com.cyd.project.design.patterns.behavior.command;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Description
 * @Author changyandong@e6yun.com
 * @Emoji (゜ - ゜)つ干杯
 * @Created Date: 2019/6/12 16:58
 * @ClassName CommandTest
 * @Version: 1.0
 */
@SpringBootTest
public class CommandTest {

    @Test
    public void test(){
        Light light = new Light();
        Command lightDownCommand = new LightDownCommand(light);
        Command lightUpCommand = new LightUpCommand(light);
        Switch lightSwitch = new Switch();
        lightSwitch.storeAndExecute(lightDownCommand);
        lightSwitch.storeAndExecute(lightUpCommand);
    }
}
