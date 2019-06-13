package com.cyd.project.design.patterns.behavior.command;

/**
 * @Description
 * @Author changyandong@e6yun.com
 * @Emoji (゜ - ゜)つ干杯
 * @Created Date: 2019/6/12 16:52
 * @ClassName LightUpCommand
 * @Version: 1.0
 */
public class LightDownCommand implements Command {
    private Light light;

    public LightDownCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        System.out.println("灯关了");
    }
}
