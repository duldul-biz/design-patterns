package com.cyd.project.design.patterns.proxy;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Description
 * @Author changyandong@e6yun.com
 * @Emoji (゜ - ゜)つ干杯
 * @Created Date: 2019/6/10 17:07
 * @ClassName ProxyTest
 * @Version: 1.0
 */
@SpringBootTest
public class ProxyTest {

    @Test
    public void testProxy(){
        SourceAble sourceAble = new Proxy();
        sourceAble.source();
    }
}
