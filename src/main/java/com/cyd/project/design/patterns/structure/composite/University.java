package com.cyd.project.design.patterns.structure.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description  大学类
 * @Author changyandong@e6yun.com
 * @Emoji (゜ - ゜)つ干杯
 * @Created Date: 2019/6/11 9:25
 * @ClassName University
 * @Version: 1.0
 */
public class University implements Organization {
    private String name;
    private String description;
    private List<Organization> colleges = new ArrayList<>();

    public University(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public void add(Organization organization) {
        colleges.add(organization);
    }

    @Override
    public void remove(Organization organization) {
        colleges.remove(organization);
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
        System.out.println(getName());
        // 大学下面有很多学院，把他们遍历出来
        for(Organization colleges : colleges){
            colleges.print();
        }
    }
}
