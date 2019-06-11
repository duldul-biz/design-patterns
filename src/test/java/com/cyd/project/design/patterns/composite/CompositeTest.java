package com.cyd.project.design.patterns.composite;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Description
 * @Author changyandong@e6yun.com
 * @Emoji (゜ - ゜)つ干杯
 * @Created Date: 2019/6/11 10:01
 * @ClassName CompositeTest
 * @Version: 1.0
 */
@SpringBootTest
public class CompositeTest {

    @Test
    public void test(){
        // 从大到小创建对象，学院和专业组合成为学校，先创建学校，它也是机构组件
        Organization university = new University("清华大学","全国最好的大学");

        // 接着创建学院
        Organization computerCollege = new College("计算机学院","计算机学院");
        Organization infoEngineeringCollege = new College("信息工程学院","信息工程学院");

        // 计算机学院有下面专业
        computerCollege.add(new Department("计算机科学与技术","计算机科学与技术"));
        computerCollege.add(new Department("软件工程 ","软件工程"));
        computerCollege.add(new Department("网络工程","网络工程"));

        // 信息工程学院有下面专业
        infoEngineeringCollege.add(new Department("通信工程","通信工程"));
        infoEngineeringCollege.add(new Department("信息工程","信息工程"));

        // 学校有下面学院
        university.add(computerCollege);
        university.add(infoEngineeringCollege);

        // 输出学校机构信息
        OutputInfo info = new OutputInfo(university);
        info.printOrganization();
    }
}
