package com.cyd.project.design.patterns.template;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Description
 * @Author changyandong@e6yun.com
 * @Emoji (゜ - ゜)つ干杯
 * @Created Date: 2019/6/12 14:16
 * @ClassName TemplateTest
 * @Version: 1.0
 */
@SpringBootTest
public class TemplateTest {
    @Test
    public void test() {
        GetUp getUp = new RichManGetUp();
        GetUp getUp2 = new PoorManGetUp();
        getUp.getUp();
        getUp2.getUp();
    }
}
