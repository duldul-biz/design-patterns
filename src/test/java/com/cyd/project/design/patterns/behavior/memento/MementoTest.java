package com.cyd.project.design.patterns.behavior.memento;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * @Author changyandong@e6yun.com
 * @Emoji (゜ - ゜)つ干杯
 * @Created Date: 2019/6/12 17:16
 * @ClassName MementoTest
 * @Version: 1.0
 */
@SpringBootTest
public class MementoTest {

    @Test
    public void test(){
        List<Originator.Memento> mementos = new ArrayList<>();
        Originator originator = new Originator();
        originator.set("1");
        mementos.add( originator.saveToMemento());
        originator.set("2");
        originator.restoreFromMemento(mementos.get(0));
    }
}
