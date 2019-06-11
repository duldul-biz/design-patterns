package com.cyd.project.design.patterns.composite;

/**
 * @Description  专业
 * @Author changyandong@e6yun.com
 * @Emoji (゜ - ゜)つ干杯
 * @Created Date: 2019/6/11 10:00
 * @ClassName Department
 * @Version: 1.0
 */
public class Department implements Organization {
    String name;
    String description;

    public Department(String name, String description) {
        this.name = name;
        this.description = description;
    }

    // 重写机构组件的方法，其作为叶子没有增加和删除方法
    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    // 叶子只需要输出自己的信息
    @Override
    public void print() {
        System.out.println("        "+getName());
    }
}
