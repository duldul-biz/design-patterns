package com.cyd.project.design.patterns.proxy;

/**
 * @Description
 * @Author changyandong@e6yun.com
 * @Emoji (゜ - ゜)つ干杯
 * @Created Date: 2019/6/10 17:05
 * @ClassName Proxy
 * @Version: 1.0
 */
public class Proxy implements SourceAble {
    private Source source;

    public Proxy() {
        this.source = new Source();
    }

    @Override
    public void source() {
        before();
        source.source();
        after();
    }

    private void before() {
        System.out.println("source before !!!");
    }

    private void after() {
        System.out.println("source after !!!");
    }
}
