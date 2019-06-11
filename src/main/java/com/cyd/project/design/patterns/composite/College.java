package com.cyd.project.design.patterns.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description  学院类
 * @Author changyandong@e6yun.com
 * @Emoji (゜ - ゜)つ干杯
 * @Created Date: 2019/6/11 9:58
 * @ClassName College
 * @Version: 1.0
 */
public class College implements Organization {

    String name;
    String description;
    List<Organization> departments = new ArrayList<>();

    public College(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public void add(Organization organization) {
        departments.add(organization);
    }

    @Override
    public void remove(Organization organization) {
        departments.remove(organization);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void print() {
        System.out.println("    " + getName());
        // 学院下面有很多专业，把他们遍历出来
        for(Organization department : departments){
            department.print();
        }
    }
}
