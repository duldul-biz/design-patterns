package com.cyd.project.design.patterns.prototype;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;

/**
 * @Description
 * @Author changyandong@e6yun.com
 * @Emoji (゜ - ゜)つ干杯
 * @Created Date: 2019/6/10 15:18
 * @ClassName PrototypeTest
 * @Version: 1.0
 */
@SpringBootTest
public class PrototypeTest {

    @Test
    public void testClone(){
        ArrayList arrayList = new ArrayList();
        //浅拷贝
        ArrayList arrayList1 = arrayList;
        // 注意此处的clone是深拷贝 详情见ArrayList源码的clone方法
        arrayList.clone();
        // 这里同样是深拷贝
        ArrayList arrayList2 = new ArrayList(arrayList);
    }
    
    @Test
    public void test(){
        Prototype prototype = new Prototype();
        SerializableObject serializableObject = new SerializableObject();
        prototype.setObj(serializableObject);
        try {
            Prototype clone = (Prototype)prototype.clone();
            Prototype deepClone = (Prototype)prototype.deepClone();
            // 这里就很好的演示出了 浅拷贝和深拷贝的区别
            Assert.assertEquals(serializableObject,clone.getObj());
            Assert.assertNotEquals(serializableObject,deepClone.getObj());
            System.out.println(clone.getObj()+"----"+deepClone.getObj());
        }catch (Exception e){

        }
    }
}
